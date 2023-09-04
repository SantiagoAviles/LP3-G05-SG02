import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        this.valida();
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAnio(){
        return anio;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public void leer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un día: ");
        this.setDia(input.nextInt());
        System.out.println("Ingrese un mes: ");
        this.setMes(input.nextInt());
        System.out.println("Ingrese un año: ");
        this.setAnio(input.nextInt());

        valida();
    }

    public boolean bisiesto(){
        if ((this.getAnio() % 4 == 0) && ((this.getAnio() % 100 != 0) || (this.getAnio() % 400 == 0))){
            return true;
        }
        else{
	        return false;
        }
    }

    public int diasMes(int mes) {
        boolean bisiesto = this.bisiesto();
        int dias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                dias = bisiesto ? 29 : 28;
                break;
            default:
                dias = 30;
                break;
        }
        return dias;
    }

    private void valida(){
        boolean bisiesto = this.bisiesto();
        if (this.getMes() < 1 || this.getMes() > 12){
            this.setMes(1);
        }
        if (this.getAnio() < 1900 || this.getAnio() > 2050){
            this.setAnio(1900);
        }
        int maxDias = 31;
        if (this.getMes() == 4 || this.getMes() == 6 || this.getMes() == 9 || this.getMes() == 11){
            maxDias = 30;
        }
        else if (getMes() == 2){
            if (bisiesto==true){
                maxDias = 29;
            }
            else{
                maxDias = 28;
            }
        }
        if (this.getDia() < 1 || this.getDia() > maxDias){
            this.setDia(1);
        }
    }

    public String corta(){
        return this.getDia()+"-"+this.getMes()+"-"+this.getAnio();
    }

    public int diasTranscurridos() {
        int diastotal = 0;
        for (int i = 1900; i < getAnio();i++){
            if (i % 4 == 0 && (i % 400 == 0 || i % 100 != 0)){
                diastotal += 366;
            } 
            else{
                diastotal += 365;
            }
        }
        for (int j = 0; j < getMes()-1;j++){
            diastotal += diasMes(j);
        }
        diastotal += getDia();
        return diastotal;
    }

    public String diaSemana(){
        int eneroFebrero = (14 - this.getMes()) / 12;
        int anio = this.getAnio() - eneroFebrero;
        int mes = this.getMes() + 12 * eneroFebrero - 2;
        int dia = (this.getDia() + anio + anio / 4 - anio / 100 + anio / 400 + (31 * mes) / 12) % 7 ;
        switch (dia){
            case 0: 
                return "Domingo";
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            default:
                return "No aplica";
        }
    }

    public String larga(){
        int mes = this.getMes();
        String mesTexto;
        switch (mes){
            case 1:
                mesTexto = "enero";
                break;
            case 2:
                mesTexto = "febrero";
                break;
            case 3:
                mesTexto = "marzo";
                break;
            case 4:
                mesTexto = "abril";
                break;
            case 5:
                mesTexto = "mayo";
                break;
            case 6:
                mesTexto = "junio";
                break;
            case 7: 
                mesTexto = "julio";
                break;
            case 8:
                mesTexto = "agosto";
                break;
            case 9:
                mesTexto = "septiembre";
                break;
            case 10:
                mesTexto = "octubre";
                break;
            case 11:
                mesTexto = "noviembre";
                break;
            case 12:
                mesTexto = "diciembre";
                break;
            default:
                mesTexto = "No aplica";
        }
        return getDia()+" de "+mesTexto+" de "+getAnio();
    }
    
    public void fechaTras(long dias) {
        int anio = 1900;
        int mes = 1;
        int dia = 1;
        while (dias > 0){
            int diasMes = diasMes(mes);
            if (dias >= diasMes){
                dias -= diasMes;
                mes++;
                if (mes > 12){
                    mes = 1;
                    anio++;
                }
            } 
            else{
                dia += dias;
                dias = 0;
            }
        }
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public int diasEntre(Fecha fecha) {
        int diasEnte = fecha.diasTranscurridos() - diasTranscurridos(); 
        return diasEnte;
    }

    public void siguiente() {
        int diasMesActual = diasMes(getMes());
        if (getDia() == diasMesActual){
            setDia(1);
            if (getMes() == 12){
                setMes(1);
                setAnio(getAnio() + 1);
            } 
            else{
                setMes(getMes() + 1);
            }
        } 
        else{
            setDia(getDia() + 1);
        }
    }
    
    public void anterior() {
        if (getDia() == 1){
            int mesAnterior = (getMes() == 1) ? 12 : getMes() - 1;
            int diasMesAnterior = diasMes(mesAnterior);
            setDia(diasMesAnterior);
            if (getMes() == 1){
                setMes(12);
                setAnio(getAnio() - 1);
            } 
            else{
                setMes(getMes() - 1);
            }
        } 
        else{
            setDia(getDia() - 1);
        }
    }

    public void fechaFutura(long dias){
        int diasTranscurridos = diasTranscurridos();
        diasTranscurridos += dias;
        int nuevoAnio = 1900;
        int diasEnAnio;
        while (diasTranscurridos > 0) {
            diasEnAnio = (nuevoAnio % 4 == 0 && (nuevoAnio % 400 == 0 || nuevoAnio % 100 != 0)) ? 366 : 365;
            if (diasTranscurridos >= diasEnAnio) {
                diasTranscurridos -= diasEnAnio;
                nuevoAnio++;
            } else {
                break;
            }
        }
        int nuevoMes = 1;
        int nuevoDia = 1;
        while (diasTranscurridos > 0){
            int diasEnMes = diasMes(nuevoMes);
            if (diasTranscurridos >= diasEnMes){
                diasTranscurridos -= diasEnMes;
                nuevoMes++;
            } 
            else{
                nuevoDia += diasTranscurridos;
                break;
            }
        }
        setAnio(nuevoAnio);
        setMes(nuevoMes);
        setDia(nuevoDia);
    }

    public Fecha copia(){
        Fecha fecha = new Fecha(this.dia, this.mes, this.anio);
        return fecha;
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2){
        if (fecha1.getAnio() == fecha2.getAnio() && fecha1.getMes() == fecha2.getMes() && fecha1.getDia() == fecha2.getDia()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.getAnio() < fecha2.getAnio()){
            return true;
        } 
        else if (fecha1.getAnio() > fecha2.getAnio()){
            return false;
        } 
        else{
            if (fecha1.getMes() < fecha2.getMes()){
                return true;
            } 
            else if (fecha1.getMes() > fecha2.getMes()){
                return false;
            } 
            else{
                return fecha1.getDia() < fecha2.getDia();
            }
        }
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2){
        if (fecha1.getAnio() < fecha2.getAnio()){
            return false;
        } 
        else if (fecha1.getAnio() > fecha2.getAnio()){
            return true;
        } 
        else{
            if (fecha1.getMes() < fecha2.getMes()){
                return false;
            } 
            else if (fecha1.getMes() > fecha2.getMes()){
                return true;
            } 
            else{
                return fecha1.getDia() < fecha2.getDia();
            }
        }
    }    
}
