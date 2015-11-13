/**
 * 
 */
package fr.nasri.jihed.tomatos.model;

import java.io.Serializable;

/**
 * The tomato sale
 * 
 * @author jihed
 * 
 *         Tomato Sale Class
 *
 */
public class TomatoSale implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The id.
	 */
	private String id;

	/**
	 * The tomatoes.
	 */
	private int tomatoes;

	/**
	 * The provider.
	 */
	private String provider;

	/**
	 * The timestamp.
	 */
	private long timestamp;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the tomatoes
	 */
	public int getTomatoes() {
		return tomatoes;
	}

	/**
	 * @param tomatoes
	 *            the tomatoes to set
	 */
	public void setTomatoes(int tomatoes) {
		this.tomatoes = tomatoes;
	}

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider
	 *            the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
