package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class MainConroller { //para utilizar el controller tiene que hacer lic derecho en la clase principal que contiene el método main (src/main/java) y seleccionar Run As > Spring Boot App.

		@GetMapping("/index")

		public String getIndex() {
			return "index";
		}
}