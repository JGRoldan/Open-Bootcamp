const parrafos = document.querySelectorAll(".parrafo")
const secciones = document.querySelectorAll(".seccion")

parrafos.forEach(parrafo => {
    parrafo.addEventListener("dragstart", event => {
        parrafo.classList.add("dragging")
        event.dataTransfer.setData("id", parrafo.id)
    })
    parrafo.addEventListener("dragend", () => {
        parrafo.classList.remove("dragging")
    })
})

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault()
        event.dataTransfer.dropEffect = "copy"
    })

    seccion.addEventListener("drop", event => {
        let id_parrafo = event.dataTransfer.getData("id")
        let parrafo = document.getElementById(id_parrafo)
        seccion.appendChild(parrafo)
    })

    let papelera = document.querySelector(".papelera")

    papelera.addEventListener("dragover", event => {
        event.preventDefault()
        event.dataTransfer.dropEffect = "move"
    })

    papelera.addEventListener("drop", event => {
        let id_parrafo = event.dataTransfer.getData("id")
        document.getElementById(id_parrafo).remove()
    })
})