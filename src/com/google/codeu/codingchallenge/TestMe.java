package com.google.codeu.codingchallenge;

import java.util.ArrayList;

public class TestMe {
	public static void main(String[] args){
		MyJSON name = new MyJSON();
		name.setString("name", "Raahil");
		//name:Raahil
		//Should return "Raahil"
		System.out.println(name.getString("name"));
		
		System.out.println(name);
		System.out.println();
		
		MyJSON first = new MyJSON();
		name.setObject("name", first);
		//name:{}
		//Should return "{}"
		System.out.println(name.getObject("name"));
		
		System.out.println(name);
		System.out.println();
		
		first.setString("first", "Reelu");
		//name:{first:Reelu}
		//Should return "{first=Reelu}"
		System.out.println(name.getObject("name"));
		
		System.out.println(name);
		System.out.println();
		
		MyJSON sisterFirst = new MyJSON();
		first.setObject("sisterFirst", sisterFirst);
		System.out.println(name.get("name"));
		
		System.out.println(name);
		System.out.println();
		
		MyJSON second = new MyJSON();
		second.setString("second", "Sahib");
		first.setObject("first", second);
		//Should return "{second=Sahib}"
		System.out.println(name.getObject("first"));
		
		System.out.println(name);
		System.out.println();
		
		MyJSON third = new MyJSON();
		second.setObject("second", third);
		third.setString("third", "Jain");
		//Should return "{third=Jain}"
		System.out.println(name.getObject("second"));
		
		System.out.println(name);
		System.out.println();
		
		//Should return "Jain"
		System.out.println(name.getString("third"));
		
		System.out.println(name);
		System.out.println();
		
		MyJSON mother = new MyJSON();
		mother.setString("mother", "Anu");
		name.setObject("first", third);
		
		System.out.println(name);
		System.out.println();
		
		name.setObject("third", mother);
		
		System.out.println(name);
		System.out.println();
		
		System.out.println(name.getObject("name"));
		
		System.out.println(name);
		System.out.println();
		
		System.out.println(second.getObject("second"));
		
		System.out.println(second);
		System.out.println();
		
		System.out.println("/////////////////////////////////Test setString()////////////////////////////////////\n");
		
		name.setString("mother", "Anu Jain");
		System.out.println(name);
		System.out.println();
		
		name.setString("sisterFirst", "Arshana");
		System.out.println(name);
		System.out.println();
		
		name.setObject("first", second);
		System.out.println(name);
		System.out.println();
		
		name.setString("second", "Sahib");
		System.out.println(name);
		System.out.println();
		
		name.setObject("second", third);
		System.out.println(name);
		System.out.println();
		
		System.out.println("/////////////////////////////////Test getObjects()////////////////////////////////////\n");
		
		ArrayList<String> objects = new ArrayList<String>();
		name.getObjects(objects);
		
		System.out.println(objects);
		
		System.out.println("/////////////////////////////////Test getStrings()////////////////////////////////////\n");
		
		ArrayList<String> strings = new ArrayList<String>();
		name.getStrings(strings);
		
		System.out.println(strings);
	}
}
