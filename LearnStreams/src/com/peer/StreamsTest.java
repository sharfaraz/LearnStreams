package com.peer;

import java.util.List;
import java.util.stream.Stream;

public class StreamsTest {
	
	public void getGreatBatsmen() {
		CricketerUtil a = new CricketerUtil();
		List<Cricketer> batsmen = a.createCricketers();
		System.out.println("Top batsmen");
		batsmen.stream()
		.filter(b -> b.getAverage() > 50)
		.map(b -> b.getName())
		.forEach(b -> System.out.println(b));
		
		System.out.println("most sixes order");
		batsmen.stream()
		.map(b -> b.getName())
		.forEach(b -> System.out.println(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StreamsTest test = new StreamsTest();
		test.getGreatBatsmen();
	}

}
