package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController2 {

	@RequestMapping("hello2")
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello2");
		mav.addObject("msg1", "안선생님~");
		mav.addObject("msg2", "농구가 하고 싶어요ㅠㅠ");
		return mav;
	}
	
	@RequestMapping("hello3")
	public ModelAndView hello3() {
		return new ModelAndView("hello2","msg1", "슬램덩크~");
	}
	
	@RequestMapping("hello4")
	public String hello4(Model model) {
		model.addAttribute("msg1", "강백호씨");
		model.addAttribute("msg2", "농구 좋아하세요~?");
		return "hello2";
	}
	
}
