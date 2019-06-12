package webadv.s16202202;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@GetMapping("/")
	public String test(Model model ) {
		model.addAttribute("message", "Hello world");
		return "login";
	}
	@GetMapping("/home")
	public String test() {		
		return "home";
	}
}
