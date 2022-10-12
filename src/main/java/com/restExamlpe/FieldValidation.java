package com.restExamlpe;


import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FieldValidation {

	public static void main(String[] args) throws Throwable {

		FileReader file = new FileReader(".//payload.txt");

		JSONParser js = new JSONParser();

		Object parse = js.parse(file);

		JSONObject jo = (JSONObject) parse;

		Object object = jo.get("Phone");

		// System.out.println(object);
		JSONArray ja = (JSONArray) object;

		// Object object2 = ja.get(0);
		
	

		for (Object number : ja) {
			System.out.println(number);
			
		}

		Object forSkills = jo.get("Skill");

		JSONArray ja2 = (JSONArray) forSkills;

		for (Object skl : ja2) {
			System.out.println(skl);
		}

	}

}
