package com.coderolls;

import java.io.*;

public class BufferedReaderExanple {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("F:\\sample-text.txt"));
			System.out.println("Read file using read() method: ");
			readFileCharacterByCharacter(bufferedReader);

			bufferedReader = new BufferedReader(new FileReader("F:\\sample-text-two-lines.txt"));
			System.out.println("\n\nRead file using readLine() method: ");
			readFileLineByLine(bufferedReader);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * A method to read file content character by character using the BufferedReader 
	 * read() method
	 * 
	 * @param bufferedReader
	 */
	public static void readFileCharacterByCharacter(BufferedReader bufferedReader) {
			try {
				int i;
				//read each character using read() method and print it
				while((i=bufferedReader.read())!=-1){  
					System.out.print((char)i);  
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * A method to read file content line by line using the BufferedReader 
	 * readLine() method
	 * 
	 * @param bufferedReader
	 */
	public static void readFileLineByLine(BufferedReader bufferedReader) {
		
		try {
			String line;
			//read each line using readLine() method and print it
			while((line = bufferedReader.readLine()) != null){  
				System.out.println(line);  
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
}