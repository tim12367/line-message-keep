package tw.lazycat.line_message_keep.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Deliverycontext {
	@JsonProperty("isRedelivery")
	private boolean isredelivery;
}
