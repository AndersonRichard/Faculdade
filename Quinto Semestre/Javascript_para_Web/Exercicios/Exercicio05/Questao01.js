const numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

function numerosPares(arrayDeNumeros){
    return arrayDeNumeros.filter(function(numero){
        return numero % 2 === 0;
    })
}

const numerosPar = numerosPares(numeros);
console.log(numerosPar)