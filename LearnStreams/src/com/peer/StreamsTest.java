package com.peer;

import java.util.List;

public class StreamsTest {
	
	public void getGreatBatsmen() {
		CricketerUtil a = new CricketerUtil();
		List<Cricketer> batsmen = a.createCricketers();
		for ( Cricketer c : batsmen) {
			if (c.getCenturies()> 20) {
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StreamsTest test = new StreamsTest();
		test.getGreatBatsmen();
	}

}
