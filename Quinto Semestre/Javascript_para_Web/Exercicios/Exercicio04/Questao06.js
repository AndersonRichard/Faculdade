const numeros = [
    [1, 5, 3],
    [7, 2, 9],
    [4, 8, 6]
];

numeros.forEach(function(subarray){
    let maiorNumero = subarray[0];
    subarray.forEach(function(numero){
        if(numero > maiorNumero){
            maiorNumero = numero;
        }
    })
    console.log("O maior número no subarray é:", maiorNumero);
});