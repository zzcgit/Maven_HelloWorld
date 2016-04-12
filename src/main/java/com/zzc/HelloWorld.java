package com.zzc;
public class HelloWorld {
	
    public String sayHello(String name) {

        return "hello, " + name + "!";

    }
	public static void main(String[] args){
		System.out.pring(new HelloWorld.sayHello("Maven"));
	}

}

