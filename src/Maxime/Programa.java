package Maxime;

import Maxime.Entidades.Produto;
import Maxime.Entidades.Registradora;

public class Programa {
    public static void main(String[] args) {

        Produto produto1 = new Produto("0034","borracha","bic",5,9.975,2.30);

        Produto produto2 = new Produto();
        produto2.setCodigo("0035");
        produto2.setModelo("caneta");
        produto2.setMarca("bic");
        produto2.setValor(1.20);
        produto2.setImpostoFederal(5);
        produto2.setImpostoPovincial(9.975);

        Produto produto3 = new Produto();
        produto3.setCodigo("0036");
        produto3.setModelo("caderno");
        produto3.setMarca("bic");
        produto3.setValor(3.50);
        produto3.setImpostoFederal(5);
        produto3.setImpostoPovincial(9.975);

        Registradora r1;
        r1 = new Registradora();
        r1.addProduto(produto2);

        Registradora r2;
        r2 = new Registradora();
        r2.addProduto(produto1);
        r2.addProduto(produto3);

        System.out.println(produto2.getPreco()); // preco =  1,3797 verificando o preço unitario com imposto de cada item
        System.out.println(produto1.getNomeDoProduto()); // usando o getNomeDoProduto criado na classe produto para teste
        System.out.println( produto2.getNomeDoProduto()) ;

        System.out.println("lista de produtos");
        System.out.println("Poduto: " + r2.getNomeDoProduto2(produto1)); // usando o getNomeDoProduto2 criado na classe Registradora
        System.out.println("Poduto: " + r2.getNomeDoProduto2(produto3));
        System.out.println(" total: " + r2.getTotal());// 6,6685
    }
}
