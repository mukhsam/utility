package com.design.pattern.structural.adapter;

public class AdapteeImpl implements Adaptee {

	@Override
	public String adoptMe() { 
		return "please call me";
	}

}
