const { Console } = require("console");
var readLine = require("readline");
var rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});

var colaboradores = require("../Módulo 1/funcionarios.json");

function maiorSalarioEmpresa() {
    let maior = 0;
    let funcionario = "";
    for (let i = 0; i < colaboradores.funcionarios.length; i++) {
        if (colaboradores.funcionarios[i].salario > maior) {
            maior = colaboradores.funcionarios[i].salario;
            funcionario = colaboradores.funcionarios[i].nome;
            rl.close();
        }
    }
    console.log("Maior salário da empresa: R$ " + maior + " - Nome do(a) funcionário(a): " + funcionario);
}

function menorSalarioEmpresa() {
    let menor = 1000000;
    let funcionario = "";
    for (let i = 0; i < colaboradores.funcionarios.length; i++) {
        if (colaboradores.funcionarios[i].salario < menor) {
            menor = colaboradores.funcionarios[i].salario;
            funcionario = colaboradores.funcionarios[i].nome;
            rl.close();
        }
    }
    console.log("Menor salário da empresa: R$ " + menor + " - Nome do(a) funcionário(a): " + funcionario);
}

function mediaSalarialEmpresa() {
    let soma = 0;
    for (let i = 0; i < colaboradores.funcionarios.length; i++) {
        soma += colaboradores.funcionarios[i].salario;
        rl.close();
    }
    let media = soma / colaboradores.funcionarios.length;
    console.log("Média salarial da empresa: R$ " + media);
}

function maiorSalarioSetor() {
    rl.question("Informe o setor desejado: ", function(setor) {
        let maior = 0;
        let funcionario = "";
        for (let i = 0; i < colaboradores.funcionarios.length; i++) {
            if (setor === colaboradores.funcionarios[i].setor) {
                if (colaboradores.funcionarios[i].salario > maior) {
                    maior = colaboradores.funcionarios[i].salario;
                    funcionario = colaboradores.funcionarios[i].nome;
                    rl.close();
                }
            }
        }
        console.log("Maior salário do setor " + setor + ": R$ " + maior + " - Nome do(a) funcionário(a): " + funcionario); 
    });
}

function menorSalarioSetor() {
    rl.question("Informe o setor desejado: ", function(setor) {        
        let menor = 1000000;
        let funcionario = "";
        for (let i = 0; i < colaboradores.funcionarios.length; i++) {
            if (setor === colaboradores.funcionarios[i].setor) {
                if (colaboradores.funcionarios[i].salario < menor) {
                    menor = colaboradores.funcionarios[i].salario;
                    funcionario = colaboradores.funcionarios[i].nome;
                    rl.close();
                }
            } 
        }
        console.log("Menor salário do setor " + setor + ": R$ " + menor + " - Nome do(a) funcionário(a): " + funcionario); 
    });
}

function mediaSalarialSetor() {
    rl.question("Informe o setor desejado: ", function(setor) {        
        let soma = 0;
        let cont = 0;                
        for (let i = 0; i < colaboradores.funcionarios.length; i++) {
            if (setor === colaboradores.funcionarios[i].setor) {
                soma += colaboradores.funcionarios[i].salario
                cont++;
                rl.close();
            } 
        }
        let media = soma / cont;
        console.log("Média salarial do setor " + setor + ": R$ " + media); 
    });
}

// maiorSalarioEmpresa();
// menorSalarioEmpresa();
// mediaSalarialEmpresa();
// maiorSalarioSetor();
// menorSalarioSetor();
mediaSalarialSetor();