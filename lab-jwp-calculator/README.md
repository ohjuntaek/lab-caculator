# lab-caculator

요구사항

## 문자열 domain.StringCalculator 요구사항 및 실습

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.

`" " => 0, "1, 2" => 3, "1,2:3" => 6`
- 앞의 기본 구분자 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 //와 \n 사이에 위치하는 문자를 커스텀 구분자로 사용한다.

`//;\n1;2;3 ⇒ 6`

- 문자열 계산기에 음수를 전달하면 RuntimeException

## 기능 정의

- 한줄로 문자를 입력받는다.
- 숫자를 분리한다.
- 분리한 숫자를 더한다.
- 분리한 숫자가 음수이면 예외를 발생시킨다.

## 객체 정의

- domain.StringCalculator
  - (숫자)
  - 숫자 분리하기
  - 분리한 숫자 더하기
    - 숫자(VO)

끝~

---

## 책보고 리팩토링

- 계산기 -> StringCalculator
- add_null_또는_빈문자()
  - 항상 작은 단위로, 극한 케이스를 먼저 테스트하자!
  

  