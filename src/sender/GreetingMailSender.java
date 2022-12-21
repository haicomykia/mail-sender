package sender;

import java.util.List;
import java.util.StringJoiner;

import recipient.Recipient;

/**
 * 挨拶状の送信者
 */
public class GreetingMailSender implements ISender {
	
	@Override
	public String writeSubject() {
		return "【件名】ご挨拶";
	}
	
	@Override
	public String writeTextTo(List<Recipient> recipients) {
		
		StringJoiner dest = new StringJoiner(", ");
		
		for (Recipient recipient : recipients) {
			dest.add(recipient.getRecipientName() + "様");
		}
		
		String text = """
				%s
				メリークリスマス！
				""".formatted(dest.toString());
		
		return text;
	}
}
