// as duas formas de declarar um array utilizam como
// base o prototipo Array
const elementos = []
const numeros = new Array()
// posso atribuir no array, qualquer tipo de dado

console.log(elementos, numeros)


const frutas = []
// para inserir um elemento do array uso o método push
frutas.push("banana")
console.log(frutas)

// método pop remove um elemento do array
frutas.pop("banana")
console.log(frutas)

// não verifica itens repetidos para incluir
// simplesmente inclui
frutas.push("banana")
console.log(frutas)
frutas.push("banana")
console.log(frutas)

// remove apenas a primeira ocorrência do parametro
frutas.pop("banana")
console.log(frutas)


frutas.push("maca")
frutas.push("abacate")
frutas.push("tangerina")

console.log(frutas)

// ordena o proprio array
frutas.sort()
console.log(frutas)


for(let i = 0; i < frutas.length; i++){
    console.log(frutas[i].toUpperCase())
    frutas[i] = frutas[i].toUpperCase()
}

console.log(frutas)


// é possível adicionar um elemento em uma posição maior que o tamanho do array
// neste caso o array será redimensionado 
// e inseridos espaços vazios dentro do intervalo
frutas[9] = "melancia"

console.log(frutas)
console.log(frutas.length)



// inverte a ordem dos elementos do array
frutas.reverse()
console.log(frutas)


// foreach não considera espaços vazios.
frutas.forEach(function (elemento){
    console.log(elemento)
})
// com o for precisamos implementar uma lógica para 
// ignorar os espaços vazios.
for(let i = 0; i < frutas.length; i++){
    if(frutas[i]){ // undefined == false
        console.log(frutas[i])
    }
}



const pessoas = [
    {
        nome: "Marcos",
        idade: 20
    },
    {
        nome: "Maria",
        idade: 30
    },
    {
        nome: "Roberto",
        idade: 40
    }
]

let idade_media = 0

pessoas.forEach(function(pessoa){
    idade_media += pessoa.idade
})

idade_media = idade_media / pessoas.length

console.log("A idade média das pessoas é: " + idade_media + ".")

// interpolação de strings
// template string
console.log(`A idade média das pessoas é: ${idade_media}.`)


console.log(idade_media, pessoas)


function printaArray(...parametros){
    console.log(parametros)
}

printaArray("marcos", "andre", "roberto")


const pessoaCompleta = {
    ...pessoas[0],
    /**
     * nome: pessoas[0].nome,
     * idade: pessoas[0].idade
     */
    email: "marcosantonio@fuvs.br"
}

console.log(pessoaCompleta)