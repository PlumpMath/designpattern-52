package com.achui.designpattern.strategy;
/**
 * 该类也可以是个抽象类
 * @author portz
 *
 */
public class Person {

	//对不同策略的一个引用
	private IStrategy strategy;
	
	private String target;
	
	public void travel(){
		System.out.println(this.target+","+strategy.travel());
	}

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
