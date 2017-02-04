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
	 * 
	 * @return
	 */
	public String getInput() {
		return console.nextLine();
	}

}
