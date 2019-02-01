package org.fantasizer.openapi;

import java.io.Serializable;

public interface Parameter extends Serializable {

	String getName();

	String getVersion();

	String getAppKey();

	String getData();

	String getTimestamp();

	String getSign();

	String getFormat();

	String getAccessToken();

	String getSignMethod();
}
