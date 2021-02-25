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
		filename = "a.txt";
//		filename = "b.txt";
//		filename = "c.txt";
//		filename = "d.txt";
//		filename = "e.txt";
//		filename = "f.txt";
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


	}
}
