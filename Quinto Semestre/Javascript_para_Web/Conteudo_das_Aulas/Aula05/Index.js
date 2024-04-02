// OBJETOS

const objetoLiteral = {
    // atributos e métodos
}

const instanciarObjeto = new String();

const objetoComPrototipo = Object.create({}) // null, criar objeto.

objetoLiteral.atributoNovo = "Algum conteúdo";
console.log(objetoLiteral["atributoNovo"]);

// arrays associativos // Hash, Map, Dicionário

const nomeDoAtributo = "atributoNovo";
console.log(objetoLiteral[nomeDoAtributo]);


// for/in

for(propriedade in objetoLiteral){
    // laço de repetição
    // vai colocar dentro da variável propriedade,
    // o nome de um campo do objeto
    console.log(propriedade);
}

const aluno = {
    nome: "Marcos",
    sobrenome: "Antonio",
    nome_completo: function(){
        // this = contexto do objeto
        return this.nome + " " + this.sobrenome
    },
    nome_completo2: () => {
        // não possui contexto
        // this = undefined
    }
}