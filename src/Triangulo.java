public class Triangulo extends Figura{
    private int base, altura;
    public Triangulo(String tipo, int base, int altura){
        super (tipo);
        this.setBase(base);
        this.setAltura(altura);
        
    }

    public void setBase(int base){
            this.base = base;
        }
    public void setAltura(int altura){
            this.altura = altura;
        }


    @Override // directiva
    public double area (){
        return (double) this.base * this.altura / 2;

    }

}