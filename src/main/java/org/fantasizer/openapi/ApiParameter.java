package org.fantasizer.openapi;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * The default parameter implement class which contains the parameters when call
 * an API.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
@SuppressWarnings("serial")
public class ApiParameter extends JSONObject implements Parameter {

	private boolean needSign;

	private boolean needValidate;

	private String restName;

	private String restVersion;

	public String getSignAndRemove() {
		String sign = this.getSign();
		this.remove(ParameterNames.SIGN_NAME);
		return sign;
	}

	public HttpServletRequest getRequest() {
		// TODO:

		return null;
	}

	public ApiParameter(Map<String, Object> parameters) {
		super(parameters);
	}

	public boolean isNeedSign() {
		return needSign;
	}

	public void setNeedSign(boolean needSign) {
		this.needSign = needSign;
	}

	public boolean isNeedValidate() {
		return needValidate;
	}

	public void setNeedValidate(boolean needValidate) {
		this.needValidate = needValidate;
	}

	@Override
	public String getName() {
		String name = this.getString(ParameterNames.API_NAME);
		return name == null ? this.restName : name;
	}

	public void setName(String name) {
		this.restName = name;
	}

	@Override
	public String getVersion() {
		String version = this.getString(ParameterNames.VERSION_NAME);
		return version == null ? this.restVersion : version;
	}

	public void setVersion(String version) {
		this.restVersion = version;
	}

	public String getNameVersion() {
		return buildNameVersion(this.getName(), this.getVersion());
	}

	public static String buildNameVersion(String name, String version) {
		if (StringUtils.isEmpty(version)) {
			return name;
		} else {
			return name + version;
		}
	}

	@Override
	public String getAppKey() {
		return this.getString(ParameterNames.APP_KEY_NAME);
	}

	public void setAppKey(String appKey) {
		this.put(ParameterNames.APP_KEY_NAME, appKey);
	}

	@Override
	public String getData() {
		return this.getString(ParameterNames.DATA_NAME);
	}

	public void setData(String json) {
		this.put(ParameterNames.DATA_NAME, json);
	}

	@Override
	public String getTimestamp() {
		return this.getString(ParameterNames.TIMESTAMP_NAME);
	}

	public void setTimestamp(String timestamp) {
		this.put(ParameterNames.TIMESTAMP_NAME, timestamp);
	}

	@Override
	public String getSign() {
		return this.getString(ParameterNames.SIGN_NAME);
	}

	public void setSign(String sign) {
		this.put(ParameterNames.SIGN_NAME, sign);
	}

	@Override
	public String getFormat() {
		String format = this.getString(ParameterNames.FORMAT_NAME);
		if (StringUtils.isEmpty(format)) {
			return Constants.FORMAT_JSON;
		}
		return format;
	}

	public void setFormat(String format) {
		this.put(ParameterNames.FORMAT_NAME, format);
	}

	@Override
	public String getAccessToken() {
		return this.getString(ParameterNames.ACCESS_TOKEN_NAME);
	}

	@Override
	public String getSignMethod() {
		String signMethod = this.getString(ParameterNames.SIGN_METHOD_NAME);
		if (StringUtils.isEmpty(signMethod)) {
			return Constants.DEFAULT_SIGN_METHOD;
		}

		return signMethod;
	}

	@Override
	public Object clone() {
		ApiParameter parameter = new ApiParameter(this);
		parameter.needSign = this.needSign;
		parameter.needValidate = this.needValidate;
		return parameter;
	}
}
