package com.coderolls;

import java.io.*;

/**
 * A java program to read file character by character using the
 * read() method of the BufferReader Class.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class BufferReaderReadMethodExample {

	public static void main(String[] args) {
		
        BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("F:\\sample-text.txt"));
			
			int i;
			//read each character using read() method and print it
			while((i=bufferedReader.read())!=-1){  
				System.out.print((char)i);  
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
