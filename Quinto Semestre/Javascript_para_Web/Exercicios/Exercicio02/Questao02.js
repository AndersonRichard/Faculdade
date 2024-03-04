function somaQuadrado(num1, num2){
    let soma = num1 + num2;
    let quadrado = soma * soma;
    return `A soma dos números é ${soma} e o quadrado dessa soma é ${quadrado}.`;
}

const num1 = 10;
const num2 = 5;

console.log(somaQuadrado(num1, num2));
