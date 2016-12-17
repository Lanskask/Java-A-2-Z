package ru.smurtazin.models;

public class Item {
	private String id;
	private String name;
	private String description;
	private long creationDate;
	private String[] commentsList;

	public Item() {		
	}
	public Item(String name, String description, long creationDate) {
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
	}
	public Item(String name, String description, long creationDate, String[] commentsList) {
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
	public long getCreationDate() {
		return this.creationDate;
	}
	public String[] getCommentsList() {
		return this.commentsList;
	}

	public String setId(String id) {
		this.id = id;
	}
	public String setName(String name) {
		this.name = name;
	}
	public String setDescription(String description) {
		this.description = description;
	}
	public long setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}
	public String[] setCommentsList(String[] commentsList) {
		this.commentsList = commentsList;
	}




}