const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function multiplosDeTres(arrayDeNumeros) {
    return arrayDeNumeros.filter(function(numero) {
      return numero % 3 === 0;
    });
  }

const multiplos = multiplosDeTres(numeros);
console.log(multiplos); 

