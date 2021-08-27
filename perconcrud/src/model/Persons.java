package model;

public class Persons {
	private String name;
	private String city;
	private String state;
	public Persons() {
		
	}
	public Persons(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
