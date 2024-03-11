function meuReverse(arr) {

    const resultado = [];


    for (let i = arr.length - 1; i >= 0; i--) {
        resultado.push(arr[i]); 
    }

    return resultado;
}


const meuArray = [1, 2, 3, 4, 5];
const arrayInvertido = meuReverse(meuArray);

console.log("Array original:", meuArray);
console.log("Array invertido:", arrayInvertido);
