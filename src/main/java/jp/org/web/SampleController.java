package jp.org.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "showMessage";
    }
}
