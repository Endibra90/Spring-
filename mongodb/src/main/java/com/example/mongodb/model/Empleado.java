package com.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="empleados")
public class Empleado {
@Id
private String _id;
private String Nombre;
@Field("Dep")
private int dep;
@Field("Oficio")
private String oficio;
@Field("Comision")
private double comision;
@Field("Salario")
private double salario;
@Field("Emp_no")
private double emp_no;
@Field("Fechaalta")
private String fechaalta;
public Empleado(){

}
public Empleado(String id, String nombre, int dep,String oficio,Double comision,double salario,String fechaalta){
	this.Nombre=nombre;
	this.dep=dep;
}
public String get_id() {
	return _id;
}
public void set_id(String _id) {
	this._id = _id;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getDep() {
	return dep;
}
public void setDep(int dep) {
	dep = dep;
}
public String getOficio() {
	return oficio;
}
public void setOficio(String oficio) {
	oficio = oficio;
}
public double getComision() {
	return comision;
}
public void setComision(double comision) {
	comision = comision;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	salario = salario;
}
public double getEmp_no() {
	return emp_no;
}
public void setEmp_no(double emp_no) {
	emp_no = emp_no;
}
public String getFechaalta() {
	return fechaalta;
}
public void setFechaalta(String fechaalta) {
	fechaalta = fechaalta;
}




}
