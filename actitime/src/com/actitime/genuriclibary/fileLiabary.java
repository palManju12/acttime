package com.actitime.genuriclibary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import graphql.language.Value;

public class fileLiabary {

		public String ReadDataFromPropertyFile (String key)throws IOException{
		FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty("key");
		return Value;
		

}
}