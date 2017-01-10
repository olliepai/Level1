import javax.swing.JOptionPane;

public class ClassPractice{
	public static void main(String[] args) {
		Robot oops = new Robot(5, "Dumb");
		oops.talk(); 
		for (int i = 0; i < 500000000; i++) {
			for (int j = 0; j < 15; j++) {
			oops.talk();
			oops.scream();
			oops.Trump();
			oops.Trump();
			}
			System.out.println("i is a robot thing dat likeses aples");
		}
	}
}
class Robot {
	int YearsUntilDeath = 5;
	String LastName = "Smith";
	public void talk() {
		System.out.println("I am talking");
	}
	public void scream() {
		System.out.println("I am screaming");
	}
	public void Trump() {
		System.out.println("I am trump");
	}
	Robot(int YearsUntilDeath, String LastName) {
		this.YearsUntilDeath = YearsUntilDeath;
		this.LastName = LastName;
	}

}