package com.edu.restful.restfulservicesedu.service;

public class SingletonDemo {
	
	private SingletonDemo() {
	}

	public synchronized static SingletonDemo  returnInstance(){
		return new SingletonDemo();
	}
}
