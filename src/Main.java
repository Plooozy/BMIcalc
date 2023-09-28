public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87; // Рост в метрах
        int weightKG = 98; // Вес в килограммах
        int bmi = service.calculate(heightM, weightKG);
        System.out.println(bmi);
    }
}