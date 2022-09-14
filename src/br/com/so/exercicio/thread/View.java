package br.com.so.exercicio.thread;

public class View {

    public static void main(String[] args) {

        int qtdSapos = 5;

        System.out.println("Corrida de Sapos! -> Distância: 100m");

        for (int i = 0; i < qtdSapos; i++) {
            ThreadSapo threadSapo = new ThreadSapo("SAPO-"+i);
            threadSapo.start();
        }

    }
}
