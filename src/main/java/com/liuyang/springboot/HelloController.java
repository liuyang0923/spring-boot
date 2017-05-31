package com.liuyang.springboot;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuyang.springboot.po.Demo;


@RestController
public class HelloController {
	
	   @RequestMapping("/hello")  
	   public String hello(){  
	        return "Hello  world cccc";  
	   }  
	   
	   
	   @RequestMapping("/hello/{name}")  
	   public String helloName(@PathVariable String name){  
	        return "Hello " + name;  
	   }  
	   
	   @RequestMapping("/getDemo")
	   public Demo getDemo(){
		   Demo demo = new Demo();
		   demo.setId(28);
		   demo.setName("liuyang-yyy-xxxxx-test");
		   demo.setCreateDate(new Date());
		   return demo;
	   }
	   
	   @RequestMapping("/zeroException")
	    public int zeroException(){
	       return 100/0;
	    }
	   
}
