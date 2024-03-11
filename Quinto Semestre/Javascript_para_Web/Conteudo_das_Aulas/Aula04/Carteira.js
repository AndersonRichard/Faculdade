const carteira = {}

console.log(carteira)

carteira.abev = 200

console.log(carteira)

carteira.itub = 500

console.log(carteira)

carteira.usim = 100

console.log(carteira)

carteira.msft = 50

console.log(carteira)

let valorTotal = 0
for(acao in carteira){
    valorTotal += carteira[acao]
}

console.log(valorTotal)


// verifico se uma propriedade existe dentro do objeto
// usando o in
if("abev" in carteira){
    carteira.abev += 100
}else{
    carteira.abev = 100
}

console.log(carteira)

// posso simplesmente comparar dentro do if
// o problema disto é que caso o valor seja 0 ou false
// vai considerar que não existe.
if(carteira.abev){
    carteira.abev += 100
}