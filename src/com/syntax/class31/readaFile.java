package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class readaFile {
	public static void main(String[] args) throws IOException {

		String filePath = "configs/info.properties";

		FileInputStream fistik = new FileInputStream(filePath);

		Properties puro = new Properties();

		puro.load(fistik);

		System.out.println(puro.getProperty("name"));
		Set<Entry<Object, Object>> list = puro.entrySet();

		for (Entry<Object, Object> x : list) {
			System.out.println(x);
		}
	}

}
