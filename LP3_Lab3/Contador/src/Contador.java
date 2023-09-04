public class Contador {
    static int acumulador = 0;
    final static int VALOR_INICIAL = 10;
    private int valor;
    static int nContadores = 0;
    static int ultimoContador = 0;

    public static int acumulador(){
        return acumulador;
    }

    public static int getTotalContadores(){
        return nContadores;
    }

    public static int getUltimoContador(){
        return ultimoContador;
    }

    public Contador(int valor){
        this.valor = valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }

    public Contador(){
        this(Contador.VALOR_INICIAL);
        ultimoContador = VALOR_INICIAL;
        nContadores++;
    }

    public void inc(){
        this.valor++;
        acumulador++;
    }

    public int getValor(){
        return this.valor;
    }
    
}

