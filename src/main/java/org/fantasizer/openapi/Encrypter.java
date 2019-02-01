package org.fantasizer.openapi;

/**
 * Encrypt and decrypt the message.
 * 
 * @author quxiaoyong 2019年2月1日
 *
 */
//TODO:该类需要重新设计。
public interface Encrypter {

	/**
	 * encrypt the content to AES.
	 * 
	 * @param content
	 * @param password
	 * @return
	 * @throws Exception
	 */
	String encryptAES(String content, String password) throws Exception;

	/**
	 * decrypt the encrypted content to decrypted string.
	 * 
	 * @param encrypted
	 * @param password
	 * @return
	 * @throws Exception
	 */
	String decryptAES(String encrypted, String password) throws Exception;

}
