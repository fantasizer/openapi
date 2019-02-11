package org.fantasizer.openapi.jwt;

import java.util.Map;

import org.fantasizer.openapi.ApiConfigHolder;

import com.auth0.jwt.interfaces.Claim;

public interface JwtService extends ApiConfigHolder {

	/**
	 * depends on the 'KV' data, create JWT string.
	 * 
	 * @param data
	 * @return
	 */
	String createJWT(Map<String, String> data);

	/**
	 * Verify the JWT string.
	 * 
	 * @param toekn
	 * @return
	 */
	Map<String, Claim> verifyJWT(String token);

}
