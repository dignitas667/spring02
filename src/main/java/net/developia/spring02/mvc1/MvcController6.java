package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MvcController6 {

	@GetMapping("/want/{want}")
	public String want(@PathVariable("want") String want, Model model) {
		model.addAttribute("want", want + "가 하고 싶어요~");
		return "want";
	}
}
