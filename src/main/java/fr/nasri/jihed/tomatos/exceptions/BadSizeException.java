/**
 * 
 */
package fr.nasri.jihed.tomatos.exceptions;

import fr.nasri.jihed.tomatos.common.Constants;

/**
 * @author jihed
 *
 */
public class BadSizeException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * 
	 * @param sizeValue
	 */
	public BadSizeException(int sizeValue) {
		super(Constants.BAD_SIZE_MESSAGE_EXEPTION + sizeValue);
	}

}
