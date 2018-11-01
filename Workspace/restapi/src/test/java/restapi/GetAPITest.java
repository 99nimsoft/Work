package restapi;

import static com.jayway.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
// Source:  https://www.youtube.com/watch?v=liANSrKkU5U&list=PLmfZ8pjwM0vTVzGG5v0CrWxJaeHPP1KvH&index=11
//we are directly using methods like get and all without creating object because we have imported
// this package statically ---> import static com.jayway.restassured.RestAssured.*;
public class GetAPITest{

	Response resp;
		
	@Test(enabled=false)
	public void TC_01(){
		resp = get("http://api.openweathermap.org/data/2.5/weather?q=noida&APPID=8f8376bd28085d161883f69d28255d8b");
		System.out.println(resp.getStatusCode());
	}
	
	@Test(dataProvider="params")
	public void TC_02(String arg){
		System.out.println("//********************************************************   STARTING   ********************************************************//");
		resp = given().param("q",arg).param("appid","8f8376bd28085d161883f69d28255d8b").
				when().get("http://api.openweathermap.org/data/2.5/weather");
		System.out.println(resp.asString());
		
	}
	
	@DataProvider(name="params")
	public Object[][] getParams(){
		return new Object[][]{{"noida"},{"delhi"},{"mumbai"},{"greenland"},{"nora"},{"jordan"}};
	}
	
	@Test(enabled=false)
	public void TC_03_passParticularParameter(){
		resp = given().parameter("zip","229127,in").param("appid","8f8376bd28085d161883f69d28255d8b").
				when().get("http://api.openweathermap.org/data/2.5/weather");
		System.out.println(resp.asString());
		
	}
	
	@Test(enabled=false)
	public void TC_04_extractParticularData(){	
		resp = when().get("http://api.openweathermap.org/data/2.5/weather?q=pensacola&APPID=8f8376bd28085d161883f69d28255d8b");
		System.out.println("Response:-->"+resp.asString());
		String tmp = resp.then().contentType(ContentType.JSON).extract().path("weather[0].description");
		System.out.println("Weather Now:--"+tmp);
	}
	
	@Test(enabled=false)
	public void TC_05_postRequest(){
//		resp = when().get("http://localhost:3000/posts");
//		System.out.println("Response before post:-->"+resp.asString());
		
		//resp = given().when().body("{\"author\":\"redexous\"}").contentType(ContentType.JSON).patch("http://localhost:3000/posts/1");
		//resp = given().when().delete("http://localhost:3000/posts/1");
		resp = given().get("http://localhost:3000/posts/1");
		System.out.println(resp.then().extract().time());
//		resp = when().get("http://localhost:3000/posts");
//		System.out.println("Response after post:-->"+resp.asString());
	}
}





















