
function executaCallback(funcao){
    funcao()
}

executaCallback(() => {
    console.log("Executou o callback")
})