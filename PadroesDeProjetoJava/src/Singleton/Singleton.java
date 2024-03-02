package Singleton;

public class Singleton {
    // A instância única da classe Singleton
    private static  Singleton instance;
    // Construtor privado para evitar a criação de instâncias através do operador new
    private Singleton(){}

    // Método estático para obter a instância única da classe
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello, Singleton");
    }
}
