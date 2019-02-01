package org.fantasizer.openapi.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Service;

/**
 * 
 * Annotation a class to own the ability to provide interface.
 * 
 * This annotation can be managed by Spring,because of it extends @Service.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Service
public @interface ApiService {

	/**
	 * 
	 * Whether this API need validate the sign when called or not.
	 * 
	 * @return
	 */
	boolean needSign() default true;

	/**
	 * Whether this API need validate.
	 * 
	 * @return
	 */
	boolean needValidate() default true;

	/**
	 * Whether this API wrap the result. default true.
	 * 
	 * @return
	 */
	boolean wrapResult() default true;

}
