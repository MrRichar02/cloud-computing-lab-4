package co.udea.app_demo_cloud_4.controllers;

import co.udea.app_demo_cloud_4.models.User;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * DemoController
 */
@Controller 
public class DemoController {

	@GetMapping("/home")
	public String home(Model model){
		List<User> users = Arrays.asList(
				new User("Ricardo", 21, "ricardo.medinah@udea.edu.co"),
				new User("Argenis", 22, "argenis.medina@udea.edu.co"),
				new User("Diego", 21, "juan.duque31@udea.edu.co")
				);
		model.addAttribute("users", users);
		return "home";
	}

}
