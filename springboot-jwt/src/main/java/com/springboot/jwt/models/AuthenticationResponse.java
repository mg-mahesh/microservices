package com.springboot.jwt.models;

public class AuthenticationResponse {

	 private final String jwt;
	 
	 
	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	/**
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}
	 
	 
}
