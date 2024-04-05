const palavras = ["Olá, ", "mundo", "!"];

function concatenarStrings(arrayDeStrings) {
    return arrayDeStrings.reduce(function (acumulador, string) {
        return acumulador + string;
    }, '');
}

const resultado = concatenarStrings(palavras);
console.log(resultado); 