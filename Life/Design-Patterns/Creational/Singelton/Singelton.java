package com.dataS.singelton;

public class Singelton {

	// 1. Lazy Initialization
	private static Singelton singelton = null;
	// 2. Eager initialization
	private static Singelton singelton1 = new Singelton();
	// 3. Static block initialization
	static {
		try {
			singelton = new Singelton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	private Singelton() {

	}

	public static Singelton getInstance() {
		if (singelton == null) {
			// 1. Lazy Initialization
			return new Singelton();
		}

		else
			return singelton;
	}
	//4. Thread Safe  initialization
	public static synchronized Singelton getInstanceThreadSafe(){
        if(singelton == null){
        	singelton = new Singelton();
        }
        return singelton;
    }
}
