package com.ey.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReviewDto {

	@Size(min=5,message="Caption Size cannot be less than 5")
	private String caption;
	@NotNull(message="Comment cannot be Null")
	private String comment;
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
