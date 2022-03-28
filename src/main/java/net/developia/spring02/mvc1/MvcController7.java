package net.developia.spring02.mvc1;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController7 {
	@GetMapping("/form")
	public String form() { return "form"; }
	
	@PostMapping("/form")
	// command 객체 전달...
	public String form(
			@Valid @ModelAttribute MemoDTO memoDTO, 
			BindingResult br,
			@RequestParam(defaultValue = "") String param1, 
			Model model) {
		
		if (br.hasErrors()) {
			return "form";
		} else {
			log.info(memoDTO.toString());
			//model.addAttribute("param1", param1);
			return "form_result";
		}
	}
	
	@GetMapping("jquerytest")
	public String jquerytest() {
		return "jquerytest";
	}
}
