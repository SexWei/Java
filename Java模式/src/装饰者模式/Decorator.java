package װ����ģʽ;

public class Decorator implements Swift{
	private Swift swift;
	
	public Decorator(Swift swift){
		this.swift=swift;
		
	}
	public void fly(){
		swift.fly();
	}
	
	

}
