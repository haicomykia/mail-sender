package sender;

import java.util.HashMap;
import java.util.List;

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
	final private HashMap<MailTypes, ISender> senders;
	
	/**
	 * 受信者
	 */
	private List<Recipient> recipients;

	private Sender() {
		HashMap<MailTypes, ISender> senders = new HashMap<>();
		senders.put(MailTypes.GREETING_MAIL, new GreetingMailSender());
		this.senders = senders;
	}
	
	/**
	 * コンストラクタ
	 */
	private Sender(final List<Recipient> recipients) {
		this();
		this.recipients = recipients;
	}
	
	/**
	 * ファクトリメソッド
	 * @param recipient 受信者オブジェクト
	 * @return Senderクラスのインスタンス
	 */
	public static Sender of(final List<Recipient> recipients) {
		return new Sender(recipients);
	}

	/**
	 * メール送信
	 * @param mailType 送信するメールの種類
	 * @param recipient 受信者オブジェクト
	 */
	public void send(final MailTypes mailType) {
		ISender sender = this.senders.get(mailType);
		
		System.out.println(sender.writeSubject());
		System.out.println(sender.writeTextTo(this.recipients));
	}
}
