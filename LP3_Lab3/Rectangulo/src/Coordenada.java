public class Coordenada {
    private int x;
    private int y;

    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c){
        x = c.getX();
        y = c.getY();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distancia(Coordenada c) {
        double distancia = Math.sqrt(Math.pow((c.getX() - this.x), 2) + Math.pow((c.getY() - this.y), 2));
        return distancia;
    }
    
    public static double distancia(Coordenada c1, Coordenada c2) {
        double distancia = Math.sqrt(Math.pow((c2.getX() - c1.getX()), 2) + Math.pow((c2.getY() - c1.getY()), 2));
        return distancia;
    }

    @Override
    public String toString(){
        return "X: "+getX()+" Y: "+getY();
    }
}


