db.getCollection("empleados").aggregate([{$match : {Comision:{$gt:20}}},{$set:{Comision:{$sum:["$Comision",-20]}}}])