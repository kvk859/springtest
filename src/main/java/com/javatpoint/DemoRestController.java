package com.javatpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestController 
{
@GetMapping("/D3V")
public String hello() 
{
return "HI D3V, this is a presentation, have a nice day.";
  
  // Local address
    //InetAddress.getLocalHost().getHostAddress();
   // InetAddress.getLocalHost().getHostName();
  System.out.println("My hostname is : " + inetAddress.getHostName());
        System.out.println("My IP address is  : " + inetAddress);
    
    // Remote address
   // InetAddress.getLoopbackAddress().getHostAddress();
  //  InetAddress.getLoopbackAddress().getHostName();
  
 // System.out.println("My IP address is  : " + inetAddress);
    
  
  
}
}
