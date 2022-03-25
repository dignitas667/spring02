package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/mvc")
public class MvcController1 {

	@RequestMapping("/hello")
	public void hello1() {
		log.info("hello 수행 중...");
	}

	@RequestMapping("/hi")
	public String hi() {
		log.info("hi 수행 중...");
		return "hello";
	}
}
