package hellobean.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import hellobean.HelloBeanRemote;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean implements HelloBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String sayHello() {
    	return "Hello World";
    }

}
