package org.fantasizer.openapi.auth;

/**
 * A class to hold access token and refresh token.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
public class TokenPair {

	private String access;

	private String refresh;

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}

}
