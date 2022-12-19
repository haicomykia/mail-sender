package sender;

import java.io.IOException;

import recipient.Recipient;

public class GreetingMailSender implements ISender {
	@Override
	public boolean send(Recipient recipient) throws IOException {
		System.out.println("メールを送りました。");
		return false;
	}
}
