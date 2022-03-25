package net.developia.spring02.mvc1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController4 {

	@GetMapping("/param")
	public String param() {
		return "param";
	}
	
	@PostMapping("/param")
	public String param(
		@RequestParam(defaultValue = "불꽃남자") String name,
		Model model) {
		log.info("name : " + name);
		String iam = "그래 난 " + name + ".";
		model.addAttribute("iam", iam);
		return "param_result";
	}
}
