package app;

import java.util.Arrays;
import java.util.List;

import recipient.Recipient;
import sender.Sender;

public class App {

	public static void main(String[] args) {
		
		var taro = Recipient.is("太郎", "taro@example.com");
		var alice = Recipient.is("Alice", "alice@example.com");
		List<Recipient> recipients = Arrays.asList(taro, alice);

		var sender = Sender.of(recipients);		
		sender.send(Sender.MailTypes.GREETING_MAIL);
	}
}
