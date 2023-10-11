package com.acorn.day4.naver;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class ItemDTO {

	String title;
	String link;
	String image;
	String lprice;

	@Override
	public String toString() {
		return "ItemDTO [title=" + title + ", link=" + link + ", image=" + image + ", lprice=" + lprice + "]";
	}

	public ItemDTO(String title, String link, String image, String lprice) {
		super();
		this.title = title;
		this.link = link;
		this.image = image;
		this.lprice = lprice;
	}

	public ItemDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLprice() {
		return lprice;
	}

	public void setLprice(String lprice) {
		this.lprice = lprice;
	}
	
}
