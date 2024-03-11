function juntarElementosComDelimitador(arr, delimitador) {

    const resultado = arr.join(delimitador);

    return resultado;
}


const meuArray = ['maçã', 'banana', 'laranja'];
const delimitador = ', '; 

const stringUnida = juntarElementosComDelimitador(meuArray, delimitador);
console.log("Elementos unidos:", stringUnida);
