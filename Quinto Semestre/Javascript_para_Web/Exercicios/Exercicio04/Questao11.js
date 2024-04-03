const numeros = [
    [1, 5, 9],
    [9, 7, 8],
    [3, 6, 4]
];

function somarLinhasMatriz(matriz) {
    return matriz.map(function(linha) {
      return linha.reduce(function(acumulador, valorAtual) {
        return acumulador + valorAtual;
      }, 0);
    });
  }

  const somas = somarLinhasMatriz(numeros);
  console.log(somas); 