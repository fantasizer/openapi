package org.fantasizer.openapi;

public interface Validator extends ApiConfigHolder {

	void validate(ApiParameter parameter);

	void validateBusinessParameter(Object parameter);

}
