package com.liuyang.springboot.error;
/**
 * 全局异常捕获
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.liuyang.springboot.po.BootError;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public BootError defaultErrorHandler(HttpServletRequest req,Exception e){
		BootError error = new BootError();
	     //打印异常信息：
//	     e.printStackTrace();
	     System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
	     error.setError(e.getMessage());
	     System.out.println(e.getMessage());
	     return error;
	}

}
