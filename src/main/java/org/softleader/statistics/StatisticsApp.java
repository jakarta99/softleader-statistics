package org.softleader.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { StatisticsApp.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class StatisticsApp extends SpringBootServletInitializer { // extends SpringBootServletInitializer to Create a deployable war file

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StatisticsApp.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(StatisticsApp.class, args);
	}
}
