/**
 * 
 */
package fr.nasri.jihed.tomatos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fr.nasri.jihed.tomatos.exceptions.BadSizeException;
import fr.nasri.jihed.tomatos.model.TomatoSale;
import fr.nasri.jihed.tomatos.services.TomatoService;

/**
 * @author jihed
 * 
 *         Tomato Controller Test Class
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TomatoControllerTest {

	@Mock
	private TomatoService mockTomatoServie;

	@InjectMocks
	private TomatoController controller;

	private List<TomatoSale> sales;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sales = new ArrayList<TomatoSale>();
		sales.add(new TomatoSale());
	}

	@Test
	public void testGetData() throws BadSizeException {
		when(mockTomatoServie.getTomatoSales(anyInt())).thenReturn(null);
		assertNull(controller.getData(3));
		when(mockTomatoServie.getTomatoSales(anyInt())).thenReturn(sales);
		assertEquals(controller.getData(3), sales);
		verify(mockTomatoServie, times(2)).getTomatoSales(anyInt());
	}

	@Test(expected = BadSizeException.class)
	public void testGetDataException1() throws BadSizeException {
		assertNull(controller.getData(0));
		verify(mockTomatoServie, times(0)).getTomatoSales(anyInt());
	}

	@Test(expected = BadSizeException.class)
	public void testGetDataException2() throws BadSizeException {
		assertNull(controller.getData(-5));
		verify(mockTomatoServie, times(0)).getTomatoSales(anyInt());
	}

}
