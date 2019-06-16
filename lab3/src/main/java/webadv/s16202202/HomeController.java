package webadv.s16202202;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
	public class HomeController implements WebMvcConfigurer {
		
		@Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/").setViewName("login");
	        registry.addViewController("/home").setViewName("welcome");
	    }
		
	@PostMapping("/login")
	public String check(@Validated User user, BindingResult bindingResult, Model model) {
			if (bindingResult.hasFieldErrors()) {
				model.addAttribute(user);
				return "login";
			}else
				return "redirect:home";
		}
	}
 
