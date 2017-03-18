import javax.swing.JOptionPane;

public class Superhero {
	
	String name;
	String power;
	
	public static void main(String[] args) {
		Superhero Bob = new Superhero();
		String name = JOptionPane.showInputDialog("What is your name?");
		String power = JOptionPane.showInputDialog("Wht is your power?");
		Bob.setYourName(name);
		Bob.setSuperpower(power);
		
		String message = Bob.toString();
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	public String toString() {
		String named = getYourName();
		String powerd = getSuperpower();
		
		String message = named + " has the power of " + powerd;
		return message;
	}
	
		
	public void setSuperpower(String superpower) {
		power = superpower;	
	}
	
	public String getSuperpower() {
		return  power;
	}
	
	public void setYourName(String YourName) {
		name = YourName;
	}
	
	public String getYourName() {
		return name;
	}
	
}
