var readLine = require("readline");
var rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});
var dados = [];
console.log();
console.log(" ======== CONTROLE DE FOLHA DE PAGAMENTO ========");
console.log("|                      MENU                      |");
console.log("|          1 - Cadastrar Funcionário             |");
console.log("|          2 - Imprimir Contracheque             |");
console.log("|          0 - Sair                              |");
console.log(" ================================================");
readlineRecursivo();

function readlineRecursivo() {
    rl.question("Escolha o menu desejado: ", function(menu){
        menu = menu;
        switch(menu) {
            case "0":
                console.log("Programa Finalizado.");
                rl.close();
                break;
            case "1":
                rl.question("Informe o nome do funcionário: ", function(nome){
                    nome = nome;
                    rl.question("Informe o salário bruto do funcionário: ", function(salarioBruto){
                        salarioBruto = parseFloat(salarioBruto);
                        dados.push({"nome":nome, "salario":salarioBruto});
                        readlineRecursivo();
                    });
                });
                break;
            case "2":
                rl.question("Qual o índice do funcionário que deseja imprimir o contracheque? ", function(indice){
                    indice = parseInt(indice);                    
                    aliquotaInss1 = 78.38;
                    aliquotaInss2 = 94.01;
                    aliquotaInss3 = 125.38;
                    maiorAliq1 = 2089.60;
                    maiorAliq2 = 3134.40;
                    maiorAliq3 = 6101.06;
                    menorAliq = 1045;
                    if (dados[indice].salario <= menorAliq) {                        
                        menorAliq = dados[indice].salario;                        
                        descInss = (menorAliq*7.5)/100;
                    } else if ((dados[indice].salario >= 1045.01)&&(dados[indice].salario <= maiorAliq1)) {
                        maiorAliq1 = dados[indice].salario;
                        aliquotaInss2 = ((maiorAliq1-1045.01)*9)/100;
                        descInss = aliquotaInss1 + aliquotaInss2;
                    } else if ((dados[indice].salario > 2089.60)&&(dados[indice].salario <= maiorAliq2)) {
                        maiorAliq2 = dados[indice].salario;
                        aliquotaInss3 = ((maiorAliq2-2089.61)*12)/100;
                        descInss = aliquotaInss1 + aliquotaInss2 + aliquotaInss3;
                    } else if ((dados[indice].salario > 3134.40)&&(dados[indice].salario <= maiorAliq3)) {
                        maiorAliq3 = dados[indice].salario;
                        aliquotaInss4 = ((maiorAliq3-3134.41)*14)/100;
                        descInss = aliquotaInss1 + aliquotaInss2 + aliquotaInss3 + aliquotaInss4;
                    } else {
                        descInss = 713.10;
                    } 

                    salarioMenosInss = dados[indice].salario-descInss;

                    if (salarioMenosInss <= 1903.98) {
                        descIrrf = 0;
                    } else if ((salarioMenosInss >= 1903.99)&&(salarioMenosInss <= 2826.65)) {
                        descIrrf = ((salarioMenosInss*7.5)/100)-142.80;
                    } else if ((salarioMenosInss >= 2826.66)&&(salarioMenosInss <= 3751.05)) {
                        descIrrf = ((salarioMenosInss*15)/100)-354.80;
                    } else if ((salarioMenosInss >= 3751.06)&&(salarioMenosInss <= 4664.68)) {
                        descIrrf = ((salarioMenosInss*22.5)/100)-636.13;
                    } else {
                        descIrrf = ((salarioMenosInss*27.5)/100)-869.36;
                    }

                    salarioLiquido = salarioMenosInss-descIrrf;

                    console.log("Funcionário: " + dados[indice].nome);
                    console.log("Salário Bruto: R$ " + dados[indice].salario);
                    console.log("Desconto INSS: R$ " + descInss.toFixed(2));
                    console.log("Desconto IRRF: R$ " + descIrrf.toFixed(2));
                    console.log("Salário Líquido: R$ " + salarioLiquido.toFixed(2));
                    readlineRecursivo();                        
                });
                break;
            default:
                console.log("Opção inválida.");
                readlineRecursivo();
        }
    });
};