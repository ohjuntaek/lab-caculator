package domain;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 계산기 {
    int[] 숫자;
    String 구분자;

    public 계산기(String 입력받은넘) {
        숫자랑구분자뽑기(입력받은넘);
    }

    private void 숫자랑구분자뽑기(String 입력받은문자열) {
        구분자 = 구분자뽑기(입력받은문자열);
        숫자 = 숫자뽑기(입력받은문자열, 구분자);
    }

    private int[] 숫자뽑기(String 입력받은문자열, String 구분자) {
        String[] split;
        if (구분자.equals("")) {
            split =  디폴트구분자로숫자뽑기(입력받은문자열);
        } else {
            String[] s = 입력받은문자열.split("n");
            split = s[1].split(구분자);
        }
        return Arrays.stream(split).mapToInt(Integer::parseInt)
                .toArray();
    }

    private String[] 디폴트구분자로숫자뽑기(String 입력받은문자열) {
        return 입력받은문자열.split("[,:]");
    }

    private String 구분자뽑기(String 입력받은문자열) {
        Pattern pattern = Pattern.compile("[\\/\\/]\\/(.+)[\\\\]n");
        Matcher matcher = pattern.matcher(입력받은문자열);
        boolean 구분자가존재함 = matcher.find();
        if (구분자가존재함) return matcher.group(1);
        else return "";
    }

    public int 결과출력() {
        return Arrays.stream(숫자).sum();
    }
}
