const { Console } = require("console");
var readLine = require("readline");
var rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});

var funcionarios = [
    {
        "nome": "Joao Cardoso Barbosa",
        "salario": 3000,
        "setor": "Administrativo"
    },
    {
        "nome": "Rebeca Costa Oliveira",
        "salario": 2000,
        "setor": "Produção"
    },
    {
        "nome": "Ana Azevedo Alves",
        "salario": 5000,
        "setor": "Comercial"
    },
    {
        "nome": "Marisa Dias Barbosa",
        "salario": 6500,
        "setor": "Produção"
    },
    {
        "nome": "Igor Cunha Lima",
        "salario": 1200,
        "setor": "Comercial"
    },
    {
        "nome": "Sarah Sousa Costa",
        "salario": 1500,
        "setor": "Comercial"
    },
    {
        "nome": "Giovanna Santos Araujo",
        "salario": 2500,
        "setor": "Produção"
    },                           
    {
        "nome": "Otávio Souza Cardoso",
        "salario": 3500,
        "setor": "Administrativo"
    },
    {
        "nome": "Leonardo Souza Lima",
        "salario": 1500,
        "setor": "Produção"
    },
    {
        "nome": "Nicolash Cavalcanti Fernandes",
        "salario": 4000,
        "setor": "Comercial"
    },                             
    {
        "nome": "Matheus Ribeiro Rocha",
        "salario": 4500,
        "setor": "Administrativo"
    },
    {
        "nome": "Vitor Ribeiro Barbosa",
        "salario": 3500,
        "setor": "Produção"
    },
    {
        "nome": "Carlos Oliveira Rodrigues",
        "salario": 7000,
        "setor": "Administrativo"
    },
    {
        "nome": "Mateus Pinto Pereira",
        "salario": 5500,
        "setor": "Administrativo"
    },
    {
        "nome": "Vinícius Pereira Castro",
        "salario": 3500,
        "setor": "Comercial"
    },      
    {
        "nome": "Gabriela Souza Pereira",
        "salario": 2500,
        "setor": "Administrativo"
    },
    {
        "nome": "Emily Melo Cavalcanti",
        "salario": 2000,
        "setor": "Produção"
    },
    {
        "nome": "Luís Carvalho Silva",
        "salario": 1500,
        "setor": "Comercial"
    },
    {
        "nome": "José Melo Araujo",
        "salario": 4000,
        "setor": "Produção"
    },
    {
        "nome": "Manuela Ferreira Cardoso",
        "salario": 6000,
        "setor": "Comercial"
    },
    {
        "nome": "Anna Gomes Rodrigues",
        "salario": 7000,
        "setor": "Comercial"
    },
    {
        "nome": "Anna Sousa Goncalves",
        "salario": 5000,
        "setor": "Produção"
    },                           
    {
        "nome": "Gabrielle Araujo Souza",
        "salario": 7500,
        "setor": "Administrativo"
    },
    {
        "nome": "Maria Cavalcanti Rocha",
        "salario": 3000,
        "setor": "Produção"
    },
    {
        "nome": "Luis Lima Rocha",
        "salario": 2000,
        "setor": "Comercial"
    },                             
    {
        "nome": "Rodrigo Correia Souza",
        "salario": 3500,
        "setor": "Administrativo"
    },
    {
        "nome": "Guilherme Silva Cavalcanti",
        "salario": 5500,
        "setor": "Produção"
    },
    {
        "nome": "Nicole Costa Pinto",
        "salario": 2000,
        "setor": "Administrativo"
    },
    {
        "nome": "Emilly Gomes Araujo",
        "salario": 3000,
        "setor": "Administrativo"
    },
    {
        "nome": "Thaís Sousa Carvalho",
        "salario": 4000,
        "setor": "Comercial"
    },
    {
        "nome": "Vitor Oliveira Sousa",
        "salario": 5500,
        "setor": "Administrativo"
    },
    {
        "nome": "José Sousa Lima",
        "salario": 7500,
        "setor": "Produção"
    },
    {
        "nome": "Mateus Barros Carvalho",
        "salario": 8000,
        "setor": "Comercial"
    },
    {
        "nome": "Júlio Cavalcanti Martins",
        "salario": 5000,
        "setor": "Produção"
    },
    {
        "nome": "Antônio Almeida Goncalves",
        "salario": 2000,
        "setor": "Comercial"
    },
    {
        "nome": "Ana Castro Dias",
        "salario": 9500,
        "setor": "Comercial"
    },
    {
        "nome": "Rafaela Cunha Santos",
        "salario": 2000,
        "setor": "Produção"
    },                           
    {
        "nome": "Giovanna Barros Santos",
        "salario": 3000,
        "setor": "Administrativo"
    },
    {
        "nome": "Gabrielly Martins Alves",
        "salario": 4000,
        "setor": "Produção"
    },
    {
        "nome": "Otávio Araujo Costa",
        "salario": 3500,
        "setor": "Comercial"
    },                             
    {
        "nome": "Bruna Lima Azevedo",
        "salario": 3000,
        "setor": "Administrativo"
    },
    {
        "nome": "Rebeca Ferreira Oliveira",
        "salario": 2500,
        "setor": "Produção"
    },
    {
        "nome": "Breno Sousa Rocha",
        "salario": 6000,
        "setor": "Administrativo"
    },
    {
        "nome": "Vitória Castro Almeida",
        "salario": 5000,
        "setor": "Administrativo"
    },
    {
        "nome": "Marina Goncalves Rodrigues",
        "salario": 4000,
        "setor": "Comercial"
    }
];

function maiorSalarioEmpresa() {
    let maior = 0;
    let funcionario = "";
    for (let i = 0; i < funcionarios.length; i++) {
        if (funcionarios[i].salario > maior) {
            maior = funcionarios[i].salario;
            funcionario = funcionarios[i].nome;
            rl.close();
        }
    }
    console.log("Maior salário da empresa: R$ " + maior + " - Nome do(a) funcionário(a): " + funcionario);
}

function menorSalarioEmpresa() {
    let menor = 1000000;
    let funcionario = "";
    for (let i = 0; i < funcionarios.length; i++) {
        if (funcionarios[i].salario < menor) {
            menor = funcionarios[i].salario;
            funcionario = funcionarios[i].nome;
            rl.close();
        }
    }
    console.log("Menor salário da empresa: R$ " + menor + " - Nome do(a) funcionário(a): " + funcionario);
}

function mediaSalarialEmpresa() {
    let soma = 0;
    for (let i = 0; i < funcionarios.length; i++) {
        soma += funcionarios[i].salario;
        rl.close();
    }
    let media = soma / funcionarios.length;
    console.log("Média salarial da empresa: R$ " + media);
}

function maiorSalarioSetor() {
    rl.question("Informe o setor desejado: ", function(setor) {
        let maior = 0;
        let funcionario = "";
        for (let i = 0; i < funcionarios.length; i++) {
            if (setor === funcionarios[i].setor) {
                if (funcionarios[i].salario > maior) {
                    maior = funcionarios[i].salario;
                    funcionario = funcionarios[i].nome;
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
        for (let i = 0; i < funcionarios.length; i++) {
            if (setor === funcionarios[i].setor) {
                if (funcionarios[i].salario < menor) {
                    menor = funcionarios[i].salario;
                    funcionario = funcionarios[i].nome;
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
        for (let i = 0; i < funcionarios.length; i++) {
            if (setor === funcionarios[i].setor) {
                soma += funcionarios[i].salario
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