use prueba
db.createCollection("empleados")
db.empleados.insertMany([{"Emp_no" : 1 ,  "Nombre" : "Juan" , "Dep" : 10 , "Salario" : 1000 , "Fechaalta" : "10/10/1999"},
{"Emp_no" : 2 ,  "Nombre" : "Alicia" , "Dep" : 10 , "Salario" : 1400 , "Fechaalta" : "07/08/2000" , "Oficio" : "Profesora"},
{"Emp_no" : 3 ,  "Nombre" : "Maria" , "Dep" : 20 , "Salario" : 1500 , "Fechaalta" : "05/01/2005" , "Oficio" : "Analista" , "Comision" : 100},
{"Emp_no" : 4 ,  "Nombre" : "Alberto" , "Dep" : 20 , "Salario" : 1100 , "Fechaalta" : "15/11/2001"},
{"Emp_no" : 5 ,  "Nombre" : "Unai" , "Dep" : 30 , "Salario" : 1400 , "Fechaalta" : "20/11/1999", "Comision" : 200, "Oficio":"Analista"}])