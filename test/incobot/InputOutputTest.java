package incobot;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class InputOutputTest {
	@Rule
	public final TextFromStandardInputStream mockSystemIn = TextFromStandardInputStream.emptyStandardInputStream();
	
	@Test
	public void shouldTakeUserInput() {
		mockSystemIn.provideLines("!test");
		
		Scanner console = new Scanner(System.in);
		
		InputOutput io = new InputOutput(console);
		
		assertEquals("!test", io.getInput());
		
		console.close();
	}
}
