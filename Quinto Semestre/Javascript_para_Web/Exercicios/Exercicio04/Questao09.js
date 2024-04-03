const pessoas = [
    {nome: "Jean", idade: 10},
    {nome: "Sylvio", idade: 20},
    {nome: "Alysson", idade: 30}
];

function extrairPropriedadeNome(arrayDeObjetos, propriedade){
    return arrayDeObjetos.map(function(objeto){
        return objeto[propriedade];
    })
}

const nomes = extrairPropriedadeNome(pessoas, "nome");
console.log(nomes);
const idades = extrairPropriedadeNome(pessoas, "idade");
console.log(idades);