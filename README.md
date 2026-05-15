🏋️ Sistema de Gestão de Academia — Java OOP
Sistema de gerenciamento para academias desenvolvido em Java, com foco em Programação Orientada a Objetos (POO). O projeto simula operações reais de uma academia: contratação de funcionários, gestão de instrutores, controle de planos e relatório financeiro.

📋 Funcionalidades

Contratar Funcionários — Cadastra novos funcionários com nome, cargo e anos de experiência
Tabela de Planos — Exibe os planos disponíveis com seus respectivos preços e total de matrículas ativas
Relatório Financeiro — Mostra os gastos com funcionários gerais e instrutores, além do total da folha de pagamento
Registrar Venda de Plano — Atualiza o contador de contratos por tipo de plano


🗂️ Estrutura do Projeto
├── Main.java          # Ponto de entrada — menu interativo e orquestração do sistema
├── Academia.java      # Classe central — gerencia planos, funcionários e gastos
├── Funcionario.java   # Modelo de funcionário com encapsulamento via getters/setters
├── Instrutor.java     # Herda de Funcionário — adiciona salário, CPF, e-mail e especialidade
├── Planos.java        # Define os tipos e valores dos planos disponíveis
└── Cadastro.java      # Sistema auxiliar de cadastro de funcionários via terminal

🧱 Conceitos de POO Aplicados
ConceitoOnde é aplicadoEncapsulamentoAtributos privados com getters e setters em todas as classesHerançaInstrutor estende FuncionarioAbstraçãoAcademia centraliza as regras de negócioComposiçãoAcademia compõe objetos de Planos, Funcionario e Instrutor

💰 Planos Disponíveis
PlanoPreço MensalMais BaratoR$ 59,99NormalR$ 89,99Plus UltraR$ 119,99

▶️ Como Executar
Pré-requisito: Java 11 ou superior instalado.
bash# 1. Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio

# 2. Compile todos os arquivos
javac *.java

# 3. Execute o programa principal
java Main

🖥️ Exemplo de Uso
===== SISTEMA DE GESTÃO DA ACADEMIA =====
1 - Contratar Funcionário
2 - Mostrar Tabela de Planos
3 - Ver Relatório de Gastos (Financeiro)
4 - Registrar Contratação de Plano
5 - Sair
Escolha uma opção: 2

===== TABELA DE PLANOS DISPONÍVEIS =====
Plano mais barato
Preço: 59.99
Plano normal
Preço: 89.99
Plano plus ultra
Preço 119.99
----------------------------------------
Matrículas Ativas por Plano:
   Mais Barato : 15
   Normal      : 22
   Plus Ultra  : 8

🛠️ Tecnologias

Java (SE 11+)
Paradigma Orientado a Objetos
Entrada de dados via Scanner (console)
Coleções com ArrayList


📌 Status do Projeto

🚧 Em desenvolvimento — novas funcionalidades como persistência de dados e relatórios completos por instrutor estão planejadas.
