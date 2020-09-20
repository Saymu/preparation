package b_poo;

class OuterDemo {
	
	int num;
	
	private class InnerDemo {
		
		public void print () {
			System.out.println("This is an inner class! ");
		}
		
	}
	
	void displayInner() {
		InnerDemo inner = new InnerDemo();
		inner.print();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OuterDemo outer = new OuterDemo();
		outer.displayInner();

	}

}
