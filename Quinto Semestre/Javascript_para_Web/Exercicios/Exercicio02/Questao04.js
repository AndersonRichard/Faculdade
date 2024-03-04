function primeiroUltimoCaractere(word){
    const primeiro = word.charAt(0);
    const ultimo = word.charAt(word.length - 1);
    return `Primeiro caractere da palavra é ${primeiro} e o ultimo caractere da palavra é ${ultimo}`;
}

const word = "Anderson";
console.log(primeiroUltimoCaractere(word));