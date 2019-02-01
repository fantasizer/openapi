package org.fantasizer.openapi.auth;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.fantasizer.openapi.ApiConfig;

/**
 * 
 * TODO: add the documents.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
public interface OAuth2Manager {

	void addAuthCode(String code, OpenUser openUser);

	void addAccessToken(String accessToken, String refreshToken, OpenUser openUser, Long expires);

	void removeAccessToken(String accessToken);

	void removeRefreshToken(String refreshToken);

	RefreshToken geRefreshToken(String refreshToken);

	boolean checkAuthCode(String authCode);

	OpenUser getUserByAuthCode(String authCode);

	Map<String, String> getParameters(OpenUser openUser);

	Long getExpire(ApiConfig apiConfig);

	OpenUser login(HttpServletRequest request) throws Exception;
}
