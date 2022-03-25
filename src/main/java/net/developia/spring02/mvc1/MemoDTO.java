package net.developia.spring02.mvc1;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemoDTO implements Serializable {
	private String name;
	private String title;
	private String password;
	private String content;
}
