package com.sample;

import java.security.Security;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories(basePackages = { "com.sample.repository" }, repositoryImplementationPostfix = "CustomImpl")
@SpringBootApplication
public class ApplicationEntryPoint {

	public static void main(String[] args) throws Exception {
		Security.addProvider(new BouncyCastleProvider());
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.ofOffset("UTC", ZoneOffset.UTC)));
		SpringApplication.run(ApplicationEntryPoint.class, args);
	}
	
}