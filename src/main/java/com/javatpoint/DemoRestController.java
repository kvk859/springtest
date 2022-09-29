 /*package com.javatpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestController 
{
@GetMapping("/D3V")
//public String hello() 
//{
//return "HI D3V, this is a presentation, have a nice day.";
  
  // Local address
    //InetAddress.getLocalHost().getHostAddress();
   // InetAddress.getLocalHost().getHostName();
  //System.out.println("My hostname is : " + inetAddress.getHostName());
    //    System.out.println("My IP address is  : " + inetAddress);
    
    // Remote address
   // InetAddress.getLoopbackAddress().getHostAddress();
  //  InetAddress.getLoopbackAddress().getHostName();
  
 // System.out.println("My IP address is  : " + inetAddress);
    
  
  
//} 
  private RequestService requestService;
	
	// @RequestMapping("/D3V")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		String clientIp = requestService.getClientIp(request);
		model.addObject("clientIp", clientIp);
		return model;
	}
}
*/

package dev.simplesolution.ip.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dev.simplesolution.ip.service.RequestService;

@Controller
public class HomeController {
	
	@Autowired
	private RequestService requestService;
	
	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		String clientIp = requestService.getClientIp(request);
		model.addObject("clientIp", clientIp);
		return model;
	}

}
