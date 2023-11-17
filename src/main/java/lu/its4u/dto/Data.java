package lu.its4u.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {
	private String id;
	private long date;
	private String name;
	private String environment;
	private String description;
}
