/**
 * 
 */
package fr.nasri.jihed.tomatos.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import fr.nasri.jihed.tomatos.model.TomatoSale;

/**
 * @author jihed
 * 
 *         Tomato Service test Class
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TomatoServiceTest {

	@InjectMocks
	private TomatoService service;

	@Test
	public void testGetTomatoSales() {
		List<TomatoSale> sales = service.getTomatoSales(2);
		assertEquals(sales.size(), 2);
		assertTrue(sales.get(0).getTimestamp() < sales.get(1).getTimestamp());
	}

}
