package net.developia.spring02.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController5 {
	@GetMapping("/scissors")
	public void scissors() {}
	
	@PostMapping("/scissors")
	public String scissors(@RequestParam int you, Model model) {
		String[] caption = {"가위", "바위", "보"};
		log.info("you : " + you);
		
		// com을 1~3사이의 정수를 난수발생
		int com = (int)(Math.random()*3) +1;
		
		model.addAttribute("you", caption[you - 1]); // you object를 1이면 가위,2는 바위, 3은 보
		model.addAttribute("com", caption[com - 1]); // com object를 1이면 가위,2는 바위, 3은 보
		model.addAttribute("win", winner(you, com)); // "당신의 승리 or 당신의 패배 or 무승부입니다"
		return "scissors_result";
	}

	private String winner(int you, int com) {
		switch ((you - com + 3) % 3) {
		case 1:	return "당신의 승리";
		case 2:	return "당신의 패배";
		default:return "비겼습니다";
		}
	}
	
}
