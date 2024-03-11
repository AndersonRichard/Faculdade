let string = "texto"

let resultado = string == "texto" // true
    resultado = string < "zebra" // true
    resultado = string > "abacate" // true

let letra = "a"
resultado = letra == 65 // não faz conversão pra tabela ascii
resultado = letra != "A" // a != A => case sensitive


const string1 = "2 + 2" // string literal
const string2 = new String("2 + 2") // string object

console.log(eval(string1)) // com string literal ele calcula a expressão armazenada
console.log(eval(string2)) // com string object ele considera de fato um texto e não faz o cálculo

// Pode ser usado para criar uma calculador por exemplo.


let cpf = "123456789"

console.log(cpf.padStart(11, "0"))

// numero do cracha deve ter 05 digitos
let cracha = "8346"
console.log(cracha.padStart(5, "0"))

// nome deve ter 20 caracteres (complete com underscore caso não tenha)
let nome = "marcos"
console.log(nome.padEnd(20, "_"))


let palavra = "   conteudo   "

console.log(palavra.length)

// trimStart remove espaços em branco no inicio da string
console.log(palavra.trimStart(), palavra.trimStart().length)

// trimEnd remove espaços em branco no fim da string
console.log(palavra.trimEnd(), palavra.trimEnd().length)

// trim remove espaçoes em branco tanto no inicio quanto no fim da string
console.log(palavra.trim(), palavra.trim().length)

palavra = "  Marcos Antonio   "
console.log(palavra.trimStart(), palavra.trimStart().length)
console.log(palavra.trimEnd(), palavra.trimEnd().length)
console.log(palavra.trim(), palavra.trim().length)


console.log(palavra.replace(" ", "")) // substitui somente o primeiro
console.log(palavra.replaceAll(" ", "")) // substitui tudo


