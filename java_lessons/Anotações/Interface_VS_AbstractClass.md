#Diferença entre Interface e Classe Abstrata




 **Herança Múltipla**          - Uma classe pode implementar diversas interfaces, mas uma classe só pode herdar uma classe abstrata.
 
 **Implementação Padrão**      - Uma interface não pode conter qualquer tipo de código, muito menos código padrão, já uma classe abstrata pode fornecer código completo, código padrão ou ter apenas a declaração de seu esqueleto para ser posteriormente sobrescrita.
 
 **Constantes**                - Uma interface suporta somente constantes do tipo estática, já a classe abstrata pode conter constante estática e instanciada.
 
 <h2>Interface</h2>
 
·         Uma interface não é considerada uma Classe e sim uma Entidade.

·         Não possui implementação, apenas assinatura, ou seja, apenas a definição dos seus métodos sem o corpo.

·         Todos os métodos são abstratos.

·         Seus métodos são implicitamente Públicos e Abstratos.

·         Não há como fazer uma instância de uma Interface e nem como criar um Construtor.

·         Funcionam como um tipo de "contrato", onde são especificados os atributos, métodos e funções que as classes que implementem essa interface são obrigadas a implementar.

<h2>Classes Abstratas</h2>

·         As classes abstratas devem conter pelo menos um método abstrato, que não tem corpo.

·         É um tipo especial de classe que não há como criar instâncias dela.

·         É usada apenas para ser herdada, funciona como uma super classe.

·         Uma grande vantagem é que força a hierarquia para todas as sub-classes.

·         É um tipo de contrato que faz com que as sub-classes contemplem as mesmas hierarquias e/ou padrões.