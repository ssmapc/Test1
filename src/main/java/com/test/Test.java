package com.test;


class SuperCons8 {

//	SuperCons8() {// the default constructor won't be executed unless invoked,
//					// because
//		// the following constructor will be invoked.
//		System.out.println("Superclass No arg");
//	}

	SuperCons8(int x) {
		System.out.println("Superclass 1 arg");
	}
}

class Test extends SuperCons8 {

	Test() {
		this(1);
		System.out.println("Subclass No arg");
	}

	Test(int x) {
		super(1); // point here is : because the super here, the output of
					// superclass lost
					// with the super keyword, the super class will be
					// explicitly invoked
					// without the super keywork, the super class will be
					// implicitly invoked
		System.out.println("Subclass 1 arg");
	}

	public static void main(String[] args) {
		Test obj = new Test();
		//Cons8 obj2 = new Cons8();
		System.out.println("I am the main method.");
	}
}
