clientes=["Marcelo","Joana D'arc","Maria de Fátima"]
produtos=[{"nome":"computador","preco":1000.50},{"nome":"mouse","preco":120.10},{"nome":"Monitor LCD","preco":999.99}]
compras=[]
valor_compra=0
pergunta=""

def processar_compra(produtos):  
  itens_comprados={}
  item=int(input("Qual o índice do item que deseja comprar? "))       
  itens_comprados["produto"] = (produtos[item]["nome"])
  itens_comprados["preco"] = (produtos[item]["preco"])
  info=int(input("Qual a quantidade que deseja comprar? "))
  itens_comprados["quantidade"] = info
  if item==0:
    imposto=100.05
  elif item==1:
    imposto=12.01
  elif item==2:
    imposto=99.99
  itens_comprados["imposto"] = imposto
  itens_comprados["total"] = ((produtos[item]["preco"])*info)+imposto
  compras.append(itens_comprados)

nome_cliente=input("Informe o nome do cliente: ")
for cliente in clientes:
  if nome_cliente.upper() in cliente.upper():
    id_cliente=cliente
    print(f"Nome do cliente: {id_cliente}")
    while (pergunta!="NAO")and(pergunta!="nao"):     
      processar_compra(produtos)
      pergunta=input("Gostaria de comprar mais algum item? Responda SIM ou NAO ")
    for valores in compras:
      valor_compra=valor_compra+(valores["preco"]*valores["quantidade"])+valores["imposto"]
    print("==============================")
    print("Nota Fiscal")
    print(f"Nome do cliente: {id_cliente}")
    print("Itens comprados")
    for produtos_comprados in compras:  
      print("{} - Quantidade: {} - Valor do imposto: {} - Valor total: {:.2f}".format(produtos_comprados["produto"],produtos_comprados["quantidade"],produtos_comprados["imposto"],produtos_comprados["total"]))
    print("Valor total: {:.2f}".format(valor_compra))
    print("Volte Sempre")
    print("==============================")
    break
else:
  print("Não encontrei esse nome.")