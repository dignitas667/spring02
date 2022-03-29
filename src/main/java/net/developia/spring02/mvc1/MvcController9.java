package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController9 {
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String test() {
		return "info";
	}
	
	@RequestMapping(value="/info", method=RequestMethod.POST)
	@ResponseBody
	public void print(@RequestBody MemoDTO dto) {
		log.info(dto.toString());
	}
}
