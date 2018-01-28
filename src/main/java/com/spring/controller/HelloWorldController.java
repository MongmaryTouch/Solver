package com.spring.controller;

import java.util.ArrayList;
import java.util.List;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
   public @ResponseBody String sayHello() {
		
		
		// use list here
	   List<Integer> list = new ArrayList<Integer>();
	   for (int i = 0; i < 10; i++) {
		   list.add(i);
	   }
	   
	   JSONArray array = new JSONArray();
	   for (Integer x : list) {
		   array.put(x);
	   }
	   
	   JSONObject obj = new JSONObject();
	   obj.append("list", array);
	
       //return "{'root':" + array.toString() + "}" ;
	   return obj.toString();
   }
}

// javascript make a call to the local 8090/api through jquery. then you are gonna get it in javascript