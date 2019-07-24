package com.itheima.struts2.demo2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/*
 * Action的编写方式三：Action类继承了ActionSupport类
 * 推荐使用继承ActionSupport方式
 *     ActionSupport中提供了数据校验、国际化等一系列操作的方法
 * 实现接口的这种方式：提供了五个常量（五个逻辑视图的名称）
 * SUCCESS(成功)
 * ERROR(失败)
 * LOGIN(登录出错页面的跳转)
 * INPUT(表单校验时候出错 不可改)
 * NONE(不跳转)
 */
public class ActionDemo3 extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.print("ActionDemo3被执行了");
		return NONE;
	}

}
