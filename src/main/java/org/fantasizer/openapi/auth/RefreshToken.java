package org.fantasizer.openapi.auth;

import java.io.Serializable;

/**
 * A token class used to refresh.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
@SuppressWarnings("serial")
public class RefreshToken implements Serializable {

	/**
	 * the token for accessing.
	 */
	private String access;

	private OpenUser openUser;

	public RefreshToken(String access, OpenUser openUser) {
		super();
		this.access = access;
		this.openUser = openUser;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public OpenUser getOpenUser() {
		return openUser;
	}

	public void setOpenUser(OpenUser openUser) {
		this.openUser = openUser;
	}

}
