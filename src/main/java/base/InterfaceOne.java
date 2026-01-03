package base;

public interface InterfaceOne {
	
	public void interfacemethodOne();
	
	default void test() {
		System.out.println("default InterfaceOne method");
	}

	
}
