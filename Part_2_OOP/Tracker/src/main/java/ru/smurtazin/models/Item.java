package ru.smurtazin.models;

import java.util.Date;

public class Item {
	private String id;
	private String name;
	private String description;
	private Date creationDate;
	private String[] commentsList = new String[10];
	private int comment_inList_position = 0;

	public Item() {		
	}
	public Item(String name, String description, Date creationDate) {
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
	}
	public Item(String name, String description, Date creationDate, String[] commentsList) {
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
		this.commentsList = commentsList;
	}

	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public Date getCreationDate() {
		return this.creationDate;
	}
	public String[] getCommentsList() {
		return this.commentsList;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setCommentsList(String[] commentsList) {
		this.commentsList = commentsList;
	}
	public void addComment(String comment) {
		this.commentsList[comment_inList_position++] = comment;
	}

}