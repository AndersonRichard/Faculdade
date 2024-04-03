const palavras = ["banana", "pera", "laranja", "uva"];

const palavrasMaiusculas = transformarPalavras(palavras);

function transformarPalavras(arrayPalavras){
    return arrayPalavras.map(function(palavra){
        return palavra.toUpperCase();
    })
}


console.log(palavrasMaiusculas);