const numeros = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

function calcularSomaDasLinhas(numeros){
    numeros.forEach(function(linha) {
        let somaLinha = 0;
        linha.forEach(function(numero) {
            somaLinha += numero;
        });
        console.log("A soma da linha é:", somaLinha);
    });
}

calcularSomaDasLinhas(numeros);