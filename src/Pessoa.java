
public class Pessoa {

	private String name;
	private String city;
	private int code;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", city=" + city + ", code=" + code + ", age=" + age + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
