package sender;

import java.io.IOException;

import recipient.Recipient;

/**
 * メール送信インターフェイス
 */
public interface ISender {	
	/**
	 * 送信処理
	 * @return メール送信成否
	 */
	public boolean send(Recipient recipient) throws IOException;
}
