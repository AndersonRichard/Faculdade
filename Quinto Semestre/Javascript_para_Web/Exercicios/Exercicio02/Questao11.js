function ehNumero(valor) {
    return typeof valor === "number" && !isNaN(valor);
}


console.log(ehNumero(42)); // Saída: true
console.log(ehNumero("Olá")); // Saída: false
console.log(ehNumero(3.14)); // Saída: true
console.log(ehNumero("123")); // Saída: false
