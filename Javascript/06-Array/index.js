let listaCompras = ["Galletitas", "Carne", "Snacks", "Productos de limpieza", "Productos de higiene"]

let listaCompras2 = listaCompras.push('Aceite de Girasol')
let listaCompras3 = listaCompras.pop()

let objMovies = [
    {
        title: "The Hobbit: An Unexpected Journey",
        author: "Peter Jackson",
        year: 2012
    },
    {
        title: "The Hobbit: The Desolation of Smaug",
        author: "Peter Jackson",
        year: 2013
    },
    {
        title: "The Hobbit: The Battle of the Five Armies",
        author: "Peter Jackson",
        year: 2014
    }
]

let filterMovies = objMovies.filter(year => year.year > 2010)

let authorMovies = objMovies.map(aut => aut.author)

let titleMovies = objMovies.map(title => title.title)


let concat = authorMovies.concat(titleMovies)

let spreadOperator = [...authorMovies, ...titleMovies]






