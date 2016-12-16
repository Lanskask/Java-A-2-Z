package ru.smurtazin.models;

public class Task extends Item {

	/*public String name;
	public String description;
	public long create;*/

	public Task(String name, String desc)	{
		this.name = name;
		this.description = desc;
	}

	public String calculatePrice() {
		return "100%";
	}
}