package view;

import controller.PratoController;
import model.Prato;

public class Main {
    public static void main(String[] args) {
        
        PratoController listaDePratos = new PratoController();
        Prato prato1 = new Prato();
        prato1.id =  1;
        prato1.nome = "Strogonofre";
        prato1.quantidadeTotal = 1;
      
        listaDePratos.create(prato1);

        Prato prato2 = new Prato();
        prato2.id = 2;
        prato2.nome = "file de peito";
        prato2.quantidadeTotal = 1;
        listaDePratos.create(prato2);

        Prato prato3 = new Prato();
        prato3.id = 3;
        prato3.nome = "lasanha";
        prato3.quantidadeTotal = 1;
        listaDePratos.create(prato3);

        System.out.println("Existe prato 1: "+listaDePratos.existe(prato1));
        System.out.println("Existe prato 2: "+listaDePratos.existe(prato2));
        System.out.println("Existe prato 3: "+listaDePratos.existe(prato3));

        System.out.println("Lista de pratos!!");
        for (Prato p : listaDePratos.read()) {
            System.out.println(p);
        }
        
        System.out.println("Deletando prato2!!");
        listaDePratos.delete(prato2);

        System.out.println("Lista de pratos!!");
        for (Prato p : listaDePratos.read()) {
            System.out.println(p);
        }

        System.out.println("Alterando NOME do prato1!!");
        prato1.nome = "panqueca";       
        listaDePratos.update(prato1);

        System.out.println("Lista de pratos!!");
        for (Prato p : listaDePratos.read()) {
            System.out.println(p);
        }








    
        
    }
    
}
