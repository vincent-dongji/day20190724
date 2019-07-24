package com.itheima.struts2.demo2;

import com.opensymphony.xwork2.Action;

/*
 * Action的编写方式二：实现一个Action接口
 * 实现接口的这种方式：提供了五个常量（五个逻辑视图的名称）
 * SUCCESS(成功)
 * ERROR(失败)
 * LOGIN(登录出错页面的跳转)
 * INPUT(表单校验时候出错 不可改)
 * NONE(不跳转)
 */
public class ActionDemo2 implements Action{

	@Override
	public String execute() throws Exception {
		System.out.print("ActionDemo2被执行了");
		return null;
	}

}
