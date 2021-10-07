package com.demo.SimpleApplication.Service;

import org.springframework.stereotype.Service;

import com.demo.SimpleApplication.request.Numbers;

@Service
public class DemoService {

	
	public String getHelloWorldString()
	{
		return "Hello World";
	}
	public int addSum(Numbers numbers)
	{
		return numbers.total();
		
	}
	

}
