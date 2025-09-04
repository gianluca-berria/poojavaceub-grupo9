```mermaid
classDiagram
    class Usuario {
        +getNome() string
        +login() void
    }

    class Cliente {
        +getEndereco() string
        +fazerPedido() void
    }

    class Funcionario {
        +getSalario() float
        +realizarTarefa() void
    }

    class Vendedor {
        +getComissao() float
        +venderProduto() void
    }

    class Gerente {
        +getEquipe() string[]
        +gerenciarEquipe() void
    }

    Usuario <|-- Cliente
    Usuario <|-- Funcionario
    Funcionario <|-- Vendedor
    Funcionario <|-- Gerente
