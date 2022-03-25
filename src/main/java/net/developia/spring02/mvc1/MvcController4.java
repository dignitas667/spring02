package net.developia.spring02.mvc1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController4 {

	@GetMapping("/param")
	public String param() {
		return "param";
	}
	
	@PostMapping("/param")
	public String param(String name) {
		log.info("name : " + name);
		return null;
	}
}
