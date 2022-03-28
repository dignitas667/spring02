package net.developia.spring02.mvc1;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class MemoDTO implements Serializable {
	@Length(min = 2, max = 6)
	private String name;
	
	@NotBlank
	private String title;
	
	@Length(min = 2)
	private String password;
	
	@Length(min = 1, max = 100)
	private String content;
	
	@Range(min = 1, max = 2)
	private int gen;
}
