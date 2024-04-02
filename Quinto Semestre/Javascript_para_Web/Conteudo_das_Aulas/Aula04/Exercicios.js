// Crie uma função chamada concatenaPalavras
// que aceite duas strings como parâmetros
// e retorne a concatenação delas

function concatenaPalavras(parametro1, parametro2){
    return parametro1+parametro2;
}

console.log(concatenaPalavras("Marcos", "Antonio"));

// Crie uma função chamada primeiroUltimoCaractere que aceite
// uma string como parâmetro
// e retorne uma string contendo o primeiro e o último caractere

function primeiroUltimoCaractere(parametro){
    const primeiroCaractere = parametro[0]; // parametro.charAt(0)
    const ultimoCaractere = parametro[parametro.length - 1]; // parametro.charAt(parametro.length - 1)

    return primeiroCaractere+ultimoCaractere;
}

console.log(primeiroUltimoCaractere("Marcos"));

// Crie uma função chamada fatorial que aceite um número como parâmetro
// e retorne o fatorial desse número

function fatorial(numero){
    let fatorial = 1;
    for(let i = numero; i > 0; i--){
        fatorial *= i; // fatorial = fatorial * i
    }

    return fatorial;
}

function fatorial2(numero){
    if(numero == 1){
        return numero;
    }else{
        numero = numero * fatorial2(numero-1);
        return numero;
    }
}

console.log(fatorial(5));
console.log(fatorial2(5));


// Crie uma função chamada executaCallback que
// aceite outra função como parâmetre e a execute

function executaCallback(funcao){
    funcao();
}

executaCallback(() => {
    console.log("Executou o callback");
})