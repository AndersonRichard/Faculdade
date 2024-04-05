const numeros = [1, 2, 3, 4, 5];
function somaDosElementos(arrayDeNumeros) {
    return arrayDeNumeros.reduce(function (acumulador, numero) {
        return acumulador + numero;
    }, 0);
}
const soma = somaDosElementos(numeros);
console.log(soma); 