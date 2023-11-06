package com.sample.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author i.a.pricina
 * @since Sep 14, 2023
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(ApiToken.KEY_SPACE)
public class ApiToken {
	
	public static final String KEY_SPACE = "api-token-keyspace";
	
	@Id
	protected ObjectId id;

}
