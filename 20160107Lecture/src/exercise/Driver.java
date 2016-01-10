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
		
		Class<BankAccount> baCls = BankAccount.class;
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
			// It casts the Object into BankAccount to allow BankAccount methods to be available.
			//
			// Is it the compiler that performs the cast operation or the Java runtime environment (JVM)?
			// baCls is dynamically casted thus done at run time.
			//
			// Is this code safe?
			// Yes.
			
			// 6. Explain the compiler output? Are there errors? What is the reason? 
			//    What does it say about the role of generics?
			//
			// The compiler compiles without any errors.
			// Everything is cast correctly for the compiler at the type erasure point.
			
			aStorage.setValue(myAccount);
			
			// Deposit
			myAccount.deposit(15);
		} catch ( InstantiationException e ) {
			e.printStackTrace();
		} catch ( IllegalAccessException e ) {
			e.printStackTrace();
		}
		System.out.println(aStorage.getValue().showBalance());
		
		if ( aStorage.getClass() == sStorage.getClass() ) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
		
		// 7. What is the run-time output?
		//
		// Both classes are equal.
		// The final balance of aStorage is 115.0, 
		// this is the setValue(15) plus the initialised 100
		//
		//    Explain why you get such output and how does this relate to generics 
		//    and their use with reflective instantiation of object?
		//
		// New BankAccount was instantiated and added to the storage with the default
		// value of 100 as per the BankAccount constructor. Then a deposit of 15 was 
		// made to the same account pointed to the storage reference.
		// When retrieving the balance of the account set in the storage, we get the
		// 100 plus the 15 = 115.
		// 
	}

}
