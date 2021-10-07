package com.demo.SimpleApplication.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SimpleApplication.Service.DemoService;
import com.demo.SimpleApplication.request.Numbers;

@RestController
@RequestMapping("api/demo")
public class DemoController {
	
	@Autowired
	DemoService demoservice;
	

	@GetMapping(path="/hello")
	public String getHelloWorldString()
	{
		return demoservice.getHelloWorldString();
	}
	@PostMapping(path="/addition")
	public String addSum(@RequestBody Numbers numbers)
	{
		return  "the sum is "+ demoservice.addSum(numbers);
	}
	
	
	
}
