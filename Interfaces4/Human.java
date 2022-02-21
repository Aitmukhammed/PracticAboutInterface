package Interfaces4;

public interface Human {
    default void went() {
        System.out.println("Ходьба");
    }
}
