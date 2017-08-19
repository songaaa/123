package com.zhiyou100;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class People {

	
	
	int age;
	String name;
	double sex;
	int dhone;
	public People(int age, String name, double sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "People [age=" + age + ", name=" + name + ", sex=" + sex + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
