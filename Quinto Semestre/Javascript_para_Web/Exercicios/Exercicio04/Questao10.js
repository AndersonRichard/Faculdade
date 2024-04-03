const palavras = ["banana", "pera", "laranja", "uva"];

const tamanhoDasPalavras = transformarPalavras(palavras);

function transformarPalavras(arrayPalavras){
    return arrayPalavras.map(function(palavra){
        return palavra.length;
    })
}

console.log(tamanhoDasPalavras);