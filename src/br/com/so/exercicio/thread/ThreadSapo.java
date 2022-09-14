package br.com.so.exercicio.thread;

import java.security.SecureRandom;

public class ThreadSapo extends Thread {

    private final int tamanhoPercurso = 100;
    private static int colocacao;

    private String sapo;

    public ThreadSapo(String sapo) {
        this.sapo = sapo;
    }

    @Override
    public void run() {

       int distanciaPercorrida = 0;
       for (int i = 0; i < tamanhoPercurso; i++) {

           distanciaPercorrida = distanciaPercorrida + new SecureRandom().nextInt(10);

           if (distanciaPercorrida >= tamanhoPercurso) {
                break;
           }

           System.out.println(sapo + " percorreu " + distanciaPercorrida + " metros");

           try {
               sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

        colocacao = colocacao + 1;
        System.out.println(sapo + " ficou na colocação " + colocacao);
    }
}
