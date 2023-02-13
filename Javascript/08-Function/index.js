const alwaysTrue = () => true;

async function promesa(){
    setTimeout(() => console.log("Soy una promesa"), 5000)
}


function* indicesPares() {
    let i = 0
    
    while (true) {
        yield i+=2
    }
}
const pares = indicesPares()
