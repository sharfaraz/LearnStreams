package com.peer;

public class Cricketer {
	private String name;
	private int jerseyNumber;
	private double Average;
	private int centuries;
	private int sixes;
	
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", jerseyNumber=" + jerseyNumber + ", Average=" + Average + ", centuries="
				+ centuries + ", sixes=" + sixes + "]";
	}

	public Cricketer(String name, int jerseyNumber, double average, int centuries, int sixes) {
		super();
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		Average = average;
		this.centuries = centuries;
		this.sixes = sixes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public double getAverage() {
		return Average;
	}

	public void setAverage(double average) {
		Average = average;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	
	

}
