package org.fantasizer.openapi.limit;

/**
 * 
 * limit strategy
 * 
 * @author quxiaoyong 2019年2月11日
 *
 */
public enum LimitType {

	LIMIT("LIMIT"),

	TOKEN_BUCKET("TOKEN_BUCKET");

	private String type;

	LimitType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

}
