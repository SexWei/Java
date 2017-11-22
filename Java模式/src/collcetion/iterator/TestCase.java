package collcetion.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class TestCase {

	List<Integer> list=new ArrayList<Integer>();
	public TestCase(){
		
	}
	
	@Before
	
	public void init(){
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(29);
	}
	
	@Test
	public void testSimpleIteator(){
		
		Iterator<Integer> it= list.iterator();
		
		while(it.hasNext()){
			Integer item=it.next();
			if(item.equals(2)){
				it.remove();
				continue;
			}
			
			System.out.println(item);
			
		}
	}
}
