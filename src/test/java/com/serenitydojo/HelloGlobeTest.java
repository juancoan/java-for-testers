package com.serenitydojo;

import org.junit.Test;

public class HelloGlobeTest {

        @Test //JUnit test annotation to test the HelloGlobe class
        public void TestingHelloGlobe(){
            HelloGlobe greeting = new HelloGlobe();
            greeting.SayHello();
        }

}
