package com.itheima.struts2.demo3;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport{
    public String find(){
    	System.out.println("查询用户。。。");
		return NONE;
    }
    public String update(){
    	System.out.println("修改用户。。。");
		return NONE;
    }
    public String delete(){
    	System.out.println("删除用户。。。");
		return NONE;
    }
    public String save(){
    	System.out.println("保存用户。。。");
		return NONE;
    }
}
