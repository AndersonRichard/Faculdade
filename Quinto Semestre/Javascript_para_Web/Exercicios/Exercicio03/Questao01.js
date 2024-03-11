function ordenarEmOrdemCrescente(arr) {

    arr.sort(function(a, b) {
        return a - b;
    });


    console.log("Elementos em ordem crescente:");
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}


const meuArray = [5, 2, 9, 1, 7];
ordenarEmOrdemCrescente(meuArray);
