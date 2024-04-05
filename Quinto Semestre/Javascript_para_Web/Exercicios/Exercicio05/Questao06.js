const palavras = ["Casa", "carro", "Moto", "lua", "Sol"];

function stringsComLetraMaiuscula(arrayDeStrings) {
    return arrayDeStrings.filter(function (string) {

        return /^[A-Z]/.test(string);
    });
}

const stringsFiltradas = stringsComLetraMaiuscula(palavras);
console.log(stringsFiltradas); 