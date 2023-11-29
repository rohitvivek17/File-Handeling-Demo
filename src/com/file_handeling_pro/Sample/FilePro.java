package com.file_handeling_pro.Sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilePro {
	public static void main(String[] args) throws IOException {
		File f=new File("Sample123.txt");
		Scanner s=new Scanner(f);
		String text="";
		while(s.hasNext()) {
			text=text+" "+s.next();
		}
		System.out.println(text);
		
		
		
		
	}
}
