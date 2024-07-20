package tw.lazycat.line_message_keep.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Events {
	private String type;
	private Message message;
	@JsonProperty("webhookEventId")
	private String webhookeventid;
	@JsonProperty("deliveryContext")
	private Deliverycontext deliverycontext;
	private long timestamp;
	private Source source;
	@JsonProperty("replyToken")
	private String replytoken;
	private String mode;
}
