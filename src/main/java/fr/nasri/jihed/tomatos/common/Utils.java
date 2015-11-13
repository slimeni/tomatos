/**
 * 
 */
package fr.nasri.jihed.tomatos.common;

import java.util.Random;
import java.util.UUID;

import org.joda.time.DateTime;

/**
 * @author jihed
 *
 *         Utility Class
 */
public final class Utils {

	/**
	 * Random Class instance
	 */
	private static final Random random = new Random();

	/**
	 * Generate a random UUID
	 * 
	 * @return random UUID
	 */
	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Generate random Tomato Number
	 * 
	 * @return random Tomato Number
	 */
	public static int generateTomatosNumber() {
		return random.nextInt(Constants.MAX_TOMATOS_NUMBER);
	}

	/**
	 * Generate a random provider
	 * 
	 * @return random provider
	 */
	public static String generateProvider() {
		return Provider.getRandomProvider().getValue();
	}

	/**
	 * Generate random Timestamp
	 * 
	 * @return random Timestamp
	 */
	public static long generateTimestamp() {
		return getRandomLong(getLongStartOfTheYear(), getLongToday());
	}

	/**
	 * Get the beginning of the year in long format
	 * 
	 * @return beginning of the year in long format
	 */
	private static long getLongStartOfTheYear() {
		DateTime dateTime = new DateTime();
		dateTime = dateTime.dayOfYear().withMinimumValue()
				.withTimeAtStartOfDay();
		return dateTime.getMillis();
	}

	/**
	 * Get today in long format
	 * 
	 * @return today in long format
	 */
	private static long getLongToday() {
		return new DateTime().withTimeAtStartOfDay().getMillis();
	}

	/**
	 * Random long between x an y
	 * 
	 * @param x
	 * @param y
	 * @return random long
	 */
	private static long getRandomLong(long x, long y) {
		return x + ((long) (random.nextDouble() * (y - x)));
	}
}
