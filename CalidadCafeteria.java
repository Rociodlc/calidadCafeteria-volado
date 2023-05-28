
   import java.util.Arrays;
import java.util.Scanner;

    public class CalidadCafeteria {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] calificaciones = new int[30];

            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Ingrese la calificación del estudiante %d (1-5): ", i + 1);
                calificaciones[i] = input.nextInt();
            }

            Arrays.sort(calificaciones);

            System.out.println("Secuencia de cada calificación:");
            for (int calificacion : calificaciones) {
                System.out.println(calificacion + " ");
            }
        }
    }

}
