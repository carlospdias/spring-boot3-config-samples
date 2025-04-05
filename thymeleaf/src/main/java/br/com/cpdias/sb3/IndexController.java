package br.com.cpdias.sb3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("message", "Hello World!");
        return mv;
    }
}
