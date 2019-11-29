package com.sample.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
// ConstraintValidator<CourceCode, String> // pass the courceCode annotaions and type of data vaidate agianst
public class CourceCodeConstriantValidator implements ConstraintValidator<CourceCode, String>{
	// define CoursePreFix that will validate against it
	//private String coursePrefix; 
	//In case of Mulptile validator
	private String[] coursePrefix; 
	
	// intailz mtd so when they create a validtor it will intailze  // basilcally sets everything
	@Override
	public void initialize(CourceCode theCourceCode) {
		coursePrefix=theCourceCode.value(); // assaign the value from passed in form our annotaion
	}
	// theCode is data entered by user 
	//ConstraintValidatorContext constraintValidatorContext -> we can add additional error msgs
	// spring MVC will cl at run time user submitted - so chak isValid Method
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		// need to check for null or else we will get null pointer exception during runtime
		// singel validator
		/*
		 * boolean result; if(theCode!=null) { result= theCode.startsWith(coursePrefix);
		 * } else { result= true; } return result;
		 */
		boolean result=false;
		 if (theCode != null) {
	            // loop thru course prefixes
	            // check to see if code matches any of the course prefixes
	            for (String tempPrefix : coursePrefix) {
	                result = theCode.startsWith(tempPrefix);
	                
	                // if we found a match then break out of the loop
	                if (result) {
	                    break;
	                }
	            }
	        }
	        else {
	            result = true;
	        }
		 return result;
	}

}
