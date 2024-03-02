package Strategy;

public class Main {
    public static void main(String[] args) {
        // Criando o contexto
        var contexto = new Context();

        // Definindo a estrategia A
        contexto.setStrategy(new ConcreteStrategyA());
        contexto.executeStrategy();


        contexto.setStrategy(new ConcreteStrategyB());
        contexto.executeStrategy();
    }
}
