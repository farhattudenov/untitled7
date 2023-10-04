import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test(23, 10);
        test(generateRandomAge(), 10);
        test(50, 15);
        test(18, 27);
        test(30, -5);
    }

    public static void test(int age, int temperature) {
        String result = canGoOutside(age, temperature);
        System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + result);
    }

    public static String canGoOutside(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100); // Генерируем случайный возраст от 0 до 99
    }

}
