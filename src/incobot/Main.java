package incobot;

public class Main {

	public static void main(String[] args) {
		InputOutput io = new InputOutput();
		String input = null;
		
		do {
			input = io.getInput();
		} while (input.equals("!exit"));
		
		io.shutdown();

	}

}
