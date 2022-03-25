package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController3 {
	
	@RequestMapping(value="/iam", method= {
		RequestMethod.POST,
		RequestMethod.GET })
	public String iam(Model model) {
		model.addAttribute("iam", "그래, 난 정대만");
		return "iam";
	}
	
	@PostMapping("iam2")
	public String iam2(Model model) {
		model.addAttribute("iam", "그래, 난 정대만...");
		return "iam";
	}
}
