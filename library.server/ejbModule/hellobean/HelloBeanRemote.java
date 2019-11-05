package hellobean;

import javax.ejb.Remote;

@Remote
public interface HelloBeanRemote {

	public String sayHello();
	
}
