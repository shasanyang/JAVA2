* JAVA
  -2장-
1. JVM에 대해 기술
 Java Virtual Machine, Java 프로그램을 실행하는 플랫폼 특정 컴포넌트
2. 데이터 타입  
기본타입 8개 [p65]
 boolean, char, byte, short, int, long, float, double
4. 연산자 우선순위 [p81 그림2-9]

5. 자바 조건문 기술
 if, switch, for, while, do ~ while, break, return

 -3장-
5. 10개의 데이터를 입력받아 배열에 저장, 합과 평균을 출력하는 프로그램 작성

6. 예외처리하는 간단한 예제 프로그램 [p156 예제 3-17. inputmismatchexception]

 -4,5장-
7. Access modifier를 그림으로 설명

8. 메소드 오버로딩과 오버라이딩을 기술 [p208 / p277 / p289
 method overloading = 정적 바인딩, 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성
 method overriding = 동적 바인딩, 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이르미의 메소드 재작성
9.추상 클래스와 인터페이스를 기술
 추상 클래스 : 선언은 되어 있으나 코드가 구현되어 있지 않아서 껍데기만 있는 메소드, 작성하려면 abstract 키워드와 함께 원형만 선언하고 코드는 작성하지 않음.
 인터페이스 : 서로 다른 하드웨어 장치들이 상호 데이터를 주고받을 수 있는 규격을 의미

 -기타
10. 인의예지신과 중도에 기술
인 : 측은지심
의 : 수오지심
예 : 사양지심
지 : 시비지심
신 : 광명지심
중도 : 정도껏, 눈치껏, 적당히, 상황에 맞춰


* C#
1. 2개의 정수를 입력바당 사칙연산(+, -, *, /, %)의 결과를 출력하는 프로그램 작성
 
2. C#의 데이터 타입
 정수 : sbyte
3. 점수를 입력받아 등급을 출력하는 프로그램 작성 (if, switch)

4. 구구단을 출력하는 프로그램 작성 (반복문 사용)

5. break와 continue로 간단한 예제 프로그램 작성

6. 업캐스팅, 다운캐스팅을 오브젝트로 받아서 처리하는 예제 프로그램 작성

namespace ConsoleApp6
{
    internal class Program
    {
        class point
        {
            public int x, y;
            public point(int x, int y)
            {
                this.x = x;
                this.y = y;
            }
        }
        class rect
        {
            int width, height;

            public point(int width, int height) 
            { 
                this.width = width;
                this.height = height;
            }
        }
        static void printinfo(object obj)
        {
            point pt; rect rt; 
            if (obj is point) {
                pt = (point)obj;
                Console.WriteLine("x = " + pt.x + ", y = " + pt.y);
            }
            if (obj is rect) {
                rt = (rect)obj;
                Console.WriteLine("width = " + rt.width + ", y = " + rt.height);
            }
        }
        static void Main(string[] args)
        {
            point p = new point(1, 2);
            rect r = new rect(3, 4);
            printinfo(p);
            printinfo(r);

        }
    }
}

8. 인의예지신과 중도에 기술
인 : 측은지심
의 : 수오지심
예 : 사양지심
지 : 시비지심
신 : 광명지심
중도 : 정도껏, 눈치껏, 적당히, 상황에 맞춰
