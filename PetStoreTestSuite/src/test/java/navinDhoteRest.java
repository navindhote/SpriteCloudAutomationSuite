import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class navinDhoteRest {
	String id;

	@Test(priority = 1)
	public void loginRequest() {
		
		RestAssured.baseURI="https://petstore.swagger.io/#/user/loginUser";
		 given().log().all().header("Content-Type","application/json").auth().preemptive().basic("NavinDhote", "navin214")
		 .when().get().
		 then().log().all().assertThat().statusCode(200);	
	}
	
	@Test(priority = 2)
	public void userCreationRequest() {
		RestAssured.baseURI="https://petstore.swagger.io/";
		
		 String R=given().log().all().header("Content-Type","application/json").header("accept","application/json").body("{\r\n"
		 		+ "  \"id\": 0,\r\n"
		 		+ "  \"username\": \"NavinDhote\",\r\n"
		 		+ "  \"firstName\": \"Navin Ajit\",\r\n"
		 		+ "  \"lastName\": \"Dhote\",\r\n"
		 		+ "  \"email\": \"navin.dhote214@gmail.com\",\r\n"
		 		+ "  \"password\": \"navin214\",\r\n"
		 		+ "  \"phone\": \"+371 28131908\",\r\n"
		 		+ "  \"userStatus\": 0\r\n"
		 		+ "}'")
		 .when().post("/v2/user").
		 then().log().all().assertThat().statusCode(200).extract().response().asString();
        System.out.println("------------------------------");		
	}
	
	@Test(priority = 3)
	public void petCreationRequest() {
		RestAssured.baseURI="https://petstore.swagger.io/";
		
		 String R=given().log().all().header("Content-Type","application/json").header("accept","application/json").body("{\r\n"
		 		+ "  \"id\": 11,\r\n"
		 		+ "  \"category\": {\r\n"
		 		+ "    \"id\": 11,\r\n"
		 		+ "    \"name\": \"Rock\"\r\n"
		 		+ "  },\r\n"
		 		+ "  \"name\": \"doggie\",\r\n"
		 		+ "  \"photoUrls\": [\r\n"
		 		+ "    \"string\"\r\n"
		 		+ "  ],\r\n"
		 		+ "  \"tags\": [\r\n"
		 		+ "    {\r\n"
		 		+ "      \"id\": 12,\r\n"
		 		+ "      \"name\": \"TOM\"\r\n"
		 		+ "    }\r\n"
		 		+ "  ],\r\n"
		 		+ "  \"status\": \"available\"\r\n"
		 		+ "}")
		 .when().post("/v2/pet").
		 then().log().all().assertThat().statusCode(200).extract().response().asString();
        System.out.println("------------------------------");		
	}
	
	@Test(priority = 4)
	public void placeOrderRequest() {
		RestAssured.baseURI="https://petstore.swagger.io/";
		
		 String R=given().log().all().header("Content-Type","application/json").header("accept","application/json").body("{\r\n"
		 		+ "  \"id\": 1,\r\n"
		 		+ "  \"petId\": 1,\r\n"
		 		+ "  \"quantity\": 1,\r\n"
		 		+ "  \"shipDate\": \"2022-10-03T11:44:23.469Z\",\r\n"
		 		+ "  \"status\": \"placed\",\r\n"
		 		+ "  \"complete\": true\r\n"
		 		+ "}")
		 .when().post("/v2/store/order").
		 then().log().all().assertThat().statusCode(200).extract().response().asString();
        System.out.println("------------------------------");	
        System.out.println(R);
    	JsonPath J=new JsonPath(R);
    	String r=J.getString("id");
    	System.out.println(r);
    	this.id=r;
	}
	
	
	
	@Test(priority = 5)
	public void getOrderRequest() {
	
RestAssured.baseURI="https://petstore.swagger.io/";

	 String R=given().log().all().header("Content-Type","application/json")
			 .when().get("v2/store/order/"+id).
	 then().log().all().assertThat().statusCode(200)
	 .extract().response()
	 .asString();
System.out.println("------------------------------"); 
	
	
}
	
	@Test(priority = 6)
	public void logout() {
	
RestAssured.baseURI="https://petstore.swagger.io/";

	 String R=given().log().all().header("Content-Type","application/json")
			 .when().get("/v2/user/logout").
	 then().log().all().assertThat().statusCode(200)
	 .extract().response()
	 .asString();
System.out.println("------------------------------"); 
	
	
}
	
	
	
	
	
}
