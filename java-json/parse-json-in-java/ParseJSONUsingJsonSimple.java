package com.coderolls.JSONExample;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * A program to parse JSON strin in Java using json-simple
 * @author Gaurav Kukade at coderolls.com
 */

public class ParseJSONUsingJsonSimple {

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
				
		System.out.println("Parsing the json string in java using json-simple......\n");
		
		JSONParser parser = new JSONParser();
		JSONObject coderollsJSONObject = new JSONObject();
		try {
			coderollsJSONObject = (JSONObject) parser.parse(jsonString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//now we can access the values 
		String name = (String) coderollsJSONObject.get("name");
		System.out.println("Name: "+name+"\n");
		
		//we can get the JSON object present as value of any key in the parent JSON
		JSONObject addressJSONObject = (JSONObject) coderollsJSONObject.get("address");
		
		//access the values of the addressJSONObject 
		String street = (String) addressJSONObject.get("street");
		System.out.println("Street: "+street+"\n");
		
		
		//we can get the json array present as value of any key in the parent JSON
		JSONArray employeesJSONArray = (JSONArray) coderollsJSONObject.get("employees");
		System.out.println("Printing the employess json array: \n"+employeesJSONArray.toString()+"\n");
		
		//we can get individual json object at an index from the employeesJSONArray
		JSONObject employeeJSONObject = (JSONObject) employeesJSONArray.get(0);
		String firstName = (String) employeeJSONObject.get("firstName");
		System.out.println("First Name of the employee at index 0: "+firstName);
	}

}
