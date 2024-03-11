function calcularMedias(notasAlunos) {
    let totalNotas = 0;
    let maiorMedia = -Infinity;
    let menorMedia = Infinity;

    for (const aluno of notasAlunos) {
        const notas = aluno.notas;


        const mediaAluno = notas.reduce((acc, nota) => acc + nota, 0) / notas.length;


        if (mediaAluno > maiorMedia) {
            maiorMedia = mediaAluno;
        }
        if (mediaAluno < menorMedia) {
            menorMedia = mediaAluno;
        }

        totalNotas += mediaAluno;
    }


    const mediaGeral = totalNotas / notasAlunos.length;


    const resultados = {
        mediaGeral: mediaGeral.toFixed(2),
        maiorMedia: maiorMedia.toFixed(2),
        menorMedia: menorMedia.toFixed(2)
    };

    return resultados;
}


const alunos = [
    { nome: "Fulano", notas: [4, 5, 2, 8] },
    { nome: "Ciclano", notas: [6, 7, 9, 8] },

];

const resultados = calcularMedias(alunos);
console.log("Resultados:", resultados);
