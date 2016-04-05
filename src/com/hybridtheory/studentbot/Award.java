package com.hybridtheory.studentbot;

public class Award {
	
	private String name = "";
	private boolean flag = false;
	private int pointValue = 0;
	private String extraAwardReference = "";
	
	public Award(String name, boolean flag, int pointValue, String extraAwardReference) {
		this.name = name;
		this.flag = flag;
		this.pointValue = pointValue;
		this.extraAwardReference = extraAwardReference;
	}
	
	public Award(boolean flag) {
		this.name = this.name;
		this.flag = flag;
		this.pointValue = this.pointValue;
		this.extraAwardReference = this.extraAwardReference;
	}
	
	public String toString() {
		if (this.flag) {
			return "AWARDED!"+System.lineSeparator();
		} else {
			return "Not awarded"+System.lineSeparator();
		}
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean getFlag() {
		return this.flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}

	public String getExtraAwardReference() {
		return extraAwardReference;
	}

	public void setExtraAwardReference(String extraAwardReference) {
		this.extraAwardReference = extraAwardReference;
	}


}
