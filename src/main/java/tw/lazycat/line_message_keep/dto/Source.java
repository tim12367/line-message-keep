package tw.lazycat.line_message_keep.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Source {
	private String type;
	@JsonProperty("userId")
	private String userid;
}
