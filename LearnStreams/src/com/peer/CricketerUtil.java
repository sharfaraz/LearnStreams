package com.peer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketerUtil {
	
	public List<Cricketer> createCricketers() {
		List<Cricketer> cricketersList = Arrays.asList(
				new Cricketer("Rohit Sharma", 45, 48, 28, 235),
				new Cricketer("Dhoni", 7, 50, 11, 227),
				new Cricketer("Virat Kohli", 18, 55, 45, 180));
		return cricketersList;
	}
	

}
