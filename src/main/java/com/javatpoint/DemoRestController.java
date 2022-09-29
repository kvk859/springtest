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
}
}
