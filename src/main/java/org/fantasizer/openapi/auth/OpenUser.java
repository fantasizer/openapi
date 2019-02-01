package org.fantasizer.openapi.auth;

import java.io.Serializable;

/**
 * 
 *	if want to acquire the oAuth2's ability,implements this interface.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
public interface OpenUser extends Serializable {

	String getUserName();

}
