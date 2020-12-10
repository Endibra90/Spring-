package com.example.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.repository.EmpleadoRepository;
import com.example.mongodb.model.*;

@RequestMapping("/empleados")
@RestController
public class EmpleadoController {
@Autowired
private EmpleadoRepository repository;

@GetMapping("/todos")
public List<Empleado> getEmpleados(){
	return repository.findAll();
}
@GetMapping("/porDep/{dep}")
public List<Empleado> getEmpleadosPorDep(@PathVariable int dep){
	return repository.findByDep(dep);
}
}
