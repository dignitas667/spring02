package net.developia.spring02.mvc1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController8 {
	@GetMapping(value = "hello_str", produces = MediaType.TEXT_PLAIN_VALUE)
	//@ResponseBody
	public String hello_str() {
		return "Hello restful str~(get)";
	}
	
	@PostMapping(value = "hello_str", produces = MediaType.TEXT_PLAIN_VALUE)
	//@ResponseBody
	public String hello_str2() {
		return "Hello restful str~(post)";
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
	
	@GetMapping(value = "map2", produces = {MediaType.APPLICATION_XML_VALUE,
											MediaType.APPLICATION_JSON_VALUE})
	public Map<String, Object> getMap() {
		Map<String, Object> result = new HashMap<>();
		result.put("name", "서태웅");
		result.put("age", 16);
		result.put("position", "스몰포워드");
		return result;
	}
	
	@RequestMapping(value="map3", produces = {  MediaType.APPLICATION_XML_VALUE,
												MediaType.APPLICATION_JSON_VALUE})
	public Map<String, List<Map<String,Object>>> helloxml2() {
		Map map1 = new HashMap();
		map1.put("name", "Bruce Wayne");
		map1.put("year", 1930);
		map1.put("nickname", "Batman");
		map1.put("today", new Date());

		Map map2 = new HashMap();
		map2.put("name", "Selina Kyle");
		map2.put("year", 1940);
		map2.put("nickname", "Catwoman");
		map2.put("today", new Date());

		List<Map<String,Object>> members = new ArrayList<>();
		members.add(map1);
		members.add(map2);
		Map map =new HashMap();
		map.put("members", members);
		return map;
	}	
}
