package jp.org.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* Handles requests for the application home page.
*/
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	* Simply selects the home view to render by returning its name.
	*/
	@RequestMapping(value = "/login")
	public String home(Locale locale, Model model) {
		return "login";
	}
}