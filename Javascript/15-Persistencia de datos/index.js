const nombre = "Gaston"
const apellido = "Roldan"

const datos = {
    nombre, 
    apellido
}

localStorage.setItem("datos", JSON.stringify(datos))
sessionStorage.setItem("datos", JSON.stringify(datos))

const cook = new Date()
document.cookie = `datos=${JSON.stringify(datos)}expires=${new Date(cook.getTime()+ 2 * 60000)}`