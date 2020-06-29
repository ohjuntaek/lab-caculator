import domain.계산기;
import view.InputView;

public class Main {
    public static void main(String[] args) {
        String 입력받은문자열 = InputView.입력받기();
        계산기 계산기1 = new 계산기(입력받은문자열);
    }
}
