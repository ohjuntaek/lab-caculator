import domain.StringCalculator;
import view.InputView;

public class Main {
    public static void main(String[] args) {
        String 입력받은문자열 = InputView.입력받기();
        StringCalculator StringCalculator1 = new StringCalculator(입력받은문자열);
    }
}
