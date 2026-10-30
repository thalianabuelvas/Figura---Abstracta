public class Circulo extends Figura{
    private int radio;

    public Circulo(String tipo, int radio){
        super(tipo);
        this.setRadio(radio);
    }

    public void setRadio(int radio){
        this.radio = radio;

    }

    public double area(){
        return(double) Math.PI * this.radio * this.radio;

    }

}