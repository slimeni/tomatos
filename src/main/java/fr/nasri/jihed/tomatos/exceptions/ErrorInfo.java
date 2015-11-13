/**
 * 
 */
package fr.nasri.jihed.tomatos.exceptions;

/**
 * @author jihed
 * 
 *         Error Info Class
 *
 */
public class ErrorInfo {

	/**
	 * Request URL
	 */
	public final String url;

	/**
	 * Error message
	 */
	public final String error;

	/**
	 * Constructor
	 * 
	 * @param url
	 * @param ex
	 */
	public ErrorInfo(String url, Exception ex) {
		this.url = url;
		this.error = ex.getLocalizedMessage();
	}
}
