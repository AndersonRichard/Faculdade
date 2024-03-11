// Objeto é o tipo de dado fundamento em JS
// criar um objeto
// objeto literal, assume-se que o protótipo é o padrão (Object)
const pessoa = {

}

// usando new, preciso ter uma classe criada
const nome = new String()

// usando o protótipo Object
const objPadrao = Object.create({}) // atribui o protótipo padrão (Object)
const objPersonalizado = Object.create({x: 1, y: 2}) // instruindo qual o protótipo que quero que use
const objSemPrototipo = Object.create(null) // crio um objeto sem nenhum protótipo, zerado

// objPersonalizado.x => posso acessar a propriedade x


// Exemplos:

const livro = {
    titulo: "Nome do livro",
    autor: "Fulano de tal",
    data_publicacao: "05/01/2000",
    genero: "genero",
    editora: "Univas",
    numero_paginas: 200
}

console.log(livro.titulo + " - " + livro.autor)

const autor = {
    nome: "fulano de tal",
    nascimento: "01/01/1900",
    obras_publicadas: 70,
    toString: function (){ // função que ensina como deve ser a versão em texto do objeto
        return this.nome
        // this = objeto que está inserido
    },
    toString2: () => {
        return this.nome // vai retornar undefined
        // this = nada (não existe contexto dentro da arrow function)
    }
}

// JS me possibilita alterar o tipo de um dado previamente 
// inserido
livro.autor = autor

// posso acessar uma propriedade do objeto usando . ou []
console.log(livro.autor)
console.log(livro['editora'])

// posso acessar propriedades dinamicamente pelo []
// pois ele vai avaliar a expressão passada como argumento
const propriedade = "numero_paginas"
console.log(livro[propriedade])


// livro.for => não posso utilizar palavras reservadas 
// da linguagem


// Todo objeto em javascript é um Array Associativo
// Map, Hash, Dicionário
livro.coautor = "José"

console.log(livro.coautor)

livro["cidade_publicacao"] = "Pouso Alegre"

console.log(livro.cidade_publicacao)


console.log(livro)

// da mesma forma que posso adicionar propriedades dinamicamente
// posso remover uma propriedade dinamicamente.
delete livro.coautor
console.log(livro)

// posso obter uma lista de propriedades que o objeto possui
console.log(Object.keys(livro))

// o for/in vai passar por cada atributo e inserir o nome 
// dele no primeiro parâmetro
for(campo in livro){
    console.log(campo + " => " + livro[campo])
}