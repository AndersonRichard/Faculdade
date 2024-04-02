const numeros = [1, 2, 3, 4, 5, 6, 7, 8];
const numerosMultiplicacao = multiplicarPorDois(numeros);

function multiplicarPorDois(arrayNumeros){
    return arrayNumeros.map(function(numero){
        return numero * 2;
    });
}

console.log(numerosMultiplicacao);