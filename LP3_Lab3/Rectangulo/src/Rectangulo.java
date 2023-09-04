public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    private static String ultimoColor;

    public Rectangulo(Coordenada c1, Coordenada c2){
        this.esquina1 = c1;
        this.esquina2 = c2;

        if (ultimoColor == null) {
            color = "verde";
        } else if (ultimoColor.equals("verde")) {
            color = "amarillo";
        } else if (ultimoColor.equals("amarillo")) {
            color = "rojo";
        } else if (ultimoColor.equals("rojo")) {
            color = "verde";
        }
    
        ultimoColor = color;
    }

    public Rectangulo(int base, int altura) {
        this.esquina1 = new Coordenada(0, 0);
        this.esquina2 = new Coordenada(base, altura);

        if (ultimoColor == null) {
            color = "verde";
        } else if (ultimoColor.equals("verde")) {
            color = "amarillo";
        } else if (ultimoColor.equals("amarillo")) {
            color = "rojo";
        } else if (ultimoColor.equals("rojo")) {
            color = "verde";
        }
    
        ultimoColor = color;
    }

    public String getColor(){
        return color;
    }

    public Coordenada getEsquina1(){
        return esquina1;
    }

    public Coordenada getEsquina2(){
        return esquina2;
    }

    public void setEsquina1(Coordenada c){
        this.esquina1 = c;
    }

    public void setEsquina2(Coordenada c){
        this.esquina2 = c;
    }

    @Override
    public String toString(){
        return "Datos del rectángulo:"+" Esquina 1: "+getEsquina1().toString()+" Esquina 2: "+getEsquina2().toString();
    }
}


