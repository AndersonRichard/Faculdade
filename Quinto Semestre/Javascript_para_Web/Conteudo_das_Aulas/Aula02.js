// Uma variável let é de escopo local
let texto = "Hello World!"
console.log(texto)

// Variáveis do tipo let podem ser 
// reatribuídas
texto = "Hello 2"
console.log(texto)

// Como JS não possui tipagem forte
// eu posso atribuir um valor de outro tipo
// na mesma variável
texto = 100
console.log(texto)
texto = true
console.log(texto)

// Para declarar variáveis constantes
// ou seja, que não posso alterar o tipo
// usamos a palavra const
// const também é de escopo local
const texto2 = "Texto fixo"
console.log(texto2)

// Não é possível reatribuir uma variável 
// constante
//texto2 = "Outro texto"


// outra forma de criar variáveis é utilizando
// a palavra var, é uma variável global
// isto é, possível de ser acessada em qualquer
// parte do código, possibilitando erros
// de execução no programa.
var variavelGlobal = "Texto global"
console.log(variavelGlobal)

variavelGlobal = "Outro Texto global"
console.log(variavelGlobal)

// Estrutura condicional IF ELSE
if(variavelGlobal == "Outro Texto global"){
    console.log("Acertou!")
}else{
    console.log("Errou!")
}


if(texto == true){
    console.log("Verdade")
}else{
    console.log("Mentira")
}

// Dois iguais compara apenas valores
// Desconsidera tipos
// != => Equivalente a diferente
if(texto == 1){
    console.log("Verdade")
}else{
    console.log("Mentira")
}

// Três iguais compara inclusive o tipo
// Caso o tipo for diferente dá falso
// !== => Equivalente a diferente
if(texto === 1){
    console.log("Verdade")
}else{
    console.log("Mentira")
}


// IMPORTANTE
// Escopo é definido pelo {}
// ou, arquivo como um todo se a variável 
// for criada fora de um escopo definido

// são duas variáveis diferentes que 
// chamam textoDoEscopo
// Caso não fossem variáveis de escopo local
// Daria um erro de redeclaração de variável
if(texto == true){
    let textoDoEscopo = "escopo local do if"
    console.log(textoDoEscopo)
}else{
    let textoDoEscopo = "escopo local do else"
    console.log(textoDoEscopo)
}

let maiorQue = texto > 10
let maiorOuIgual = texto >= 10
let menorQue = texto < 10
let menorOuIgual = texto <= 10


// Laço de repetição for
// Uso o let pois caso contrário daria erro
// de reatribuição no i a cada passo
for(let i = 0; i < 10; i++){
    console.log("Valor do i: ", i)
}


let numero1 = 5
let numero2 = 10

let soma = numero1 + numero2
let subtracao = numero1 - numero2
let multiplicacao = numero1 * numero2
let divisao = numero1 / numero2

console.log(soma, 
        subtracao, multiplicacao, divisao)

// ; é opcional em Javascript

let nome = "Marcos"
let sobrenome = "Antonio"
let nomeCompleto = nome + " " + sobrenome

console.log(nomeCompleto)

// Javascript sempre vai converter para o tipo
// mais fácil de juntar (concatenar)
// no caso string (texto)
let numeroTexto = "10"
let numero = 1

let resultado = numeroTexto + numero
console.log(resultado)

// para ter um resultado numérico
// preciso converter todas as partes
// para número
let resultadoNumerico = 
    parseInt(numeroTexto) + numero
console.log(resultadoNumerico)


// criação de funções

// declação de função
function somar(a, b){
    a = parseInt(a)
    b = parseInt(b)
    return a + b
}

console.log("Somar: ", somar(10,5))

// expressão de função
const subtrair = function(a,b){
    return a - b
}

console.log("Subtrair: ", subtrair(10, 5))
// a função que é atribuída a variável
// é chamada de função anônima

// arrow function (função de flecha)
let dividir = (a, b) => {
    return a / b
}

// Cria uma função que recebe dois parâmetros
// e retorna a divisão entre eles
dividir = (a, b) => a / b

console.log("Dividir: ", dividir(10, 5))