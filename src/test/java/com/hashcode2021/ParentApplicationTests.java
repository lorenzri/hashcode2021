package com.hashcode2021;


import org.junit.Test;

public class ParentApplicationTests {

	@Test
	public void contextLoads() {
		assert true;
	}

	@Test
	public void readFileA() {
		ParentApplication.main(new String[]{"a.txt"});
		// output a_out.txt

	}

}
