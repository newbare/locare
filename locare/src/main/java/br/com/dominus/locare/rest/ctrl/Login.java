package br.com.dominus.locare.rest.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locare")
public class Login {
	
    @RequestMapping("/login")
    public String index() {
        return "pagina inicial Funfando!";
    }

}