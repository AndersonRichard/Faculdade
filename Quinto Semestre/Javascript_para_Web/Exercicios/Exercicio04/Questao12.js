const numeros = [16, 25, 36, 49];

function raizQuadradaArredondada(arrayDeNumeros) {
    return arrayDeNumeros.map(function(numero) {
      return Math.round(Math.sqrt(numero));
    });
  }

const raizesQuadradas = raizQuadradaArredondada(numeros);

console.log(raizesQuadradas);