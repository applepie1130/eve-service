package com.nexon.eve.gateway;

import com.nexon.eve.core.EveCoreBasePackageLocation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = EveCoreBasePackageLocation.class)
public class EveGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EveGatewayApplication.class, args);
	}

}
