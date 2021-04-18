package com.test2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilehandlingCrude {
	public static void main(String[] args) {

		
		
		System.out.println("File Creat:");
		try {
			File f = new File("C:\\Users\\sanv2c18471\\Documents\\FilehandlingCRUD.txt");
			if (f.createNewFile()) {
				System.out.println("New file is created Successfully");
			} else {
				System.out.println("File is already exists");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		System.out.println("File Write:");
		try {
			FileWriter wf = new FileWriter("C:\\Users\\sanv2c18471\\Documents\\FilehandlingCRUD.txt");
			wf.write("We are java developers");
			wf.close();
			System.out.println("Sucessfully Write");
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("Error occured");
		}

		
		System.out.println("File Read:");
		try {
			FileReader r = new FileReader("C:\\Users\\sanv2c18471\\Documents\\FilehandlingCRUD.txt");
			Scanner s = new Scanner(r);
			while (s.hasNextLine()) {
				String line = s.nextLine();
				System.out.println("Sucessfully read");
			}
			s.close();
		} catch (IOException e) {
			System.out.println(e);
			{
				System.out.println("Error Occured");
			}
		}

		
		System.out.println("File Delete");
		File obj = new File("C:\\Users\\sanv2c18471\\Documents\\New folder");
		if (obj.delete()) {
			System.out.println("Deleted sucessfully");
		} else {
			System.out.println("Error Occured");
		}
	}
}
