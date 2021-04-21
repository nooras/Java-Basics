package com.abc;

import com.xyz.Xyz;

public class Abc {
	Xyz obj = new Xyz();
	public void print() {
		String name = "Nooras";
		obj.display(name);
//		display(name);
	}
	public void print(String name) {
		obj.display(name);
	}
}
