import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money;
        double balance = 1719;
        int option = 0;

        System.out.println("""
                ********************************************
                Nombre del cliente: Tony Stark
                Tipo de cuenta: Premium""");
        System.out.println("Saldo disponible: $" + String.format("%,.2f",balance));

        while (option != 9){
            System.out.println("""
                    ********************************************
                    ** Escriba el número de la opción deseada **
                    ********************************************
                    1 - Consultar Saldo.
                    2 - Retirar.
                    3 - Depositar.
                    
                    9 - Salir.
                    ********************************************
                    """);
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Su saldo actual es de: $" + String.format("%,.2f",balance));
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar:");
                    money = input.nextDouble();
                    if(money > balance){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        balance = balance - money;
                        System.out.println("Usted ha retirado $" + String.format("%,.2f",money));
                        System.out.println("Su saldo actual es de: $" + String.format("%,.2f",balance));
                    }
                    break;
                case 3:
                    System.out.println("Cuanto dinero desea depositar:");
                    money = input.nextDouble();
                    balance += money;
                    System.out.println("Su saldo actual es de: $" + String.format("%,.2f",balance));
                    break;
                case 9:
                    System.out.println("El programa ha finalizado, gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no valida, favor de volver a intentar.");
                    break;
            }
        }
    }
}
