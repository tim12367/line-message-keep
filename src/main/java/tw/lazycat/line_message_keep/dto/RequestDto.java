package tw.lazycat.line_message_keep.dto;

import java.util.List;

import lombok.Data;

@Data
public class RequestDto {
	private String destination;
	private List<Events> events;
}
