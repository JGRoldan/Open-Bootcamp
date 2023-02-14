class Estudiante{
    nombre = "Gaston"
    asignaturas = ["Java","Javascript", "Python"]
    
    getDatos(){
      return ({
        nombre : this.nombre,
        asignaturas : this.asignaturas,
      } )
    }
}
  
const alumno = new Estudiante()
console.log(alumno.getDatos())
  