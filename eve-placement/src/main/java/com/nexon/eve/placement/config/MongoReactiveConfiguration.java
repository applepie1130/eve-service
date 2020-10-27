package com.nexon.eve.placement.config;

import com.nexon.eve.placement.repository.BaseMongoRepositoryPackageLocation;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = BaseMongoRepositoryPackageLocation.class)
public class MongoReactiveConfiguration {
}
