package net.developia.spring02.mvc1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController8 {
	@GetMapping(value = "hello_str", produces = MediaType.TEXT_PLAIN_VALUE)
	//@ResponseBody
	public String hello_str() {
		return "Hello restful str~";
	}
	
	
	@GetMapping(value = "hello_json", produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public MemoDTO getMemoJSON() {
		return new MemoDTO(
			"정대만", "그래 난 정대만!", "1234", "포기를 모르는 남자지", 1);
	}

	@GetMapping(value = "hello_xml", produces = MediaType.APPLICATION_XML_VALUE)
	//@ResponseBody
	public MemoDTO getMemoXML() {
		return new MemoDTO(
			"정대만", "그래 난 정대만!!", "1234", "포기를 모르는 남자지", 1);
	}
	
	@GetMapping(value = "map2json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> getMapJson() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "강백호");
		map.put("age", 16);
		map.put("position", "파워포워드");
		return map;
	}

	@GetMapping(value = "map2xml", produces = MediaType.APPLICATION_XML_VALUE)
	public Map<String, Object> getMapXML() {
		Map<String, Object> result = new HashMap<>();
		result.put("name", "강백호");
		result.put("age", 16);
		result.put("position", "파워포워드");
		return result;
	}

}
