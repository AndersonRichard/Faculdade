async function aguardarSegundos(segundos) {
    await new Promise(resolve => setTimeout(resolve, segundos * 1000));
    console.log(`Passaram-se ${segundos} segundos!`);
}


const tempoEspera = 3; 
aguardarSegundos(tempoEspera);
