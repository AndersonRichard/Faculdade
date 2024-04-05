function juntarStrings(arrayDeStrings) {
    return arrayDeStrings.join(' ');
  }

  const palavras = ["Olá", "mundo", "como", "vai", "você?"];
  const frase = juntarStrings(palavras);
  console.log(frase); 
  