let variavelFora = "Variavel que esta fora do escopo";

function testeEscopo(){
    let variavelDentro = "Variavel que esta dentro do escopo";
    console.log("Dentro da função:");
    console.log(variavelFora); 
    console.log(variavelDentro);
}

testeEscopo();
console.log("Fora da função:");
console.log(variavelFora);