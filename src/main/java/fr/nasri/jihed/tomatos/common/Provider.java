/**
 * 
 */
package fr.nasri.jihed.tomatos.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author jihed
 * 
 *         Provider Enum
 *
 */
public enum Provider {
	A("Heinz"), B("Hunt's"), C("Del Monte"), D("Le Ol' Granma");

	/**
	 * The value
	 */
	private String value;

	/**
	 * Constructor with value
	 * 
	 * @param value
	 */
	private Provider(String value) {
		this.setValue(value);
	}

	/**
	 * The List of possible provider values
	 */
	private static final List<Provider> VALUES = Collections
			.unmodifiableList(Arrays.asList(values()));

	/**
	 * List of values size
	 */
	private static final int SIZE = VALUES.size();

	/**
	 * Random Class instance
	 */
	private static final Random RANDOM = new Random();

	/**
	 * Get a random provider
	 * 
	 * @return
	 */
	public static Provider getRandomProvider() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}