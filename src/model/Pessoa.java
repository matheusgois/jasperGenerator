package model;

public class Pessoa {

	private String name;
	private String city;
	private String code;
	private String age;
	private String dog;
	private String cat;
	

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", city=" + city + ", code=" + code + ", age=" + age + ", dog=" + dog + ", cat="
				+ cat + "]";
	}
	

}
