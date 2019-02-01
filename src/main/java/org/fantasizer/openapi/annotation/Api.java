package org.fantasizer.openapi.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A annotation used in methods of service classes.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Api {

	/**
	 * The name of API.
	 * 
	 * Advice name it like business.module.object.action.
	 * 
	 * for example: 'charge.user.money.search'.
	 * 
	 * @return
	 */
	String name();

	/**
	 * The version of the API. Name it like linux versions.
	 * 
	 * @return
	 */
	String version() default "";

	/**
	 * If the API need validate sign information.default true.
	 * 
	 * @return
	 */
	boolean needSign() default true;

	/**
	 * If the API need validate when called. default true.
	 * 
	 * @return
	 */
	boolean needValidate() default true;

	/**
	 * If the API wrap business result. default true.
	 * 
	 * @return
	 */
	boolean wrapResult() default true;

	/**
	 * If the API return JSON to client.default true.
	 * 
	 * if set this parameter to false,should call ApiContext.getResponse to get the
	 * result.
	 * 
	 * @return
	 */
	boolean needReturn() default true;

	/**
	 * Whether this API need JWT auth.
	 * 
	 * @return
	 */
	boolean needJWT() default true;

	/**
	 * Whether this API need token, default true.
	 * 
	 * @return
	 */
	boolean needToken() default true;

}
