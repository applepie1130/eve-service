package com.nexon.eve.contents.config;

import com.nexon.eve.contents.repository.BaseMongoRepositoryPackageLocation;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = BaseMongoRepositoryPackageLocation.class)
public class MongoReactiveConfiguration {
}
