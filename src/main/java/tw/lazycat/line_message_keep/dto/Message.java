package tw.lazycat.line_message_keep.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Message {
	private String type;
	private String id;
	@JsonProperty("quoteToken")
	private String quotetoken;
	private String text;
}
