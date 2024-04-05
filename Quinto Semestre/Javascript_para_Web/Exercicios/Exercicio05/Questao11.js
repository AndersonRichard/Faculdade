function somaMatriz(matriz) {
    return matriz.reduce(function(acumuladorExterno, linha) {
      return acumuladorExterno + linha.reduce(function(acumuladorInterno, elemento) {
        return acumuladorInterno + elemento;
      }, 0);
    }, 0);
  }
  

  const matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ];
  
  const soma = somaMatriz(matriz);
  console.log(soma);
  