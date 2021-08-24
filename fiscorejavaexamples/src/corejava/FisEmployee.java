package corejava;

public class FisEmployee {
	int id;
	String name;
	String dept;
	int experience;
	public FisEmployee() {
		
	}
	public FisEmployee(int id, String name, String dept, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.experience = experience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void showData() {
		System.out.println(id+" "+name+" "+dept+" "+experience);
	}

}
