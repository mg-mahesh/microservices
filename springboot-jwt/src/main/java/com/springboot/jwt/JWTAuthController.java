package com.springboot.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jwt.models.AuthenticationRequest;
import com.springboot.jwt.models.AuthenticationResponse;
import com.springboot.jwt.service.MyUserDetailsService;
import com.springboot.jwt.utils.JWTUtils;

@RestController
public class JWTAuthController {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private MyUserDetailsService myUserDeatilsService;
	
	@Autowired
	private JWTUtils jwtUtils;

	@GetMapping("/helloJWT")
	public String hello() {
		return "Hello JWT";
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest request) throws Exception{
		try {
			authManager
				.authenticate(new 
						UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		}catch (BadCredentialsException e) {
			throw new Exception("Incorrect Username or Password", e);
		}
		
		final UserDetails userDetails = myUserDeatilsService.loadUserByUsername(request.getUsername());
		final String jwt = jwtUtils.generateToken(userDetails);
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(jwt), HttpStatus.OK);
	}
}
