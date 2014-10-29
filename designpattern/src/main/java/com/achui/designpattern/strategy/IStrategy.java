package com.achui.designpattern.strategy;

/**
 * 举例，一个人要去旅游，需要决定用什么交通工具去
 * 去上海，坐飞机
 * 去上班，做公交
 * 去轮渡，做船
 * 
 * 
 * @author portz
 * 
 * IStrategy，一个策略接口，运行时决定使用什么交通工具
 */
public interface IStrategy {

	public String travel();
}
