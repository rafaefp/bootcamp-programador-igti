dados = []

def inserir_dados():
    funcionarios = {}
    nome = input("Informe o nome do funcionário: ")
    salario_bruto = float(input("Informe o salário bruto do funcionário: "))
    funcionarios["nome"] = nome
    funcionarios["salario bruto"] = salario_bruto
    dados.append(funcionarios)

print(" ======== CONTROLE DE FOLHA DE PAGAMENTO ========")
print("|                    MENU                        |")
print("|        1 - Cadastrar Funcionário               |")
print("|        2 - Imprimir Contracheque               |")
print("|        0 - Sair                                |")
print(" ================================================")

menu = input("Escolha o menu desejado: ")
while (menu != "0"):
    if (menu == "1"):
        inserir_dados()
        print(dados)
        print(dados[0])
        menu = input("Escolha o menu desejado: ")        
    elif (menu == "2"):
        indice = int(input("Qual o índice do funcionário que deseja imprimir o contracheque? "))
        aliquota_inss_1 = 78.38
        aliquota_inss_2 = 94.01
        aliquota_inss_3 = 125.38
        maior_aliq_1 = 2089.60
        maior_aliq_2 = 3134.40
        maior_aliq_3 = 6101.06
        menor_aliq = 1045
        if (dados[indice]["salario bruto"] <= menor_aliq):
            menor_aliq = dados[indice]["salario bruto"]
            desc_inss = (menor_aliq*7.5)/100
        elif ((dados[indice]["salario bruto"] >= 1045.01)and(dados[indice]["salario bruto"] <= maior_aliq_1)):
            maior_aliq_1 = dados[indice]["salario bruto"]
            aliquota_inss_2 = ((maior_aliq_1-1045.01)*9)/100
            desc_inss = aliquota_inss_1 + aliquota_inss_2
        elif ((dados[indice]["salario bruto"] > 2089.60)and(dados[indice]["salario bruto"] <= maior_aliq_2)):
            maior_aliq_2 = dados[indice]["salario bruto"]
            aliquota_inss_3 = ((maior_aliq_2-2089.61)*12)/100
            desc_inss = aliquota_inss_1 + aliquota_inss_2 + aliquota_inss_3
        elif ((dados[indice]["salario bruto"] > 3134.40)and(dados[indice]["salario bruto"] <= maior_aliq_3)):
            maior_aliq_3 = dados[indice]["salario bruto"]
            aliquota_inss_4 = ((maior_aliq_3-3134.41)*14)/100
            desc_inss = aliquota_inss_1 + aliquota_inss_2 + aliquota_inss_3 + aliquota_inss_4
        else:
            desc_inss = 713.10
        salario_menos_inss = dados[indice]["salario bruto"]-desc_inss
        if (salario_menos_inss <= 1903.98):
            desc_irrf = 0
        elif ((salario_menos_inss >= 1903.99)and(salario_menos_inss <= 2826.65)):
            desc_irrf = ((salario_menos_inss*7.5)/100)-142.80
        elif ((salario_menos_inss >= 2826.66)and(salario_menos_inss <= 3751.05)):
            desc_irrf = ((salario_menos_inss*15)/100)-354.80
        elif ((salario_menos_inss >= 3751.06)and(salario_menos_inss <= 4664.68)):
            desc_irrf = ((salario_menos_inss*22.5)/100)-636.13
        else:
            desc_irrf = ((salario_menos_inss*27.5)/100)-869.36
        salario_liquido = salario_menos_inss-desc_irrf
        print(f"Funcionário: {dados[indice]['nome']}")
        print("Salário Bruto: R$ {:.2f}".format(dados[indice]["salario bruto"]))
        print("Desconto INSS: R$ {:.2f}".format(desc_inss))
        print("Desconto IRRF: R$ {:.2f}".format(desc_irrf))
        print("Salário Líquido: R$ {:.2f}".format(salario_liquido))
        menu = input("Escolha o menu desejado: ")
print("Programa Finalizado")