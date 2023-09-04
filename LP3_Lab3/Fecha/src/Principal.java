public class Principal{
    public static void main(String[] args){
        Fecha fecha = new Fecha(23, 6, 2005);
        Fecha fecha2 = new Fecha(7, 4, 2011);
        Fecha fecha3 = new Fecha(27, 6, 2005);
        Fecha fecha4 = new Fecha(56, 675, 534345);
        System.out.println(fecha.diasMes(fecha.getMes()));
        System.out.println(fecha.corta());
        System.out.println(fecha4.corta());
        System.out.println(fecha.diaSemana());
        System.out.println(fecha.larga());
        System.out.println(fecha.diasTranscurridos());
        System.out.println(fecha3.diasTranscurridos());
        System.out.println(fecha.diasEntre(fecha3));
        fecha.fechaFutura(39);
        fecha4.fechaTras(123);
        System.out.println(fecha4.corta());
        Fecha fechaclon = fecha.copia();
        System.out.println(fechaclon.larga());
        fecha.siguiente();
        fecha2.anterior();
        System.out.println(fecha.larga());
        System.out.println(fecha2.larga());
        System.out.println(Fecha.igualQue(fecha, fecha2));
        System.out.println(Fecha.menorQue(fecha, fecha2));
        System.out.println(Fecha.mayorQue(fecha, fecha2));
    }
}