
public class Methods {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.echo("Hello");
	}

	public void echo(String message) {
		String echo = message + " " + message;
		System.out.println(echo);
	}

}
