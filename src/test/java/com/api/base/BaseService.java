package com.api.base;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Base URI
//Request specification
//Request creation
//Response handling
public class BaseService { //  Wrapper for Rest Assured
	
	//Defining the constant
	//Base URI
	//Creating the request
	//Handling the response
	
	private static final String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	//Initialize the instance variable
	public BaseService() 
	{
		requestSpecification = given().baseUri(BASE_URL);
	}
	
	protected Response postRequest(Object payload, String endpoint)
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	protected Response postRequest(String baseUrl, Object payload, String endpoint)
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

}
