package Maxime.Entidades;

import com.sun.deploy.security.BadCertificateDialog;

public class Registradora {

    private double total;

    public Registradora() { }

    public void addProduto(Produto produto) { total += produto.getPreco(); }

    public double getTotal() { return total; }

    public String getNomeDoProduto2(Produto produto) {
        String separador1 = "/";
        String separador2 = "-";
        String nome = produto.getCodigo().concat(separador1 + produto.getModelo() + separador2 + produto.getMarca());
        return nome;
    }
}











