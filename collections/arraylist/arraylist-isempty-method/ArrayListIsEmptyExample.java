package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
/**
 * An example java program for an isEmpty method 
 * of the ArrayList class in java.
 * 
 * @author Gaurav Kukade at coderolls
 */
public class ArrayListIsEmptyExample {

	public static void main(String[] args) {
		
		// create an arraylyst teams
		ArrayList<String> teams = new ArrayList<String>();
		
		// add elements to the arraylist teams
		teams.add("LA Galaxy");
		teams.add("Orlando City FC");
		teams.add("Portland Timbers");
		teams.add("Columbus Crew");
		
		boolean isTeamsEmpty = teams.isEmpty();
		
		if(isTeamsEmpty) {
			System.out.println("Teams arraylist is empty.");
		}
		else {
			System.out.println("Teams arraylist is not empty.");
		}
		
		// create an arraylist players
		ArrayList<String> players = new ArrayList<String>();
		
		boolean isPlayersEmpty = players.isEmpty();
		
		if(isPlayersEmpty) {
			System.out.println("Players arraylist is empty.");
		}
		else {
			System.out.println("Players arraylist is not empty.");
		}
	}
}
