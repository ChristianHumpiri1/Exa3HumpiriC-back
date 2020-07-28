package pe.edu.upeu.Cliente.entity;

public class Cliente {
   public int idcliente;
   public String dni;
   public String nombre;
   public String fechanac;
   public String sexo;
   public String observacion;
public Cliente() {
	super();
	// TODO Auto-generated constructor stub
}
public Cliente(int idcliente, String dni, String nombre, String fechanac, String sexo, String observacion) {
	super();
	this.idcliente = idcliente;
	this.dni = dni;
	this.nombre = nombre;
	this.fechanac = fechanac;
	this.sexo = sexo;
	this.observacion = observacion;
}
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getFechanac() {
	return fechanac;
}
public void setFechanac(String fechanac) {
	this.fechanac = fechanac;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getObservacion() {
	return observacion;
}
public void setObservacion(String observacion) {
	this.observacion = observacion;
}
   
   
}
