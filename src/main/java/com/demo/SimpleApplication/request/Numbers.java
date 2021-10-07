package com.demo.SimpleApplication.request;

import java.util.List;

public class Numbers {
	private List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public int total()
	{
		return numbers.stream().reduce(0, Integer::sum);
	}

}
