function calcularMedia(numeros) {
    const soma = numeros.reduce((total, numero) => total + numero, 0);
    const media = soma / numeros.length;
    return media;
}

const meuArray = [10, 20, 30, 40, 50];
const mediaCalculada = calcularMedia(meuArray);
console.log(`A média dos números é: ${mediaCalculada}`);