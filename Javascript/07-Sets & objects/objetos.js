let datos = {
    nombre: "gaston",
    apellido:"roldan",
    edad:27,
    altura:175,
    isDeveloper:true
}
  
let { edad } = datos

  
let list = [
    {
        ...datos
    },
    {
        nombre: "John",
        apellido: "Smith",
        edad: "30",
        alutra: "200",
        isDeveloper: false
    },
    {
        nombre: "Juan",
        apellido: "Gonzalez",
        edad: "28",
        alutra: "174",
        isDeveloper: false
    }
]

let sortList = list.sort((a, b) => b.edad - a.edad)



 