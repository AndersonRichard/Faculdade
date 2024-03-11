function filtrarObjetosPorPropriedade(objetos, nomePropriedade) {
    const objetosFiltrados = objetos.filter(objeto => objeto.hasOwnProperty(nomePropriedade));
    return objetosFiltrados;
}


const conjuntoDeObjetos = [
    { nome: "Fulano", idade: 25 },
    { nome: "Ciclano", cidade: "São Paulo" },
    { nome: "Beltrano", profissao: "Engenheiro" },

];

const propriedadeDesejada = "profissao";
const objetosComPropriedade = filtrarObjetosPorPropriedade(conjuntoDeObjetos, propriedadeDesejada);

console.log("Objetos com a propriedade definida:", objetosComPropriedade);
