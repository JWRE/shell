package phone.com.maven.ch02;
import phone.com.maven.HelloMaven;
public class Hello
{
	public String say(String name){
		HelloMaven hm = new HelloMaven();
		return hm.sayHello(name);
	}
}
