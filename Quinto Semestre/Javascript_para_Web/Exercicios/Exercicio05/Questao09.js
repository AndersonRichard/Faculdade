const produtos = [
    { nome: 'Produto A', preco: 10 },
    { nome: 'Produto B', preco: 20 },
    { nome: 'Produto C', preco: 30 }
];

function somaPropriedade(arrayDeObjetos, propriedade) {
    return arrayDeObjetos.reduce(function (acumulador, objeto) {

        if (objeto.hasOwnProperty(propriedade)) {

            acumulador += objeto[propriedade];
        }
        return acumulador;
    }, 0);
}


const totalPreco = somaPropriedade(produtos, 'preco');
console.log(totalPreco); 