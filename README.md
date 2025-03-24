# Sistema de Emprestimos de Biblioteca 

## Características:

O Back-End lida com os dados enviados por um usuario(Front-End).
Faz a conexão dos dados enviados pelo usuario com o Banco de Dados.
Utiliza APIs(Interfaces de Programação de Aplicações) para permitir que o Front-End e outros sistemas se comuniquem entre si.
É Responsavel pela identicação e permissão de usuarios.

## Explicação dos Elementos:

Os EndPoints do tipo Post servem para enviar dados para o Banco de Dados 
![Captura de tela 2025-03-24 172227](https://github.com/user-attachments/assets/d5f253b6-35a8-4f0b-a0b2-29738bd9b803)

E os EndPoints do tipo Get retornam as informações salvas no Banco de Dados.
![Captura de tela 2025-03-24 172432](https://github.com/user-attachments/assets/3d69cc5d-0a55-4861-90fd-b467d2c8ed84)

## Design Patterns:

### 1. Padrões Criacionais (Creational Patterns)
Estes padrões lidam com a criação de objetos, tentando abstrair o processo de instanciamento.

Singleton: Garante que uma classe tenha uma única instância e fornece um ponto de acesso global a ela.

Factory Method: Define uma interface para criar objetos, mas permite que subclasses decidam qual classe instanciar.

Abstract Factory: Fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.

Builder: Separa a construção de um objeto complexo de sua representação, permitindo a criação de diferentes representações.

Prototype: Cria novos objetos copiando um protótipo, em vez de criar instâncias novas do zero.

### 2. Padrões Estruturais (Structural Patterns)
Estes padrões lidam com a composição de classes e objetos para formar estruturas maiores e mais complexas.

Adapter: Permite que interfaces incompatíveis trabalhem juntas, adaptando a interface de uma classe para a interface esperada por outra.

Bridge: Separa a abstração de sua implementação, permitindo que ambas variem independentemente.

Composite: Permite que objetos individuais e compostos sejam tratados de forma uniforme.

Decorator: Permite adicionar comportamentos a um objeto de forma flexível, sem alterar sua estrutura.

Facade: Fornece uma interface simplificada para um subsistema complexo.

Flyweight: Compartilha objetos para suportar grandes quantidades de objetos granulares, economizando memória.

Proxy: Fornece um substituto ou marcador para outro objeto, controlando o acesso a ele.

### 3. Padrões Comportamentais (Behavioral Patterns)
Estes padrões lidam com a interação e responsabilidade entre objetos e como eles se comunicam.

Chain of Responsibility: Permite que uma requisição passe por uma cadeia de manipuladores, permitindo que o responsável pela manipulação da requisição seja definido em tempo de execução.

Command: Encapsula uma solicitação como um objeto, permitindo que o usuário parametrize objetos com diferentes solicitações.

Interpreter: Define uma gramática para interpretar expressões, permitindo a avaliação de linguagens específicas.

Iterator: Fornece uma maneira de acessar os elementos de uma coleção sem expor sua estrutura interna.

Mediator: Define um objeto que centraliza a comunicação entre os objetos, facilitando o controle e reduzindo o acoplamento.

Memento: Captura o estado interno de um objeto e o armazena para poder restaurá-lo mais tarde.

Observer: Permite que um objeto (o "sujeito") notifique outros objetos (os "observadores") sobre mudanças em seu estado.

State: Permite que um objeto altere seu comportamento quando seu estado interno mudar.

Strategy: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis, permitindo que o algoritmo de um objeto varie conforme necessário.

Template Method: Define o esqueleto de um algoritmo em um método, permitindo que subclasses completem o comportamento específico.

Visitor: Permite que você adicione operações a uma estrutura de objetos sem alterar as classes dos objetos que você está visitando.
