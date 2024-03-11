function filtrarNumerosPares(arr) {
    const numerosPares = [];

    for (let i = 0; i < arr.length; i++) {
        const elemento = arr[i];

  
        if (typeof elemento === 'number' && elemento % 2 === 0) {
            numerosPares.push(elemento);
        }
    }

    return numerosPares;
}


const meuArray = [1, 2, '3', 4, 5, 6, 'sete', 8];
const numerosParesFiltrados = filtrarNumerosPares(meuArray);

console.log("Números pares filtrados:", numerosParesFiltrados);
