package ru.smurtazin.models; 

public class Item {
	private String id;

  public String name;

  public String description;

  public long createDateTime;

  public Item(){

  }

  public Item(String name, String description, long createDateTime) {
  	this.name = name;
  	this.description = description;
  	this.createDateTime = createDateTime;
  }

  public String getName() {
  	return this.name;
  }

  public String getDescription() {
  	return this.description;
  }

  public long getCreateDateTime() {
  	return this.createDateTime;
  }

  public String getId() {
  	return this.id;
  }

  public void setId(String id) {
  	this.id = id;
  }
}
