package com.ecoustic.autocomplete.acoustic.search;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	final Logger logger = LoggerFactory.getLogger(TopicController.class);
	
	@RequestMapping("/topics")
	@ResponseBody
	public List<Topic> getTopicsQ(@RequestParam String q) {
		System.out.println(q+"..................");
		return topicService.getFindName(q);
	}
	
	@RequestMapping("/topics/desc")
	@ResponseBody
	public List<Topic> getTopicsDesc(@RequestParam String q) {
		System.out.println(q+"..................desc");
		return topicService.getFindDesc(q);
	}
	@PostMapping(path = "/name")
	public List<Topic> getbyNames(@RequestBody Name name) {
		System.out.println(name.name+"..................2");
		return topicService.getFindName(name.name);
	}
}
