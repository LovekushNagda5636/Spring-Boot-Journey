package com.example.demo.controller;
 
 import java.util.ArrayList;
 import java.util.List;
 
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 public class RequestApi{
@RequestMapping("/test/{id}")
	public String testApi(@PathVariable String id) {
		List<String> li=new ArrayList<>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		for(String s:li){
			if(s.equals(id)) return s;
		}
		return "";	
	}
	@RequestMapping("/test3")
	public String testApi1() {
		List<String> li =new ArrayList<>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		return li.toString();
	}


	@RequestMapping("/test2")
	public String TestApi(@RequestParam(required=false) String id) {
		List<String> li=new ArrayList<>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		if(id!=null) {
			for(String s: li) {
				if(s.equals(id)) return s;
			}
			return "";
		}
		return li.toString();
	}
 	}
 
 	
 