package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController7 {
	@GetMapping("/form")
	public void form() {}
	
	@PostMapping("/form")
	public String form(MemoDTO memoDTO, String param1, Model model) {
		log.info(memoDTO.toString());
		model.addAttribute("param1", param1);
		return "form_result";
	}
}
