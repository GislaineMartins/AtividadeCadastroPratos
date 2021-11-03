package view;

import controller.PratoController;
import model.Prato;

public class Main {
    public static void main(String[] args) {
        
        PratoController listaDePratos = new PratoController();
        Prato prato1 = new Prato();
        prato1.id =  1;
        prato1.formato = "redondo";
        prato1.cor = "vermelho";
        prato1.anoDeFabricacao = 2000;
        listaDePratos.create(prato1);

        Prato prato2 = new Prato();
        prato2.id = 2;
        prato2.formato = "quadrado";
        prato2.cor = "verde";
        prato2.anoDeFabricacao = 1985;
        listaDePratos.create(prato2);

        Prato prato3 = new Prato();
        prato3.id = 3;
        prato3.formato = "triangulo";
        prato3.cor = "azul";
        prato3.anoDeFabricacao = 1800;
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

        System.out.println("Alterando COR e ANO DE FABRICAÇÃO do prato1!!");
        prato1.cor = "roxo";
        prato1.anoDeFabricacao = 1999;
        listaDePratos.update(prato1);

        System.out.println("Lista de pratos!!");
        for (Prato p : listaDePratos.read()) {
            System.out.println(p);
        }








    
        
    }
    
}
