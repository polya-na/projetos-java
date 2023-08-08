package java_filas;

public class Main {
    public static void main(String[] args){
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila + "\r\n");

        minhaFila.enqueue("Último");
        System.out.println(minhaFila + "\r\n");

        minhaFila.dequeue();
        System.out.println(minhaFila + "\r\n");

        System.out.println("\r\n" + minhaFila.first() + "\r\n");

        System.out.println(minhaFila);
    }
}
