package cat.itacademy.barcelonactiva.Leal.Victor.s04.t01.n02.S04T01N02LealVictor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping ("/HelloWorld")
	@ResponseBody
	public String saluda(@RequestParam (defaultValue="UNKNOWN")String nom) {

		if(nom.equals("UNKNOWN")) {

			return "Hola. Estàs executant un projecte Gradle.";

		}else {

			return "Hola, "+ nom + ". Estàs executant un projecte Gradle.";
		}
	}

	@GetMapping (value={"/HelloWorld2/{nom}", "/HelloWorld2"})
	@ResponseBody
	public String saluda2(@PathVariable (required=false) String nom) {

		if (nom!=null) {

			return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
		}else {

			return "Hola! Estàs executant un projecte Gradle.";
		}
	}
}
