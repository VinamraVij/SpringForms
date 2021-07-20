package com.mvcproject.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;





public class PhoneNoConstraintValidator implements ConstraintValidator<PhoneNo, String> {

	public String phoneNo;
	@Override
	public void initialize(PhoneNo thePhoneNo) {
		// TODO Auto-generated method stub
		phoneNo=thePhoneNo.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		
		
		return false;
	}

}
