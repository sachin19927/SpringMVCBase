package com.sample.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourceCodeConstriantValidator.class) // Adding Constraint on top of a contraint which need to validate Rules of Custom class wr bussiness rule written in CourceCodeConstriantValidator
@Target({ElementType.METHOD,ElementType.FIELD})  // wr can we apply we can apply on method and feild
@Retention(RetentionPolicy.RUNTIME)  // how long annotaion will stored/Used  ->reatain this annotaion in java class file process it at runtime by JVM
public @interface CourceCode {  // Syntax
 
	//define attributes to pass it our annotaions
	// define default cource code
	//public String value() default "LUV";
	// incase mulptiple validation
	public String[] value() default {"LUV"};  
	
	// define default error msg
	public String message() default "Must start With LUV";
	
	// define default groups  -> can grp related constraints
	public Class<?>[] groups() default {};
	
	// define default payloads  -> provide custom deatils about validation failure(security level,error code )
	public Class<? extends  Payload>[] payload() default {};		
	
} 
