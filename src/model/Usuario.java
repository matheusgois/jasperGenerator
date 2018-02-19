package model;

public class Usuario {

	private String id;
	private String name;
	private String usercode;
	private String password;
	private String idDomain;
	private String status;
	private String registration;
	private String email;
	private String dateCreated;
	private String dateLastLogin;
	private String passwordChange;
	private String passwordPolicy;
	private String dateLastChangeLogin;
	private String administrator;
	private String funcionario;
	private String cadastrado;
	private String obstruido;
		
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	public String getCadastrado() {
		return cadastrado;
	}
	public void setCadastrado(String cadastrado) {
		this.cadastrado = cadastrado;
	}
	public String getObstruido() {
		return obstruido;
	}
	public void setObstruido(String obstruido) {
		this.obstruido = obstruido;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdDomain() {
		return idDomain;
	}
	public void setIdDomain(String idDomain) {
		this.idDomain = idDomain;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateLastLogin() {
		return dateLastLogin;
	}
	public void setDateLastLogin(String dateLastLogin) {
		this.dateLastLogin = dateLastLogin;
	}
	public String getPasswordChange() {
		return passwordChange;
	}
	public void setPasswordChange(String passwordChange) {
		this.passwordChange = passwordChange;
	}
	public String getPasswordPolicy() {
		return passwordPolicy;
	}
	public void setPasswordPolicy(String passwordPolicy) {
		this.passwordPolicy = passwordPolicy;
	}
	public String getDateLastChangeLogin() {
		return dateLastChangeLogin;
	}
	public void setDateLastChangeLogin(String dateLastChangeLogin) {
		this.dateLastChangeLogin = dateLastChangeLogin;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", usercode=" + usercode + ", password=" + password
				+ ", idDomain=" + idDomain + ", status=" + status + ", registration=" + registration + ", email="
				+ email + ", dateCreated=" + dateCreated + ", dateLastLogin=" + dateLastLogin + ", passwordChange="
				+ passwordChange + ", passwordPolicy=" + passwordPolicy + ", dateLastChangeLogin=" + dateLastChangeLogin
				+ ", administrator=" + administrator + "]";
	}
	
	
	
	
}
