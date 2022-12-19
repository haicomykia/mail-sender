package sender;

import java.io.IOException;
import java.util.HashMap;

import recipient.Recipient;

/**
 * メール送信者クラス
 */
public class Sender {

	/**
	 * メールの種別
	 */
	public static enum MailTypes {
		/**
		 * 挨拶状
		 */
		GREETING_MAIL,
	}
	
	/**
	 * メールの種類と送信者オブジェクトのMap
	 */
	private HashMap<MailTypes, ISender> senders;
	
	/**
	 * 受信者
	 */
	private Recipient recipient;
	
	/**
	 * コンストラクタ
	 */
	public Sender(Recipient recipient) {
		
		HashMap<MailTypes, ISender> senders = new HashMap<>();
		senders.put(MailTypes.GREETING_MAIL, new GreetingMailSender());
		this.senders = senders;
		
		this.recipient = recipient;
	}

	/**
	 * メール送信
	 * @param mailType 送信するメールの種類
	 * @param recipient 受信者オブジェクト
	 */
	public void send(MailTypes mailType) {
		
		ISender sender = this.senders.get(mailType);
		
		try {
			sender.send(recipient);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
}
