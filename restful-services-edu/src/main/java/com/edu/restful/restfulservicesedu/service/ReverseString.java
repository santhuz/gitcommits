package com.edu.restful.restfulservicesedu.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		Map<Integer, String> map = new HashMap<Integer, String>();
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      
     // Reading data using readLine 
     String name = reader.readLine();
		if (name.length() == 0) {
			System.out.println("enter args");
		} else {
			 String []a = name.split(" ");
			int i = 0;
			int j = a.length;
			for (i = 0; i < a.length; i++) {
				if (StringUtils.isAlphanumericSpace(args.toString())) {
					System.out.println(j);
					map.put(j, a[i]);
				} else {
					map.put(i, a[i]);
				}
				j--;
			}
		}
		map.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v)); 
	}


}
