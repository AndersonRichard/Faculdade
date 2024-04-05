function encontrarMaiorNumero(arrayDeNumeros) {

    if (arrayDeNumeros.length === 0) {
      return undefined;
    }
  
    return arrayDeNumeros.reduce(function(maior, numero) {
      return numero > maior ? numero : maior;
    });
  }
  

  const numeros = [5, 8, 2, 10, 3];
  const maiorNumero = encontrarMaiorNumero(numeros);
  console.log(maiorNumero); 
  