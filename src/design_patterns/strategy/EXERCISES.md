Aqui estão 5 exercícios práticos para implementar o **Strategy Pattern**:

### 1. **Sistema de Frete**
Crie um sistema de cálculo de frete que use o padrão Strategy para escolher a transportadora. Implemente diferentes estratégias para:
- Frete econômico.
- Frete expresso.
- Frete via transportadora específica (Correios, FedEx, etc.).

O cliente deve poder selecionar o tipo de frete dinamicamente e calcular o custo com base em diferentes critérios, como peso e distância.

### 2. **Sistema de Pagamento**
Desenvolva um sistema de processamento de pagamentos. Implemente diferentes estratégias de pagamento, como:
- Cartão de crédito.
- PayPal.
- Boleto bancário.

O cliente deve poder alternar entre os métodos de pagamento no momento da compra, e cada método terá sua própria forma de processar o pagamento.

### 3. **Validação de Documento**
Crie um sistema de validação de documentos que valide diferentes tipos de documentos utilizando o Strategy Pattern. Implemente estratégias para:
- Validação de CPF.
- Validação de CNPJ.
- Validação de passaporte.

O sistema deve permitir a troca do algoritmo de validação com base no tipo de documento fornecido.

### 4. **Filtro de Imagens**
Implemente um programa que aplique diferentes filtros a uma imagem utilizando o Strategy Pattern. Crie estratégias para:
- Filtro de escala de cinza.
- Filtro de sépia.
- Filtro de inversão de cores.

O cliente deve poder escolher o filtro que deseja aplicar à imagem, e o sistema deve processar a imagem de acordo com o filtro selecionado.

### 5. **Jogo de Ataque**
Desenvolva um sistema para um jogo onde os personagens podem ter diferentes tipos de ataque. Implemente diferentes estratégias de ataque, como:
- Ataque corpo a corpo.
- Ataque à distância com arco e flecha.
- Ataque mágico.

O jogador deve poder trocar a estratégia de ataque do personagem durante o jogo e executar o ataque de acordo com a estratégia escolhida.

---

Cada exercício te permitirá praticar a implementação do Strategy Pattern em diferentes contextos e te dará uma boa compreensão de como aplicar o padrão em cenários reais.