function encontrarPosicaoPrimeiraOcorrencia(arr, elemento) {

    const posicao = arr.indexOf(elemento);


    if (posicao !== -1) {
        console.log(`A primeira ocorrência de "${elemento}" está na posição ${posicao}.`);
    } else {
        console.log(`O elemento "${elemento}" não foi encontrado no array.`);
    }

    return posicao; 
}


const meuArray = [10, 20, 30, 40, 50];
const elementoProcurado = 30;
encontrarPosicaoPrimeiraOcorrencia(meuArray, elementoProcurado);
