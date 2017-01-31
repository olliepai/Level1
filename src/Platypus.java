public class Platypus {
	private String name;
	
	public Platypus(String name) {
		this.name = name;
	}

	void sayHi(){
		System.out.println("∆O∆ The platypus " + name + " is smarter than your average ugly platypus. ∆O∆");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus bubba = new Platypus("bubba");
		//2. Call the sayHi method
		bubba.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}

