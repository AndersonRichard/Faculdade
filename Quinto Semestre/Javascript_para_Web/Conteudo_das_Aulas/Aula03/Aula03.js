// declaração de função
function nomeDaFuncao(parametros){
    // escopo da função
}

// expressão de função
// usando let ou const
// function(parametros){ => função anonima
const nomeDaFuncao2 = function(parametros){
    // escopo da função
}

// arrow function
const nomeDaFuncao3 = (parametros) => {
    // escopo da Função
}



const mensagem = "Texto inicial!" // escopo do arquivo
// parametros
function escreverMensagemNoTerminal(mensagem){
    mensagem = mensagem + " Texto no final!" // escopo da função
    console.log(mensagem)
}

escreverMensagemNoTerminal("Mensagem bonita!")
console.log(mensagem) // escopo do arquivo




function funcaoLegal(palavra){
    function validaPalavra(palavra){ // esta palavra é diferente da anterior (escopo diferente)
        if(palavra == "teste"){
            return true
        }else{
            return false
        }
    }

    let resultado = validaPalavra(palavra)

    if(resultado){
        console.log("Acertou!")
    }else{
        console.log("Errou!")
    }

    resultado = validaPalavra("Marcos")

    if(resultado){
        console.log("Acertou!")
    }else{
        console.log("Errou!")
    }
}

funcaoLegal("teste")



function somarDiferentao(numero1, numero2){
    function validaNumero(numero){
        if(numero < 0){
            return 0
        }else{
            return numero
        }
    }

    numero1 = validaNumero(numero1)
    numero2 = validaNumero(numero2)

    return numero1 + numero2
}

console.log(somarDiferentao(10, 10))
console.log(somarDiferentao(-10, 10))


function escreveAlgoNaTela(mensagem = "Algo na Tela!"){
    console.log(mensagem)
}
// undefined = null

escreveAlgoNaTela("Mensagem bonita!")
escreveAlgoNaTela()



function multiplicarNumeros(numero1 = 1, numero2 = 1){
    return numero1 * numero2
}

console.log(multiplicarNumeros(10))
// NaN = Not A Number => Não é um número
// Ocorre quando tento fazer uma operação
// aritmética, entre valores não numéricos.




// recebo uma função como parâmetro e executo dentro do escopo
function executarFuncao(funcao){
    funcao()
}

// chamo a função passando como parâmetro uma declaração
// de função anonima
executarFuncao(function(){
    console.log("Função executada!")
})


// quando o usuário fizer uma soma
// executar depois de 2 segundos uma mensagem na tela

// função callback
function soma(numero1, numero2, funcao){
    let resultado = numero1 + numero2

    // função de timeout espera um determinado tempo para 
    // executar uma função callback passada como parametro
    setTimeout(funcao, 2000)

    return resultado
}

// soma(10, 10, function(){
//     console.log("A soma foi executada!")
// })





// endsWith => Verifica se uma string termina com um determinado conteudo
let nome = "Marcos Antonio dos Santos"

console.log(nome.endsWith("Santos"))

// startsWith =>Verifica se uma string começa com um determinado conteudo
console.log(nome.startsWith("Bruno"))

// includes => Verifica se dentro de uma string existe um conteudo
// CASE SENSITIVE
console.log(nome.includes("Antonio"))
console.log(nome.includes("antonio"))

// toLowerCase => transforma todas as letras em minusculo
// toUpperCase => transforma todas as letras em maiusculo
console.log(nome.toLowerCase())
console.log(nome.toUpperCase())
console.log(nome.toLowerCase().includes("antonio"))


// length => retorna o tamanho da string em quantidade de caracteres
console.log(nome.length)

// padStart => add caracteres no inicio ate completar um tamanho definido
// padEnd => add caracteres no fim ate completar um tamanho definido
console.log(nome.padStart(30, ' '))


// chatAt => obtem o caracter na posicao x
// [] => acessa uma posicao da string
console.log(nome.charAt(0), nome[0])