import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lista {
    public static void main(String[] args) {
        //Inserir os números [1, 2, 3, 4 e 5] em uma lista com 5 células
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Remover os dados da lista e inseri-los em uma Pilha com 5 células
        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            int numero = lista.removeFirst();
            pilha.push(numero);
        }

        // Remover os dados da Pilha e inseri-los em uma Fila com 10 células
        Queue<Integer> fila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            int numero = pilha.pop();
            fila.offer(numero);
        }

        // Inserir os números [6, 7, 8, 9 e 10] na lista
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        // Repetir

        while (!lista.isEmpty()) {
            int numero = lista.removeFirst();
            pilha.push(numero);
        }
        while (!pilha.isEmpty()) {
            int numero = pilha.pop();
            fila.offer(numero);
        }

        // Exibir todos os números que foram inseridos na fila
        System.out.println("Números na fila:");
        while (!fila.isEmpty()) {
            int numero = fila.poll();
            System.out.print(numero + " ");
        }
    }
}
