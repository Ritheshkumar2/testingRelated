package base;

public interface InterfaceTwo {
	
	
	public void interfaceMethodTwo();
	
	default void test() {
		System.out.print("interface method two");
	}

}
