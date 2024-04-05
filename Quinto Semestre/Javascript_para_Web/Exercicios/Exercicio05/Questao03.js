const pessoas = [
    { nome: 'Alice', idade: 30 },
    { nome: 'Bob' },
    { nome: 'Carol', idade: 35 }
  ];
  
  function objetosComPropriedadeDefinida(arrayDeObjetos, propriedade) {
    return arrayDeObjetos.filter(function(objeto) {
      return propriedade in objeto;
    });
  }
  
  const pessoasComIdadeDefinida = objetosComPropriedadeDefinida(pessoas, 'idade');
  console.log(pessoasComIdadeDefinida); 