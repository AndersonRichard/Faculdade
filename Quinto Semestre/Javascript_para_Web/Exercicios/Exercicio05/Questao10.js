function produtoDosElementos(arrayDeNumeros) {
    return arrayDeNumeros.reduce(function(acumulador, numero) {
      return acumulador * numero;
    }, 1); 
  }
  

  const numeros = [1, 2, 3, 4, 5];
  const produto = produtoDosElementos(numeros);
  console.log(produto); 
  