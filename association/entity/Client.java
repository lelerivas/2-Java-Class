package entity;

import java.util.List;

public class Client {

	private Integer idCliente;
	private String name;
	private String registrationcod;
	private List<Property> property;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(Integer idCliente, String name, String registrationcod) {
		super();
		this.idCliente = idCliente;
		this.name = name;
		this.registrationcod = registrationcod;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationcod() {
		return registrationcod;
	}

	public void setRegistrationcod(String registrationcod) {
		this.registrationcod = registrationcod;
	}

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}
		
}
