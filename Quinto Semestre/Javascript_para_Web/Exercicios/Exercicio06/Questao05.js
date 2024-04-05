function juntarMatriz(matriz) {
    return matriz.map(function(linha) {
      return linha.join(';');
    }).join(';');
  }
  

  const matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ];
  const resultado = juntarMatriz(matriz);
  console.log(resultado); 
  