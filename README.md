# Bootcamp - Programador de Software (IGTI)

Neste repositório irei armazenar todos os códigos e implementações criadas por mim durante o Bootcamp de Programador de Software Iniciante da IGTI. O bootcamp é dividido em 4 módulos:

- Módulo 1 - Fundamentos
  - Javascript, Node.js, HTML, CSS
- Módulo 2 - Java
- Módulo 3 - Algoritmo e Estrutura de Dados com Java
- Módulo 4 - Python

## Módulo 1

### Trabalho Prático

O aluno deverá criar um programa que informará se o número é primo ou não. Esse número deve ser definido diretamente em uma variável no código. Ao rodar o programa, ele deve listar no terminal se o número colocado na variável é primo ou não.

### Desafio

O desafio consiste em desenvolver funções em <u>JavaScript</u> para realizar alguns processamentos em cima de uma lista de funcionários de uma empresa. Cada funcionário é representado pelas seguintes informações:

- Nome: nome do funcionário;
- Salário: salário do funcionário;
- Setor: setor da empresa em que o funcionário trabalha.

A lista de funcionário foi fornecida e também encontra-se neste repositório com o nome funcionarios.json.

O aluno poderá ler o arquivo pelo programa a ser desenvolvido, ou criar uma variável dentro do programa já com os dados fornecidos, não sendo então obrigatório o processo de leitura do arquivo.

Segue abaixo a descrição das funções a serem desenvolvidas:

- Função que retorna o nome do funcionário que tem o maior salário da empresa.
- Função que retorna o nome do funcionário que tem o menor salário da empresa.
- Função que retorna a média salarial da empresa.
- Função que recebe um setor como parâmetro e retorna o funcionário de maior salário do setor informado.
- Função que recebe um setor como parâmetro e retorna o funcionário de menor salário do setor informado.
- Função que recebe um setor como parâmetro e retorna média salarial do setor informado.

O aluno pode, caso queira, agrupar vários deste itens em uma mesma função, utilizando parâmetros para diferenciar a ação a ser realizada. Fica a critério do aluno a quantidade de funções a serem criadas, desde que todos os processamentos solicitados sejam contemplados.

O resultado das funções pode ser impresso no próprio terminal, ou então mostrados em uma página web; este quesito fica como opcional.

**Eu criei 3 respostas:**

1. **Valor sendo impresso no terminal com os dados do arquivo JSON sendo implementados internamente em uma variável declarada no código.**
2. **Valor sendo impresso no terminal com os dados do arquivo JSON sendo importados diretamente de um arquivo externo ao código.**
3. **Página web utilizando HTML, CSS e JS mostrando todos os resultados.**



## Módulo 2 e 3

### Trabalho Prático

O aluno deverá criar um programa em <u>Java</u> para auxiliar o dono de uma pizzaria na gestão do seu estabelecimento.

O programa deverá ter as seguintes funcionalidades:

1. **Lista de Contatos**

   Permitir ao usuário armazenar uma lista com o nome dos seus clientes, sendo possível inserir, remover e consultar nomes nessa lista.

2. **Fila de Pedidos**

   Permitir ao usuário armazenar uma fila com o nome dos clientes por ordem de chegada, de forma que o primeiro cliente a entrar na lista deve ser o primeiro a sair. Deve ser possível inserir um nome na fila e remover o próximo a ser atendido.

3. **Organizar as Entregas**

   O programa deve receber uma lista de números, cada um representando a distância da casa do cliente para a pizzaria em KM. A entrega dos pedidos será realizada de acordo com a distância, onde os pedidos mais próximos serão entregues primeiro. Por isso, o programa deve retornar uma pilha com os pedidos que sairão primeiro no topo. O programa deve, ainda, permitir que esses itens sejam desempilhados, até que a pilha esteja vazia.

O programa deve apresentar ao usuário um menu pelo terminal, com opções que permitam que ele execute as funcionalidades solicitadas anteriormente.

**Eu criei a classe principal com o método *Main* somente para chamar as outras classes. Foram criadas mais 4 classes dentro do pacote Pizzaria (*ListaContatos.java*, *FilaPedidos.java*, *EntregasMotoboy.java* e *Menu.java*). Na classe *ListaContatos.java* pratiquei os conceitos de <u>ArrayList</u>, em seguida na classe *FilaPedidos.java*, para atender a tarefa, coloquei em prática a estrutura de dados <u>Queue</u>, fazendo analogia ao FIFO (First-in First-out) com a pizzaria onde clientes que chegam primeiro, são atendidos primeiro. Já na classe *EntregasMotoboy.java* utilizei um pouco do conceito de <u>Stack</u>, porém o exercício solicitava uma ordenação dos pedidos para que fossem entregues por ordem de distância, assim precisei ordenar os pedidos na pilha para que o pedido com distância mais próxima fosse o primeiro pedido a sair da pilha e consequentemente ser entregue.**

### Desafio

Desenvolver um programa em <u>Java</u> utilizando os conceitos de orientação a objetos para auxiliar na gestão de uma concessionária de veículos.

O programa deve permitir cadastrar os carros e motos que a concessionária possui, assim como o vendedor responsável por vender cada um desses itens. Pelo programa, também deve ser possível cadastrar clientes dessa concessionária. Na classe carro e moto, é preciso ter um campo que representa  o cliente que comprou o veículo. Depois, no programa, deve existir uma opção no qual o usuário consiga determinar que um cliente adquiriu um bem.

Caso queira exercitar mais os conceitos, o aluno pode criar uma classe abstrata chamada Pessoa, e fazer com que Cliente e Vendedor herdem dela. Também é possível criar uma classe abstrata chamada Veículo e fazer com que Carro e Moto herdem dela. Ao consultar carros, motos, clientes ou vendedores, basta imprimir no terminal a lista com essas informações.

**Construí uma solução com duas classes abstratas, como solicitado no exercício, e dividi as classes que herdavam. Criei um menu com as opções e utilizei os vários conceitos que foram ensinados no curso, como polimorfismo, herança, sobrescrita, encapsulamento, entre outros.**