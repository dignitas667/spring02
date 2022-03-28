package net.developia.spring02.mvc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController8 {
	@GetMapping("hello_rest")
	public String hello_rest() {
		return "Hello restful";
	}
}
