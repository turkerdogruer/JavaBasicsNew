package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeaFile {
	
	public static void main(String[] args) throws IOException {
		
		String filePath= "configs/info.properties";
		FileInputStream isim = new FileInputStream(filePath);
		
		Properties kiro = new Properties();
		
		kiro.load(isim);
		
		kiro.setProperty("phonenumber", "123131");
		
		FileOutputStream saysomething = new FileOutputStream(filePath);
		kiro.store(saysomething, "added phone number");
		
	}

}
