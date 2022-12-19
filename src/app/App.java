package app;

import recipient.Recipient;
import sender.Sender;
import sender.Sender.MailTypes;

public class App {

	public static void main(String[] args) {
		var recipient = new Recipient();
		var sender = new Sender(recipient);
		
		for (MailTypes mail : Sender.MailTypes.values()) {
			sender.send(mail);
		}
	}
}
