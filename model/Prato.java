package model;

public class Prato extends Base {

    public String formato;
    public String cor;
    public int anoDeFabricacao;

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
        String msg = "Id prato: " + super.id + ", Formato: " + this.formato + ", Cor: " + this.cor + ", Ano: "
                + this.anoDeFabricacao;
        return msg;
    }

}
