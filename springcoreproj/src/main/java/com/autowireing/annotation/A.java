package com.autowireing.annotation;

public class A {
	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "A [street=" + street + ", city=" + city + "]";
	}
	
}
