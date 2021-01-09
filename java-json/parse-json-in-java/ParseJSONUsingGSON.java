package com.coderolls.JSONExample;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * A program to parse JSON strin in Java using Gson
 * @author Gaurav Kukade at coderolls.com
 */

public class ParseJSONUsingGSON {

	public static void main(String[] args) {

		//take json as string
		String jsonString = "{"
				+ "  \"name\": \"coderolls\","
				+ "  \"type\": \"blog\","
				+ "  \"address\": {"
				+ "    \"street\": \"1600 Pennsylvania Avenue NW\","
				+ "    \"city\": \"Washington\","
				+ "    \"state\": \"DC\""
				+ "  },"
				+ "  \"employees\": ["
				+ "    {"
				+ "      \"firstName\": \"John\","
				+ "      \"lastName\": \"Doe\""
				+ "    },"
				+ "    {"
				+ "      \"firstName\": \"Anna\","
				+ "      \"lastName\": \"Smith\""
				+ "    },"
				+ "    {"
				+ "      \"firstName\": \"Peter\","
				+ "      \"lastName\": \"Jones\""
				+ "    }"
				+ "  ]"
				+ "}";
		
		System.out.println("Parsing the json string in java using Gson......\n");
		Gson gson = new Gson();
		
		//get json object from the json string
		JsonObject coderollsJsonObject = gson.fromJson(jsonString, JsonObject.class);
		
		//now we can access the values 
		String name = coderollsJsonObject.get("name").getAsString();
		System.out.println("Name: "+name+"\n");
		
		//we can get the JSON object present as value of any key in the parent JSON
		JsonObject addressJsonObject = coderollsJsonObject.get("address").getAsJsonObject();
		
		//access the values of the addressJSONObject 
		String street = addressJsonObject.get("street").getAsString();
		System.out.println("Street: "+street+"\n");
		
		
		//we can get the json array present as value of any key in the parent JSON
		JsonArray employeesJsonArray = coderollsJsonObject.get("employees").getAsJsonArray();
		System.out.println("Printing the employess json array: \n"+employeesJsonArray.toString()+"\n");
		
		//we can get individual json object at an index from the employeesJSONArray
		JsonObject employeeJsonObject = employeesJsonArray.get(0).getAsJsonObject();
		String firstName = employeeJsonObject.get("firstName").getAsString();
		System.out.println("First Name of the employee at index 0: "+firstName);
	}
}
