package sender;

import java.util.List;

import recipient.Recipient;

/**
 * メール送信インターフェイス
 */
public interface ISender {	
	
	/**
	 * 件名を返す
	 * @return 件名
	 */
	public String writeSubject();
	
	/**
	 * メールの本文を返す
	 * @return メール本文
	 */
	public String writeTextTo(List<Recipient> recipients);
}
