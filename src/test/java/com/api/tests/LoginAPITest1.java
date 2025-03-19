package com.api.tests;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import io.restassured.response.Response;


public class LoginAPITest1 {
	@Test(description = "Verfy Login API")
	public void loginTest() {
		
		AuthService authService = new AuthService();
		Response response = authService.login("{\"username\": \"uday1234\", \"password\": \"uday12345\"}");
		System.out.println(response.asPrettyString());

	}

}
