package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController6 {

	@GetMapping("/want/{want}")
	public String want(@PathVariable("want") String want, Model model) {
		model.addAttribute("iwant", want + "가 하고 싶어요~");
		return "want";
	}
	
	@GetMapping("/want/{want}/{teacher}")
	public String want(
		@PathVariable("want") String want,
		@PathVariable("teacher") String teacher,
		Model model) {
		model.addAttribute("want", teacher +"님," + want + "가 하고 싶어요~");
		return "want";
	}

	@GetMapping("/want/hello")
	public String hello(){
		return "hello";
	}
	
}
