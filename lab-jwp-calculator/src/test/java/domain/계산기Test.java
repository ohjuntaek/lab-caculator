package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class 계산기Test {
    String 구분자받은문자열 = "//;\\n1;2;3";
    String 디폴트구분자문자열 = "1,2:3,4";
    계산기 만든계산기;
    계산기 만든계산기2;

    @Before
    public void setUp() {
        만든계산기 = new 계산기(구분자받은문자열);
        만든계산기2 = new 계산기(디폴트구분자문자열);
    }

    // https://regex101.com/
    // https://m.blog.naver.com/PostView.nhn?blogId=rorean&logNo=221582429295&proxyReferer=https:%2F%2Fwww.google.com%2F
    @Test
    public void 구분자뽑기() {
        assertEquals(";",  만든계산기.구분자);
        assertEquals("", 만든계산기2.구분자);
    }

    @Test
    public void 숫자뽑기() {
        assertArrayEquals(new int[] {1,2,3}, 만든계산기.숫자);
    }

    @Test
    public void 결과주기() {
        assertEquals(6, 만든계산기.결과출력());
        assertEquals(10, 만든계산기2.결과출력());
    }
}