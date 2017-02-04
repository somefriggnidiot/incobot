package incobot;

import java.util.Scanner;

public class InputOutput {

	private final Scanner console;
	
	public InputOutput() {
		this(new Scanner(System.in));
	}
	
	InputOutput(Scanner console) {
		this.console = console;
	}
	
	/**
	 * Returns input from the server console. 
	 * @return	console input as a string
	 */
	public String getInput() {
		return console.nextLine();
	}
	
	/**
	 * Safely closes the IO console.
	 */
	public void shutdown() {
		console.close();
	}

}
