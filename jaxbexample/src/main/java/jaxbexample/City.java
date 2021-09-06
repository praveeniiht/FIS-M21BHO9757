package jaxbexample;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class City {
	
	String name;
	String max;
	String min;
	
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "max")
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	
	@XmlElement(name = "min")
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
}
