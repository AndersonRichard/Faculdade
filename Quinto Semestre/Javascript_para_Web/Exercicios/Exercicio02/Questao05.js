function comparacaoNumeros(num1, num2){
    let comparacao;
    if(num1 > num2){
       comparacao = num1; 
    }else{
        comparacao = num2;
    }
    return `O número maior é ${comparacao}`;
}

const num1 = 15;
const num2 = 5;
console.log(comparacaoNumeros(num1, num2));