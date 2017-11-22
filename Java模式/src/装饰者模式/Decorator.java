package 装饰者模式;

public class Decorator implements Swift{
	private Swift swift;
	
	public Decorator(Swift swift){
		this.swift=swift;
		
	}
	public void fly(){
		swift.fly();
	}
	
	

}
