let name = 'Gaston'
let surname = 'Roldan'
let estudiante = `${name} ${surname}`

let estudianteMayus = estudiante.toUpperCase()
let estudianteMinus = estudiante.toLocaleLowerCase()

let caracteres = estudiante.length

let firsChars = name[0]
let lastChars = surname[surname.length - 1]

let deleteBlank = estudiante.replace(' ', '')

let nameInEstudiante = estudiante.includes(name)
