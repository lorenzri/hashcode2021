package com.hashcode2021;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParentApplication {

	public static void main(String[] args) {

		String filename = args[0];

		List<String> linesFromFile = null;
		URL resource = ParentApplication.class.getClassLoader().getResource(filename);
		File file = null;
		try {
			file = new File(resource.toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		Scanner scanner = null;

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while(scanner.hasNext()){
				scanner.nextLine();
			}



		try (OutputStream outputStream = new FileOutputStream(filename + "submission")) {
			// write to outputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
