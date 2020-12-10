package com.example.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Empleado;

public interface EmpleadoRepository extends MongoRepository<Empleado,String> {

	List<Empleado> findByDep(int Dep);
//void deleteByNombre(String name);
}
