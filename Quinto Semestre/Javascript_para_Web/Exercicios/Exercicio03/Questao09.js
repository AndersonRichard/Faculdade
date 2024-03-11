function dividirEmConjuntos(elementos, tamanho) {
    const conjuntosMenores = [];


    for (let i = 0; i < elementos.length; i += tamanho) {
        const conjunto = elementos.slice(i, i + tamanho);
        conjuntosMenores.push(conjunto);
    }

    return conjuntosMenores;
}


const elementos = [1, 2, 3, 4, 5, 6, 7, 8];
const tamanhoDoConjunto = 2;
const conjuntosResultantes = dividirEmConjuntos(elementos, tamanhoDoConjunto);

console.log("Conjuntos resultantes:", conjuntosResultantes);
