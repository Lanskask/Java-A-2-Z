package ru.smurtazin.models;

import java.util.Date;
import java.util.HashMap;

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

	public Item(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Item(String id, String name, String description, Date creationDate) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Item{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", creationDate=" + creationDate +
				'}';
	}

	/**
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
//        return super.hashCode();
    }

    /**
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument;
     *          {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        // TODO: Shold here be as initial value true or false?
        boolean isEqual = false;
        Item other = (Item) obj;

        if (this == obj) {
            isEqual = true;
        } else if (obj == null) {
            isEqual = false;
        } else if (getClass() != obj.getClass()) {
            isEqual = false;
        } else if (this.name != other.name ) {
            isEqual = false;
        } else if (this.description != other.description) {
            isEqual = false;
        } else if (this.creationDate != other.creationDate) {
            isEqual = false;
        }
        return isEqual;
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