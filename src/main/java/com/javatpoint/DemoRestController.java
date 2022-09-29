package com.javatpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
package com.crunchify.tutorials;
import java.net.InetAddress;
import java.net.UnknownHostException;
@RestController
public class DemoRestController 
{
@GetMapping("/D3V")
public String hello() 
{

	
	InetAddress ip;
	String hostname;
	ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
  
 
    return "HI D3V, this is a presentation, have a nice day.";
  
  
} 
 
}
