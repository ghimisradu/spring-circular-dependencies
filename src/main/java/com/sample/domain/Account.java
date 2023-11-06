package com.sample.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author r.m.ghimis
 * @since Nov 6, 2023
 */

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(Account.KEY_SPACE)
public class Account {

	public static final String KEY_SPACE = "accounts";
	
	@Id
	private ObjectId id;
}
