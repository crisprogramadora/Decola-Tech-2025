# Decola Tech 2025

Java RESTful API criada para o Decola Tech 2025.

## Diagrama de classes 

```mermaid
classDiagram
    class Usuario {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Conta {
        +String number
        +String agency
        +float balance
        +float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Cartao {
        +String number
        +float limit
    }

    class Noticia {
        +String icon
        +String description
    }

    Usuario "1" *-- "1" Conta
    Usuario "1" *-- "N" Feature
    Usuario "1" *-- "N" Cartao
    Usuario "1" *-- "N" Noticia
```
