//Works with Prog3.java
public class Info {
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public Info() { }

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Info(String name, String address, int age, String phoneNumber) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", address=" + address + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
