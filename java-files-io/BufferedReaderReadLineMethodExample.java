package com.coderolls;

import java.io.*;

/**
 * A java program to read file line by line using the
 * readLine() method of the BufferedReader Class.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class BufferedReaderReadLineMethodExample {

	public static void main(String[] args) {
		
        BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("F:\\sample-text-two-lines.txt"));
			
			String line;
			//read each line using readLine() method and print it
			while((line = bufferedReader.readLine()) != null){  
				System.out.println(line);  
			}
			 
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}