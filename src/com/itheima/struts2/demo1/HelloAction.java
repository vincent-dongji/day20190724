package com.itheima.struts2.demo1;

public class HelloAction {

	/*
	 * 提供一个方法：
	 * 方法的签名是固定的
	 * 共用的 返回值是String类型  方法名为execute在这个方法中不能传递参数  
	 */
	
	public String execute(){
		System.out.print("struts2被执行了");
		return "success";
	}
}
