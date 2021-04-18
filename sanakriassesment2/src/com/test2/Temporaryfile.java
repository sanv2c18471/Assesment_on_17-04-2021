package com.test2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Temporaryfile {
	public static void main(String[] args) {
		try {
			File tempFile = File.createTempFile("Hello java Spring boot", ".tmp");
			System.out.println("File created Sucessfully");

			BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
			bw.write("Temporary file is located on Specified location");
			bw.close();

			try (BufferedReader br = new BufferedReader(new FileReader(tempFile))) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}