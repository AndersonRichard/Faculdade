const matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

function linhasComSomaMaiorQueDez(matriz) {
    return matriz.filter(function (linha) {

        const soma = linha.reduce(function (acumulador, valorAtual) {
            return acumulador + valorAtual;
        }, 0);


        return soma > 10;
    });
}


const linhasFiltradas = linhasComSomaMaiorQueDez(matriz);
console.log(linhasFiltradas); 