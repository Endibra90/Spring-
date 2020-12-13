package com.example.mongodb.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Empleado;

public interface EmpleadoRepository extends MongoRepository<Empleado,String> {

	List<Empleado> findByDep(int Dep);
	List<Empleado> findByNombre(String name);
	List<Empleado> findBySalarioGreaterThan(Double salario);
	void deleteByNombre(String name);
	List<Empleado> deleteByDep(int Dep);
	List<Empleado> findByDepIn(ArrayList<Integer>listaDep);
	List<Empleado> findBySalarioGreaterThanAndOficio(Double salario,String oficio);
	List<Empleado> findByOficio(String profesion);
	List<Empleado> findByComisionNotNull();
	
//void deleteByNombre(String name);
}
