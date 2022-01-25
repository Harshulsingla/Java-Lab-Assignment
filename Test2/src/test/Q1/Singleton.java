package test.Q1;

import java.io.Serializable;

//Q1. Implement singleton design pattern, to ensure that a class have only one instance
//    and provide global point of access to it
//    While designing singleton pattern consider following factors, what is good progamming
//    practice about singleton pattern?
//    1. Eager initialization
//    2. Static block initialization
//    3. Lazy Initialization
//    4. Thread Safe Singleton
//    5. Serialization issue
//    6. Cloning issue
//    7. Using Reflection to destroy Singleton Pattern
//    8. Enum Singleton


enum MySingleton {
	SINGLETON;
	// Any Business Logic
}


public class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = -6834926027969920657L;

	private volatile static Singleton singleton = null;                        //  Lazy Initialization

	private Singleton() {

		if (singleton != null) {

			throw new IllegalStateException("Dont Call me Using Reflection");   //  We threw IllegalStateException here to avoid calling of Singleton
			                                                                    //    using reflection 

		}

	}


	public static Singleton getSingleton() {

		if (singleton == null) {

			synchronized (Singleton.class) {
                                                                         //  Double Locking is Applied to make it Thread Safe
				if (singleton == null) {

					singleton = new Singleton();                        //  We instantiated Singleton here to avoid Eager Initialization 

				}

			}

		}

		return singleton;

	}

	@Override

	protected Object clone() throws CloneNotSupportedException {

		return singleton;                                          // Throws CloneNotSupportedException so that clone cant be made.

	}

	private Object readResolve() {

		return singleton;                        // We implemend readresolve method and returned same Singleton here, so that any other copy cant
		                                         //   be made using deserialization

	}
	
	
	public static void main(String[] args) {
		MySingleton singletonEnum = MySingleton.SINGLETON;           //Enum singleton design pattern, Enum is a singleton by Default
		System.out.println(singletonEnum.hashCode());               
		
		
		MySingleton singletonEnum2 = MySingleton.SINGLETON;         // It will print the Same Hashcode
		System.out.println(singletonEnum2.hashCode());
	}
	

}
