function obterPropriedades(objeto) {

    if (typeof objeto !== 'object' || objeto === null) {
        throw new TypeError('O argumento deve ser um objeto.');
    }


    const propriedades = Object.keys(objeto);

    return propriedades;
}


const meuObjeto = {
    nome: 'Alice',
    idade: 30,
    cidade: 'São Paulo'
};

const propriedadesDoObjeto = obterPropriedades(meuObjeto);
console.log('Propriedades do objeto:', propriedadesDoObjeto);
