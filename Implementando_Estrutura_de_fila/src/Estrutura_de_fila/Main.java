package Estrutura_de_fila;

public class Main {
	
    public static void main (String[] args) {

        Fila <String> minhaFila = new Fila <>();

        minhaFila.enqueue("S01");
        minhaFila.enqueue("S02");
        minhaFila.enqueue("S03");
        minhaFila.enqueue("S04");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

    }

}
