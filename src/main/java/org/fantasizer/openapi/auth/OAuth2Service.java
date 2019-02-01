package org.fantasizer.openapi.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.fantasizer.openapi.ApiConfig;

public interface OAuth2Service {

	/**
	 * Authorize by OAuth2 and acquire the code.
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	OAuthResponse authorize(HttpServletRequest request, HttpServletResponse response, ApiConfig apiConfig)
			throws Exception;

	/**
	 * Acquire the access token by code.
	 * 
	 * @param request
	 * @param apiConfig
	 * @return
	 * @throws Exception
	 */
	OAuthResponse accessToken(HttpServletRequest request, ApiConfig apiConfig) throws Exception;

	/**
	 * Set the OAuth2Manager
	 * 
	 * @param auth2Manager
	 */
	void setOAuth2Manager(OAuth2Manager auth2Manager);
}
