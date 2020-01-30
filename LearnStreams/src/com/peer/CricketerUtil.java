package com.peer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketerUtil {
	
	public List<Cricketer> createCricketers() {
		List<Cricketer> cricketersList = Arrays.asList(
				new Cricketer("Rohit Sharma", 45, 48, 28, 235, 8900),
				new Cricketer("Dhoni", 7, 50.5, 11, 227, 10400),
				new Cricketer("Virat Kohli", 18, 60.5, 45, 180, 10800));
		return cricketersList;
	}
	

}
