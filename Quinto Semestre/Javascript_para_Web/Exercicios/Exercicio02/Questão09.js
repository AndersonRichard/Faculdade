function executaCallback(callback) {

    callback();
}


function minhaFuncao() {
    console.log("Teste");
}

executaCallback(minhaFuncao);
