package com.sample.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author r.m.ghimis
 * @since Sep 25, 2023
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(Role.KEY_SPACE)
public class Role {

	public static final String KEY_SPACE = "security-role";

	@Id
	@EqualsAndHashCode.Include
	private ObjectId id;
	
}
