// 1. Demonstre por meio de código como cria-se uma função em JS.

// Cria-se a função com a palavra reservada function, seguida
// do nome da função e dos parÂmetros que ela recebe
// entre parenteses.
function somar(a, b){
    return a+b;
}


// declaração e escopo de variáveis
let variavelMutavelLocal = "";
const variavelImutavelLocal = ""; // não posso ter reatribuição
var variavelMutavelGlobal = "";

variavelMutavelLocal = 10; // mudar o tipo pra número


// Operações booleanas
// == -> Compara o valor, convertendo o tipo para o mais comparável
// 10 == "10" -> true

// === -> Comparar valor e tipo. Não tem conversão.
// 10 === "10" -> false

// !== ou != -> seguir a mesma lógica do comparador de igualdade


// variáveis vazias
// null ou undefined => false

// verifique se uma variável foi preenchida ou não

// if(nome){
//     console.log("Preenchida")
// }else{
//     console.log("Vazia")
// }


// laço de repetição

for(let i = 0; i < 10; i++){ // caminhe de i valendo 0 até 9 com passo de 1
    console.log(i);
}


// Operações aritméticas
// + -> Soma
// - -> Subtração
// / -> Divisão
// * -> Multiplicação


// ; é opcional, podem ou não colocar

// concatenação de strings

let nome = "Marcos";
let sobrenome = "Antonio";

let nomeCompleto = nome + " " + sobrenome;

// template string ou interpolação
nomeCompleto = `${nome} ${sobrenome}`;

// sobre as operações
let numero1 = 10;
let numero2 = "1";
let resultado = numero1 + numero2;
// resultado = 101 -> converte para o mais comparável (que no caso é a string)
// resultado = 11 -> numero1 + parseInt(numero2)



// Funções

// arrow function -> contexto
// não possui contexto, this = null
let arrow = () => {}


// as demais herdam o contexto do objeto pai
// declaração
function nomeFuncao(){

}
// expressão de função
let expressaoFuncao = function(){

}



function subtrair(a,b){
    console.log(a-b); // não usa o console fora da função
    // return a-b // console fora da função
}

subtrair(10,5); // já vai printar na tela
console.log(subtrair(10,5));

// 5
// undefined


// {} -> definição de escopo

function calcular(parametro){
    function validar(parametro){ // essa variavel parametro eh diferente
        if(parametro){
            return true;
        }else{
            return false;
        }
    }

    console.log(validar(parametro));
}

console.log(calcular(10));


function multiplicar(numero1, numero2 = 1){ // valor padrão para o parametro
    return numero1 * numero2;
}

// permite eu executar a função com um ou dois parametros
console.log(multiplicar(10,5));
console.log(multiplicar(10));


// função de callback
function executarCB(funcao){
    funcao("oi");
}

executarCB(function(mensagem){
    console.log(`Mensagem: ${mensagem}`);
})

// a vantagem é poder personalizar a forma como as funções executam

function mostrarMensagemDepoisDeSegundos(mensagem){
    setTimeout(() => {
        console.log(mensagem);
    }, 5000)
    // setTimeout(function(){
    //     console.log(mensagem)
    // }, 5000)
}

mostrarMensagemDepoisDeSegundos("Mensagem demorada");




// objetos
// objeto é o tipo fundamental em JS
// JSON

let pessoa = {
    nome: "Marcos",
    sobrenome: "Antonio",
    nome_completo: function(){
        return this.nome + " " + this.sobrenome
    } // não pode ser arrow function por causa do contexto (this)
}// definição de um objeto literal

console.log(pessoa.nome_completo());


// objetos são um array associativo
// quer dizer que trabalho com conceito de chave-valor
pessoa.idade = 20;

console.log(pessoa);


pessoa.endereco = {
    rua: "X",
    numero: 10,
    cidade: "Pouso Alegre",
    estado: "MG"
} // Composição

console.log(pessoa);

// remove uma propriedade do objeto
delete pessoa.endereco;

console.log(pessoa);

const atributos = Object.keys(pessoa);

console.log(atributos);

atributos.forEach(function(atributo) {
    console.log(atributo);
})

