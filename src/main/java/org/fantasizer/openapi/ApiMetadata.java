package org.fantasizer.openapi;

import java.lang.reflect.Method;

/**
 * The metadata class of the API,which define normal properties.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
public interface ApiMetadata {

	/***
	 * Acquire the ApiService object,in another word,acquire the business object.
	 * 
	 * NOTE:Maybe this method should design again.
	 * 
	 * @return
	 */
	Object getHandler();

	/**
	 * Acquire the method of ApiService Object.
	 * 
	 * @return
	 */
	Method getMethod();

	/**
	 * Acquire the class type of arguments which pass to the method.
	 * 
	 * @return
	 */
	Class<?> getMethodArgumentsClass();

	/**
	 * Acquire the name of API.
	 * 
	 * @return
	 */
	String getName();

	/**
	 * Acquire the version of API.
	 * 
	 * @return
	 */
	String getVersion();

	/**
	 * Whether this API need sign.
	 * 
	 * @return
	 */
	boolean needSign();

	/**
	 * Whether this API need validate.
	 * 
	 * @return
	 */
	boolean needValidate();

	/**
	 * Whether this API wrap the result.
	 * 
	 * @return
	 */
	boolean wrapResult();

	/**
	 * Whether this API need return the result. default true.
	 * 
	 * @return
	 */
	boolean needReturn();

	/**
	 * Whether this API need JWT.
	 * 
	 * @return
	 */
	boolean needJWT();

	/**
	 * Whether this API need token.
	 * 
	 * @return
	 */
	boolean needToken();

}
