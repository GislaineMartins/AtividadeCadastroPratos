package model;

public class Prato extends Base {

    public String nome;    
    public int quantidadeTotal;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Prato) {
            Prato novoPrato = (Prato) obj;
            if (this.id == novoPrato.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String msg = "Id prato: " + super.id + ", Nome: " + this.nome + 
        ", Quantidade total: " + this.quantidadeTotal;
        return msg;
    }

}
