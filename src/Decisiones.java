public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populares");
        }else{
            System.out.println("Películas Retro que aún vale la pena ver");
        }

        if(incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Que disfrute de su película");
        }else{
            System.out.println("Película no disponible en su plan actual");
        }

    }
}
