/**
 * 
 */
package fr.nasri.jihed.tomatos.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.nasri.jihed.tomatos.common.Utils;
import fr.nasri.jihed.tomatos.model.TomatoSale;

/**
 * @author jihed
 * 
 *         The tomato service
 * 
 */
@Service
public class TomatoService {

	/**
	 * Get the tomato sales list
	 * 
	 * @param size
	 * @return Tomato sales list
	 */
	public List<TomatoSale> getTomatoSales(Integer size) {

		List<TomatoSale> sales = new ArrayList<TomatoSale>();

		for (int i = 0; i < size; i++) {
			TomatoSale sale = new TomatoSale();
			sale.setId(Utils.generateUUID());
			sale.setProvider(Utils.generateProvider());
			sale.setTomatoes(Utils.generateTomatosNumber());
			sale.setTimestamp(Utils.generateTimestamp());
			sales.add(sale);
		}

		// Order list by timestamp
		Collections.sort(sales, (s1, s2) -> Long.valueOf(s1.getTimestamp())
				.compareTo(Long.valueOf(s2.getTimestamp())));

		return sales;
	}

}
