Aqui estão 5 exercícios práticos para implementar o **Factory Pattern**:

### 1. **Fábrica de Veículos**
Implemente uma fábrica para criar diferentes tipos de veículos, como **Carro**, **Moto** e **Caminhão**. Cada veículo deve ter um método `move()` que imprime como ele se move (por exemplo, "O carro está dirigindo", "A moto está acelerando"). A fábrica deve retornar a classe correspondente com base em uma string de entrada.

#### Requisitos:
- Criar uma interface `Vehicle` com o método `move()`.
- Criar classes concretas: `Car`, `Motorcycle`, `Truck`, implementando `Vehicle`.
- Criar uma `VehicleFactory` que retorna o objeto correto com base no tipo de veículo.

### 2. **Fábrica de Pizzas**
Desenvolva uma fábrica para criar diferentes tipos de pizzas, como **Pizza de Calabresa**, **Pizza de Mussarela** e **Pizza Vegana**. Cada pizza deve ter um método `prepare()` que imprime os ingredientes usados para prepará-la.

#### Requisitos:
- Criar uma interface `Pizza` com o método `prepare()`.
- Implementar classes como `CalabresaPizza`, `MussarelaPizza`, `VeggiePizza`, que implementam `Pizza`.
- Criar uma `PizzaFactory` que retorna o tipo de pizza com base no tipo fornecido como parâmetro.

### 3. **Fábrica de Documentos**
Implemente uma fábrica que crie diferentes tipos de documentos, como **PDF**, **Word** e **Excel**. Cada documento deve ter um método `generate()` que imprime uma mensagem dizendo que o documento foi gerado.

#### Requisitos:
- Criar uma interface `Document` com o método `generate()`.
- Criar classes concretas `PdfDocument`, `WordDocument`, `ExcelDocument`, implementando `Document`.
- Implementar uma `DocumentFactory` que decide qual documento gerar com base em um parâmetro.

### 4. **Fábrica de Contas Bancárias**
Implemente uma fábrica para criar diferentes tipos de contas bancárias, como **Conta Corrente**, **Conta Poupança** e **Conta Salário**. Cada conta deve ter um método `accountType()` que retorna o tipo de conta.

#### Requisitos:
- Criar uma interface `BankAccount` com o método `accountType()`.
- Criar classes `CheckingAccount`, `SavingsAccount`, `SalaryAccount`, que implementam `BankAccount`.
- Criar uma `BankAccountFactory` que cria o tipo correto de conta com base no parâmetro fornecido.

### 5. **Fábrica de Formas Geométricas com Cor**
Expanda o exemplo da **fábrica de formas geométricas** (como Círculo, Quadrado) para também incluir uma cor. Cada forma criada pela fábrica deve ter uma cor associada (como Vermelho, Azul, Verde) e um método `draw()`, que imprime o tipo de forma e sua cor.

#### Requisitos:
- Modificar a interface `Shape` para ter o método `draw()` que aceita a cor como parâmetro.
- Criar classes `ColoredCircle`, `ColoredSquare`, etc., que implementam `Shape` e armazenam a cor.
- A `ShapeFactory` deve retornar a forma correta e permitir que o cliente especifique também a cor.

Esses exercícios ajudarão a consolidar a compreensão do **Factory Pattern**, abordando diferentes cenários e práticas de design.