// for/in
console.log("FOR/IN")
for(atributo in pessoa){
    console.log(`${atributo} => ${pessoa[atributo]}`);
}


// Arrays

let frutas = []; // ou new Array()

frutas.push("Banana");

console.log(frutas);

frutas.push("Banana");
console.log(frutas);

frutas.pop("Banana"); // remove a primeira ocorrencia
console.log(frutas);

frutas.push("Banana");
frutas.push("Banana");
console.log(frutas);
frutas.pop("Banana");
console.log(frutas);


frutas.push("Abacaxi");
console.log(frutas);

frutas.sort();

console.log(frutas);

frutas.reverse();

console.log(frutas);

frutas.push(10);

frutas.sort();

console.log(frutas);

frutas[9] = "Morango";

console.log(frutas);

// for ou foreach
for(let i = 0; i < frutas.length; i++){
    console.log(frutas[i]);
}

frutas.forEach(fruta => {
    console.log(fruta);
})



// 

function imprimeParametros(...parametros){
    console.log(parametros);
}

imprimeParametros("Dado01", "Dado02", "Dados03");

let verduras = ["alface"];

console.log(verduras, frutas);

let comidasSaudaveis = [...verduras, ...frutas];

console.log(comidasSaudaveis);


const professor = {
    ...pessoa, // espalhar o conteúdo dentro deste objeto novo
    disciplinas: ["Matemática", "Fisica"]
}

console.log(professor);



// Crie uma função que recebe um array de objetos que possuem o model abaixo. A função deve calcular a média de notas geral, maior média e menor média, estes dados devem ser retornados.
/*
{
    nome: "Fulano",
    notas: [4,5,2,8]
}
*/

function calcularMedias(alunos){
    let mediaGeral = 0;
    let maiorMedia = null;
    let menorMedia = null;
    alunos.forEach(aluno => {
        aluno.media = 0;
        aluno.notas.forEach(nota => {
            aluno.media += nota;
        })
        aluno.media /= aluno.notas.length;

        mediaGeral += aluno.media;

        if(menorMedia == null){
            menorMedia = aluno.media;
        }else{
            if(aluno.media < menorMedia){
                menorMedia = aluno.media;
            }
        }

        if(maiorMedia == null){
            maiorMedia = aluno.media;
        }else{
            if(aluno.media > maiorMedia){
                maiorMedia = aluno.media;
            }
        }
    })
    mediaGeral /= alunos.length;

    return {
        "mediaGeral" : mediaGeral, 
        "menorMedia" : menorMedia, 
        "maiorMedia" : maiorMedia
    }
}

const alunos = [
    {
        nome: "Fulano",
        notas: [4,5,2,8]
    },
    {
        nome: "Ciclano",
        notas: [6,7,4,10],
        idade: 30
    }
]

console.log(calcularMedias(alunos));


// Crie uma função que recebe um conjunto de objetos e uma string que será o nome de uma propriedade. A função deve retornar um conjunto de objetos apenas com aqueles que possuem a propriedade passada como parametro definida.

function filtrarObjetos(lista, propriedade){
    let retorno = [];

    lista.forEach(objeto => {
        if(objeto[propriedade]){
            retorno.push(objeto);
        }
    })

    return retorno;
}

console.log(filtrarObjetos(alunos,"idade"));


// Crie uma função chamada somaDinamica que possa receber um número variável de argumentos e retorne a soma deles

function somaDinamica(...numeros){
    let soma = 0;
    numeros.forEach(numero => {
        soma += numero;
    })

    return soma
}

console.log(somaDinamica(10,20,30));
console.log(somaDinamica(10,20));



// Mostre a diferença de contexto entre funções de expressão e arrow functions

let objetoQualquer = {
    propriedade1: "Conteúdo 01",
    propriedade2: "conteúdo 02",
    juntaPropriedades: function(){
        return this.propriedade1 + " - " + this.propriedade2;
    },
    juntaPropriedadesQueNaoFunciona: () => {
        return this.propriedade1 + " - " + this.propriedade2;
    }
}

console.log(objetoQualquer.juntaPropriedades());