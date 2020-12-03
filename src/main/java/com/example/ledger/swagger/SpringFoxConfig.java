/**
 * 
 */
package com.example.ledger.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 

/**
   Nov 13, 2020
 * @author DGS1Q0
 *
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfig   {
	
	
	public static final Contact DEFAULT_CONTACT = new Contact(
	        "Sample App", "http://www.sample.com", "sample@gmail.com");

	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
	        "Awesome API Title", "Awesome API Description", "1.0",
	        "urn:tos", DEFAULT_CONTACT,
	        "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Arrays.asList());

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
	        new HashSet<String>(Arrays.asList("application/json",
	                "application/xml"));
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          //.apis(RequestHandlerSelectors.any())   
          .apis(RequestHandlerSelectors.basePackage("com.example.ledger"))
          .paths(PathSelectors.any())                          
          .build()
          //.pathMapping("/")
          //.enableUrlTemplating(false)
          .apiInfo(apiInfo());
          //.produces(DEFAULT_PRODUCES_AND_CONSUMES)
          //.consumes(DEFAULT_PRODUCES_AND_CONSUMES);                                           
    }
 	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	    registry.addResourceHandler("swagger-ui.html")
//	      .addResourceLocations("classpath:/META-INF/resources/");
//	 
//	    registry.addResourceHandler("/webjars/**")
//	      .addResourceLocations("classpath:/META-INF/resources/webjars/");
//	}
	
	
	  private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Demo API tutorial")
	                .description("Ledger Application")
	                .contact(new Contact("Abhishek Singh" , "eta-suport.usps.gov" , "abhishek.singh@usps.gov"))
	                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open") 
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
	                .version("2.0")
	                .build();
	    }
 	
	
	 

}
