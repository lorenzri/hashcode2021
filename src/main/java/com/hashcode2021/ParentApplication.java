package com.hashcode2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ParentApplication {

	public static void main(String[] args) {

		SpringApplication.run(ParentApplication.class, args);
		String directory = "/home/rilo/Development/projects/hashcode2021/docs/practice/";
		String filename = "a_example";
		List<String> linesFromFile = null;

		try {
			linesFromFile = readFile(directory, filename);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String line : linesFromFile) {
			System.out.println(line);
		}
	}

	private static List<String> readFile(String directory, String filename) throws IOException {

		List<String> lines = new ArrayList<>();
		String line = null;
		File file = new File(directory.concat(filename));
		Scanner scanner = new Scanner(file);

		while(scanner.hasNext()){
			line = scanner.nextLine();
			lines.add(line);
		}

		return lines;
	}
}
