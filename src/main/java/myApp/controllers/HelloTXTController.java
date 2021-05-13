package myApp.controllers;

import myApp.components.OutText;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloTXTController {
    @GetMapping
    public String helloPage(@RequestParam(value = "surname",required = false) String surname,
                            Model model, HttpServletResponse response) throws IOException {
        model.addAttribute("message",new OutText().hell());

        return "firstPage/helloTXT";
    }
}
