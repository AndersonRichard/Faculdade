function fatorial(num) {
    if (num < 0) {
        return "Indefinido";
    } else if (num === 0) {
        return 1;
    } else {
        let resultado = 1;
        for (let i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

const numero = 2;
console.log(`O fatorial de ${numero} é: ${fatorial(numero)}`);