const palavras = ["banana", "pera", "laranja", "uva"];

function stringTresPalavras(arrayDePalavras){
    return arrayDePalavras.filter(function(palavra){
        return palavra.length > 3;   
    })
}

const resultadoPalavra = stringTresPalavras(palavras);
console.log(resultadoPalavra)