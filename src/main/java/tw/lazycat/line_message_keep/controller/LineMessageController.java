package tw.lazycat.line_message_keep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import tw.lazycat.line_message_keep.dto.RequestDto;
import tw.lazycat.line_message_keep.service.KeepMessageService;

@RestController
@Slf4j
public class LineMessageController {
	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private KeepMessageService keepMessageService;

	@PostMapping("/linebot")
	public void linebot(@RequestBody RequestDto req) throws JsonProcessingException {
		log.debug("\n" + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(req));
		keepMessageService.save(req);
	}
}
