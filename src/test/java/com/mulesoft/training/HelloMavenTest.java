package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("apadv-module1-maven-demoFlow", "Hello World !!!!");
    }
    
    @Override
    protected String getConfigFile() {
        return "apadv-module1-maven-demo.xml";
    }

}
