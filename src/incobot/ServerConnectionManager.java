package incobot;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.ReconnectingConnectionHandler;

public class ServerConnectionManager {
	TS3Config serverConfig;
	
	public ServerConnectionManager() {
		this(new TS3Config());
	}
	
	ServerConnectionManager(TS3Config serverConfig) {
		this.serverConfig = serverConfig;
	}
	
	/**
	 * Sets the timeout rate for commands send to the TeamSpeak 3 server. 
	 * 
	 * @param timeout	The duration (in milliseconds) before a command times-out. Default: 4000
	 */
	public void setCommandTimeout(int timeout) {
		serverConfig.setCommandTimeout(timeout);
	}
	
	/**
	 * Allows the specification of a connection handler for the server.
	 * 
	 * @param connectionHandler	A pre-made connection handler. Use null to use the bot's default reconnecting handler.
	 */
	public void setConnectionHandler(ConnectionHandler connectionHandler) {
		if (connectionHandler != null) {
			serverConfig.setConnectionHandler(connectionHandler);
			return;
		}
		else {
			ReconnectingConnectionHandler reconnecter = new ReconnectingConnectionHandler() {
				@Override
				public void setUpQuery(TS3Query query) {
					configureQuery(query.getApi());
				}
			};
			serverConfig.setConnectionHandler(reconnecter);
		}
		
	}
	
	/**
	 * A set of predefined commands used to connect the bot to a specific server instance 
	 * and take necessary steps for setting up operation.
	 * 
	 * @param api The API of the server being configured.
	 */
	private static void configureQuery(TS3Api api) {
		//TODO
	}
	
}
