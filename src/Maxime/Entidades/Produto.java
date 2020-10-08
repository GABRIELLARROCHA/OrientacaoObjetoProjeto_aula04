package Maxime.Entidades;

public class Produto {

    private String codigo;
    private String modelo;
    private String marca;
    public String nomeDoProduto;
    private double impostoFederal;
    private double impostoPovincial;
    private double valor;
    public double preco;

    //Contrutor default
    public Produto() { }
    //sobrecarga 1
    public Produto(String codigo) { this.codigo = codigo; }
    //sobrecarga 2
    public Produto(String codigo, String modelo, String marca, double impostoFederal, double impostoPovincial, double valor) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.impostoFederal = impostoFederal;
        this.impostoPovincial = impostoPovincial;
        this.valor = valor;
    }

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public double getImpostoFederal() { return impostoFederal; }

    public void setImpostoFederal(double impostoFederal) { this.impostoFederal = impostoFederal; }

    public double getImpostoPovincial() { return impostoPovincial; }

    public void setImpostoPovincial(double impostoPovincial) { this.impostoPovincial = impostoPovincial; }

    public double getValor() { return valor; }

    public void setValor(double valor) { this.valor = valor; }

    public String getNomeDoProduto() {
        String separador1 = "/";
        String separador2 = "-";
        return nomeDoProduto = codigo.concat(separador1+ modelo +separador2+ marca);
    }

    public double getPreco (){
        return preco = getValor()+ ((getImpostoFederal()*getValor())/100 + (getImpostoPovincial()*getValor())/100);
    }
}


