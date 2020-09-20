package b_poo;

abstract class AnonymousInner {
	public abstract void mymethod();
}

interface Message {
	String greet();
}

public class AnonymousInnerTest {
	
	static class Nested_Demo {
		public void my_method() {
			System.out.println("This is my nested class");
		}
	}

	public static void displayMessage(Message m) {
		System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument");
	}

	public static void main(String[] args) {
		
		AnonymousInnerTest.Nested_Demo nested = new AnonymousInnerTest.Nested_Demo();	 
	      nested.my_method();

		AnonymousInner inner = new AnonymousInner() {
			public void mymethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inner.mymethod();

		displayMessage(new Message() {
			public String greet() {
				return "Hello";
			}
		});

	}

}
