package com.api.tests;

import java.net.Authenticator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class ForgotPassword {
	
	 @Test(description = "Verfy the Forgot Password functionality")
	 
	 public void forgotPassword() {
		AuthService authservice = new AuthService();
		Response response = authservice.fogotPassword("testforgot123@gmail.com");
		System.out.println(response.asPrettyString());
		
		
	 }

}
