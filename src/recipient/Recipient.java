package recipient;

/**
 * 
 * 受信者オブジェクト
 *
 */
public class Recipient {

	/**
	 * 受信者の名前
	 */
	final private String recipientName;
	
	/**
	 * メールアドレス
	 */
	final private String to;
	
	/**
	 * コンストラクタ
	 * @param to メールアドレス
	 */
	private Recipient(final String recipientName, final String to) {
		this.recipientName = recipientName;
		this.to = to;
	}
	
	/**
	 * ファクトリメソッド
	 * @param to メールアドレス
	 * @return 受信者メールアドレス
	 */
	public static Recipient is(final String recipientName, final String to) {
		return new Recipient(recipientName, to);
	}
	
	/**
	 * 受信者名を返す
	 * @return 受信者名
	 */
	public String getRecipientName() {
		return recipientName;
	}

	/**
	 * 受信者のメールアドレス（To）を得る
	 * @return 受信者のメールアドレス（To）
	 */
	public String getTo() {
		return to;
	}
}
