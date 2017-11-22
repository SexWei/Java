package designer.factory;

public class IpadFactory implements Factory{
	
	public Product createProduct(){
		
		return new Ipad();
	}

}
