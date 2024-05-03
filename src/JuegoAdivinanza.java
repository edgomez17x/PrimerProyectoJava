import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intente adivinar el número que estoy pensando, es entre el 0 y el 100");
        for (int i = 0; i < 5; i++) {
            intentos++;
            int usuario = entrada.nextInt();
            if(usuario == numeroAleatorio){
                System.out.println("Felicidades, adivinaste el número: " + numeroAleatorio + ", en tan solo " + intentos + (intentos==1?" intento":" intentos"));
                break;
            }else if(intentos == 5){
                System.out.println("Se alcanzó el número máximo de intentos, el número era: " + numeroAleatorio);
            }else{
                System.out.println("Número incorrecto, vuelve a intentarlo.");
                if(numeroAleatorio > usuario){
                    System.out.println("El número que estoy pensando es mayor.");
                }else{
                    System.out.println("El número que estoy pensando es menor");
                }
            }
        }
    }
}
