/**
 * 
 */
package com.example.ledger.swagger;

import io.swagger.annotations.Contact;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

/**
   Nov 13, 2020
 * @author DGS1Q0
 *
 */


@SwaggerDefinition(
        info =  @io.swagger.annotations.Info(
                description = "Awesome Resources",
                version = "V12.0.12",
                title = "Awesome Resource API",
                contact = @Contact(
                   name = "Abhishek Singh", 
                   email = "abhishek.singh@usps.gov", 
                   url = "http://localhost:8085/v2/api-docs"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS}
       // externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://localhost:8085/v2/api-docs")
)


public interface APIDocConfig {
	
	
	

}
