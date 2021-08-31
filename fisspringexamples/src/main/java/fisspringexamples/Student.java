package fisspringexamples;

public class Student {
	int htno;
	String name;
	Address address;
	public void test() {
		System.out.println("Ht No. = "+htno+" Name = "+name);
		System.out.println(address);
	}
	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address=address;
		
	}
	public Address getAddress() {
		return address;
	}

}
