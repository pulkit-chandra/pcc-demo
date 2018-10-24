package io.pivotal.sample.demo.config;


import io.pivotal.sample.demo.model.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableSsl;
import org.springframework.geode.config.annotation.UseMemberName;

@Configuration
@Profile("!tls")
@UseMemberName(name = "GeodeClient")
@EnableEntityDefinedRegions(basePackageClasses = Customer.class)
public class GeodeConfig {
}
