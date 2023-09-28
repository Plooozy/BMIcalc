public class BmiService {
    public int calculate(double heightM, int weightKG) {
        int bmi = (int) (weightKG / (heightM * heightM));
        return bmi;
    }
}
