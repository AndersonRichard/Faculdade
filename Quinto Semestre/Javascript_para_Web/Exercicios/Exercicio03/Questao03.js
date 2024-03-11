function unirArrays(array1, array2) {

    const arrayUnido = array1.concat(array2);

    return arrayUnido;
}


const primeiroArray = [1, 2, 3];
const segundoArray = [4, 5, 6];
const arrayCombinado = unirArrays(primeiroArray, segundoArray);

console.log("Array combinado:", arrayCombinado);
