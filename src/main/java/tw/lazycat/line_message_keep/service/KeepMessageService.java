package tw.lazycat.line_message_keep.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import tw.lazycat.line_message_keep.dto.Events;
import tw.lazycat.line_message_keep.dto.Message;
import tw.lazycat.line_message_keep.dto.RequestDto;

@Component
@Slf4j
public class KeepMessageService {

	public void save(RequestDto req) {
		for (Events e : req.getEvents()) {
			// 判斷EVENT類別為訊息
			String eventType = e.getType();
			if ("message".equals(eventType)) {
				// 取出訊息
				Message message = e.getMessage();
				String messageType = message.getType();

				// 判斷訊息類型
				switch (messageType) {
				case "text" -> this.saveMessage(e);
				case "image" -> this.saveImage(e);
				case "audio" -> this.saveAudio(e);
				case "video" -> this.saveVideo(e);
				case "sticker" -> this.saveSticker(e);
				default -> log.error("Unhandel type: " + messageType);
				}
			}
		}
	}

	private void saveMessage(Events e) {
		// TODO Auto-generated method stub

	}

	private void saveImage(Events e) {
		// TODO Auto-generated method stub

	}

	private void saveAudio(Events e) {
		// TODO Auto-generated method stub

	}

	private void saveVideo(Events e) {
		// TODO Auto-generated method stub

	}

	private void saveSticker(Events e) {
		// TODO Auto-generated method stub

	}
}
