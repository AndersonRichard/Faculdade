function juntarStringsMaiusculas(arrayDeStrings) {
    return arrayDeStrings.map(function(string) {
      return string.toUpperCase();
    }).join(' ');
  }
  

  const palavras = ["banana", "pera", "laranja", "uva"];
  const resultado = juntarStringsMaiusculas(palavras);
  console.log(resultado); 
  