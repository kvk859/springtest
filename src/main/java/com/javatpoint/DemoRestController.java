package com.javatpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController 
{
@GetMapping("/D3V")
	//public ModelAndView index(HttpServletRequest request) 
public String hello() 
{
	//InetAddress ip;
	
//	ip = InetAddress.getLocalHost();
           // hostname = ip.getHostName();
            //System.out.println("Your current IP address : " + ip);
          //  System.out.println("Your current Hostname : " + hostname);
  
 
	
	 
    return "HI D3V, this is a presentation, have a nice day. ";
  
  
} 
 
}
