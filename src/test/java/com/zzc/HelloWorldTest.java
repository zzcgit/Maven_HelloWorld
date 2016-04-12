package com.zzc;

import static org.junit.Assert.*;
import org.junit.Test;
 
public class HelloWorldTest {
	
    @Test
    public void testSayHello() {

        HelloWorld hello = new HelloWorld();

        assertEquals("Say hello mehtod test failed.", "hello, maven!", hello.sayHello("maven"));

    }
}
