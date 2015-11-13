package fr.nasri.jihed.tomatos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.nasri.jihed.tomatos.exceptions.BadSizeException;
import fr.nasri.jihed.tomatos.exceptions.ErrorInfo;
import fr.nasri.jihed.tomatos.model.TomatoSale;
import fr.nasri.jihed.tomatos.services.TomatoService;

/**
 * @author jihed
 * 
 *         Rest Controller to handle tomato http request
 */
@RestController
public class TomatoController {

	private static final Logger logger = LoggerFactory
			.getLogger(TomatoController.class);

	/**
	 * The Tomato Service
	 */
	@Autowired
	private TomatoService service;

	/**
	 * Tomato request mapping
	 * 
	 * @param size
	 * @return list of Tomato sales
	 * @throws BadSizeException
	 */
	@RequestMapping(value = "/data", method = { RequestMethod.GET,
			RequestMethod.POST })
	public List<TomatoSale> getData(
			@RequestParam(value = "size", defaultValue = "3") int size)
			throws BadSizeException {
		logger.info("Getting lastest tomato sales, size =" + size);
		if (size <= 0) {
			// size can not be negative
			throw new BadSizeException(size);
		}

		return service.getTomatoSales(size);
	}

	/**
	 * Handle BadSizeException
	 * 
	 * @param req
	 * @param ex
	 * @return ErrorInfo
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BadSizeException.class)
	@ResponseBody
	public ErrorInfo handleBadRequest(HttpServletRequest req, Exception ex) {
		return new ErrorInfo(req.getRequestURL().toString(), ex);
	}
}
