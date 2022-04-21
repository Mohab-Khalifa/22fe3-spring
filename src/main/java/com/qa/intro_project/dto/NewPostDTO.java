package com.qa.intro_project.dto;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewPostDTO {

	@NotNull
	@NotBlank
	@Size(min = 3, max = 32, message = "Title must have at least 3 characters, but no more than 32")
	private String title;
	
	@NotNull
	@NotBlank
	private String content;
	
	protected NewPostDTO() {
		
	}

	public NewPostDTO(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewPostDTO other = (NewPostDTO) obj;
		return Objects.equals(content, other.content) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "NewPostDTO [title=" + title + ", content=" + content + "]";
	}
	
}