import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа вычисляет корни квадратного уравнения ax^2 + bx + c = 0");

        System.out.print("Введите коэф a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэф b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэф c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println(String.format("Корни уравнения: х1 = %.2f х2 = %.2f", x1, x2));
        } else if (discriminant == 0) {
            double x = -b / (2 * a);

            System.out.println(String.format("Корень уравнения: х = %.2f", x));
        } else if (discriminant < 0) {
            System.out.println("Уравнение корней не имеет");
        }


    }
}