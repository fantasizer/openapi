package org.fantasizer.openapi.bean;

import java.lang.reflect.Method;

import org.fantasizer.openapi.ApiMetadata;

public class ApiDefinition implements ApiMetadata{
	
	private String name;
	
	private String version;
	
	private String description;
	
	private String moduleName;
	
	private int order;
	
	private Object handler;
	
	private Method method;
	
	private Class<?> methodArgumentsClass;
	
	private boolean needSign;
	
	private boolean needValidate;
	
	private boolean needJWT;
	
	private boolean wrapResult = true;
	
	private boolean singleParameter;
	
	private boolean needReturn;

	@Override
	public Object getHandler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Method getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getMethodArgumentsClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean needSign() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needValidate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wrapResult() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needReturn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needJWT() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needToken() {
		// TODO Auto-generated method stub
		return false;
	}

}
