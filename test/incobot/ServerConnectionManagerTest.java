package incobot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.github.theholywaffle.teamspeak3.TS3Config;

public class ServerConnectionManagerTest {
	ServerConnectionManager scm;
	
	@Before
	public void setup() {
		scm = new ServerConnectionManager();
	}
	
	@Test
	public void ConstructorInitializesConfig() {
		Assert.assertNotEquals(scm.serverConfig, null);
	}

}
