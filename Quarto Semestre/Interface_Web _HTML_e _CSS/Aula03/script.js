let listaTarefas = document.getElementById('listaTarefas');
let input1 = document.getElementById('input1');


function addTarefa() {
    const texto = input1.value;
    let novoElemento = document.createElement("li");
    novoElemento.innerHTML = `<p>${texto}</p> 
                                <button onclick='excluirTarefa(this)'>Excluir</button>
                                <button onclick='editarTarefa(this)'>Editar</button>
                                <button onclick='changeColor(this)'>Concluir</button>`;
    listaTarefas.appendChild(novoElemento);
    input1.value = "";
}

function excluirTarefa(button){
    alert("Item apagado com Sucesso");
    listaTarefas.removeChild(button.parentElement);
}

function changeColor(button) {
    alert("Tarefa Concluída com Sucesso");
    listaTarefas.style.color = "#16f216";
}

function editarTarefa(button){

}
