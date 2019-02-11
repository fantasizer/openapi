package org.fantasizer.openapi.jwt;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.fantasizer.openapi.ApiConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;

public class StandardJwtService implements JwtService {

	private static Logger logger = LoggerFactory.getLogger(StandardJwtService.class);

	private static Map<String, Object> headerClaims = new HashMap<>();

	static {
		// TODO: confirm the keys depends JWT docs.
		headerClaims.put("type", "JWT");
		headerClaims.put("algorithm", "HS256");
	}

	private ApiConfig apiConfig;

	@Override
	public void setApiConfig(ApiConfig apiConfig) {
		this.apiConfig = apiConfig;
	}

	@Override
	public ApiConfig getApiConfig() {
		return this.apiConfig;
	}

	@Override
	public String createJWT(Map<String, String> data) {
		Assert.notNull(this.apiConfig, "The ApiConfig not initialized!");

		Builder builder = JWT.create().withHeader(headerClaims);
		
		Set<Entry<String, String>> entrySet = data.entrySet();
		for(Entry<String,String> entry:entrySet) {
			builder.withClaim(entry.getKey(), entry.getValue());
		}
		
		Calendar expireTime = Calendar.getInstance();

		
//		return builder.withExpiresAt(expireTime.getTime())
//				.withIssuedAt(new Date())
//		
		
		
		return null;
	}

	@Override
	public Map<String, Claim> verifyJWT(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
