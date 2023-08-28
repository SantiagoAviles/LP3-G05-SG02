import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Cantidad de vidas usadas:" + vida + "\t¿Podra adivinar cual es el numero secreto? Si gana podra ganar un premio!");
            rp = sc.nextInt();
            if (rp == 420)
                fl = true;

<<<<<<< HEAD
        } while (vida < 5 && !fl);
        if (fl == true)
            System.out.println("Ha adivinado! Usted ha ganado un premio!");
=======
        } while (vida < 3 && !fl);
        if (fl == true){
            System.out.println("Ha adivinado! Usted ha ganado un premio!");
            System.out.println(Regalo.elegir(vida));
        }
>>>>>>> rama2
        else
            System.out.println("Ha perdido... Mejor suerte para la proxima");
    }
}
