package com.api.tests;

import java.net.Authenticator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	 @Test(description = "Verfy the Account creation API")
	 
	 public void createAccountTest() {
		 //This is the benefit of the builder design pattern 
		 //as we can pass the parameter in any order
		SignUpRequest signUpRequest = new SignUpRequest.Builder().userName("Test")
		.email("byd1@example.com")
		.firstName("Zing")
		.password("Test1234")
		.lastName("test")
		.mobileNumber("9876543211")
		.build();
		
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		Assert.assertEquals(response.statusCode(), 200);
	
	 }

}
