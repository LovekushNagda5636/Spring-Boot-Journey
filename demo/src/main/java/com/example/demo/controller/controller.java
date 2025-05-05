package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class controller{
	@RequestMapping("/FetchData")
	public String getName() {
		return "Lovekush Nagda";
	}
	@RequestMapping("/GetId")
	public int getId() {
		return 39;
	}
    @RequestMapping("/Details")
    public String getDetails() {
    	return "Name = " +getName()+ " and Id =" +getId();
    }
    @RequestMapping("/Info")
    public String getInfo(@RequestParam("un") String un,@RequestParam("id") int id) {
    	return "Name =" +un+ "and Id =" +id;
    }
}
