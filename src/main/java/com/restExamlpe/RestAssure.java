package com.restExamlpe;

import java.util.concurrent.Delayed;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssure {

	public static void GetExample() {
		RestAssured.baseURI = "https://api.github.com/";

		String BearerToken = "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";
		Response response = RestAssured.given().header("Authorization", "Bearer " + BearerToken)
				// .auth().basic("", "")
				.body("")

				.when().get("user/repos");

				//.then().log().all().extract().response();
		int statusCode = response.statusCode();

		// System.out.println(response);

		System.out.println(statusCode);
	}

	public static void PostExample() {

		RestAssured.baseURI = "https://api.github.com/";

		String BearerToken = "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";

		String postBody = "{\"name\":\"Rest-World-1\"}";

		Response response = RestAssured.given().header("Authorization", "Bearer " + BearerToken)
				// .auth().basic("", "")
				.body(postBody)

				.when().post("user/repos");

			//	.then().log().all().extract().response();

		int statusCode = response.statusCode();

		System.out.println(statusCode);
	}

	public static void Update() {

		RestAssured.baseURI = "https://api.github.com/";

		String BearerToken = "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";

		String updateBody = "{\"names\":[\"api\"]}";

		Response response = RestAssured.given().header("Authorization", "Bearer " + BearerToken).body(updateBody).when()
				.put("/repos/prabamohan/Rest-World/topics");
		//.then().log().all().extract().response();

		int statusCode = response.getStatusCode();

		System.out.println(statusCode);

	}

	public static void Delete() {

		RestAssured.baseURI = "https://api.github.com/";

		String BearerToken = "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";

		Response response = RestAssured.given().header("Authorization", "Bearer " + BearerToken).body("")
				.delete("/repos/prabamohan/Rest-World-1");
		//.then().log().all().extract().response();

		response.getStatusCode();

	}

	public static void main(String[] args) {

		GetExample();

		 PostExample();

		 Update();

		 Delete();

	}

}
