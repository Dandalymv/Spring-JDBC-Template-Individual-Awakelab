package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.model.bean.Oficina;
import spring.model.service.OficinaService;

@Controller
public class OficinaController {
	
	@Autowired
	private OficinaService os;
	
	@RequestMapping(path = "/oficinas", method = RequestMethod.GET)
    public ModelAndView mostrarPagina() {
		
		List<Oficina> oficinas = os.getAll();
		
        return new ModelAndView("oficinas", "oficinas", oficinas);
    }

	
}
