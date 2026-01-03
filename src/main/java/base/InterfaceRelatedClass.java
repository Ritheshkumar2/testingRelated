package base;

public class InterfaceRelatedClass implements InterfaceOne,InterfaceTwo{
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		InterfaceOne.super.test();
		InterfaceTwo.super.test();
	}
	
	

@Override
public void interfaceMethodTwo() {
	System.out.println("interface class two");
	
}

@Override
public void interfacemethodOne() {
	System.out.println("interface class one");
	
}


public static void main(String[] args) {
	InterfaceOne object=new InterfaceRelatedClass();
	object.interfacemethodOne();
	object.test();
	
	InterfaceTwo object2=new InterfaceRelatedClass();
	object2.interfaceMethodTwo();
	object2.test();
	
}







}
