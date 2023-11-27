function submitForm() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var reason = document.getElementById('reason').value;


    if (name && email && reason) {

        var message = "Nome: " + name + "\nEmail: " + email + "\nMotivo do Contato: " + reason;

        alert(message);

    } else {
        alert("Por favor, preencha todos os campos antes de enviar o formulário.");
    }
}
