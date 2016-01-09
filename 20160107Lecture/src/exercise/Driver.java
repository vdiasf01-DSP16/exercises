package exercise;

public class Driver {
	public static void main(String[] args) {
		Storage<BankAccount> aStorage = new Storage<>();
		Storage<String>      sStorage = new Storage<>();
		
		// 1. What are the reasons for using generics here?
		//
		// Storage is meant to store any type of object, and
	    // the use of generics, allow us to set which type of
		// objects we need to store without using a different
		// Storage package name.
		
		// 2. What are the benefits? 
		//
		// If one does not use generics for Storage, Storage would
		// have to have one class per type of Object needed to be stored.
		// Generics gives us this for free.
		
		Class baCls = BankAccount.class;
		try {
			
			// 3. What is the cause of the problem reported by the compiler, if any?
			//
			// myAccount is not an int, and setValue(Object) is not defined in BankAccount,
			// only setValue(int).
            //Object myAccount = baCls.newInstance();

			// 4. How does this affect the compilation process? What is the problem, is any?
			// It complains about a type mismatch from Object to BankAccount
			//
			// What does the myAccount variable hold when the code is executed?
			// An Object with BanckAccount meta-characteristics
			//
			// Decide whether your diagnosis from question (3) was correct.
			// BankAccount myAccount = (Object) baCls.newInstance();
			// returned the exact same error.
			// System.out.println(baCls.toString());
			// Printed class exercise.BankAccount for the instance created 
			// but still with the Object type

			BankAccount myAccount = (BankAccount) baCls.newInstance();
			
			// 5. What does the dynamic cast do here?
			// 
			// It casts the Object into BankAccount which then is instantiated 
			// in memory with same meta-characteristics of the BankAccount class
			//
			// Is it the compiler that performs the cast operation or the Java runtime environment (JVM)?
			// baCls is known by the compiler to always be a BankAccount.class, thus the 
			// compiler 

			System.out.println(myAccount.toString());
			aStorage.setValue(myAccount);
			
			// Deposit
			myAccount.deposit(15);
		} catch ( InstantiationException e ) {
			e.printStackTrace();
		} catch ( IllegalAccessException e ) {
			e.printStackTrace();
		}
		System.out.println(aStorage.x.showBalance());
		System.out.println(sStorage.x);
	}

}
