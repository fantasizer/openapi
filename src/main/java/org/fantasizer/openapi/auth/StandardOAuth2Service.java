package org.fantasizer.openapi.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.fantasizer.openapi.ApiConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * The default OAuth2Service implement class.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
public class StandardOAuth2Service implements OAuth2Service {

	private final static Logger logger = LoggerFactory.getLogger(StandardOAuth2Service.class);

	private final static String TOKEN_TYPE = "Bearer";

	private OAuthIssuer oauthIssuer = new OAuthIssuerImpl(new MD5Generator());

	private OAuth2Manager oauth2Manager;

	private boolean checkClientId(String clientId, ApiConfig apiConfig) {
		// TODO:
		return true;
	}

	@Override
	public OAuthResponse authorize(HttpServletRequest request, HttpServletResponse response, ApiConfig apiConfig)
			throws Exception {
		OAuthAuthzRequest authAuthzRequest = new OAuthAuthzRequest(request);
		// if the client id is invalid
		if (!this.checkClientId(authAuthzRequest.getClientId(), apiConfig)) {
			return OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
					.setError(OAuthError.TokenResponse.INVALID_CLIENT)
					.setErrorDescription(OAuthError.TokenResponse.INVALID_CLIENT).buildJSONMessage();
		}

		// check the user is login or not.

		OpenUser user = oauth2Manager.login(request);

		return null;
	}

	@Override
	public OAuthResponse accessToken(HttpServletRequest request, ApiConfig apiConfig) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOAuth2Manager(OAuth2Manager auth2Manager) {
		// TODO Auto-generated method stub

	}

}
