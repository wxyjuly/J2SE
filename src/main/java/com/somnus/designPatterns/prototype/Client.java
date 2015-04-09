package com.somnus.designPatterns.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 浅克隆
 * @author Somnus
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(1428588884432L);
		Sheep sheep = new Sheep("Dolly",date);
		Sheep Sheep2 = (Sheep) sheep.clone();
		
		System.out.println(sheep);
		System.out.println(sheep.getName());
		System.out.println(sheep.getBirthday());
		
		date.setTime(1420588854432L);
		
		System.out.println(Sheep2);
		System.out.println(Sheep2.getName());
		System.out.println(Sheep2.getBirthday());
	}
}
class Sheep implements Cloneable,Serializable{
	private String name;
	private Date birthday;
	
	public Sheep(String name, Date birthday) {
		this.name =  name;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();
		
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
