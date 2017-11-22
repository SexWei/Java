package 装饰者模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swift mk=new SunWuKong();
		mk.fly();
		
		Fish fish=new Fish(mk);
		fish.fly();

	}

}
