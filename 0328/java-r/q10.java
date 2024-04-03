package report2;

import java.util.Random;

public class q10 {
public static void main(String[] args) {
    int[][] array = new int[4][4];
    Random random = new Random();
    
    // 10개의 랜덤한 정수를 배열에 삽입
    for (int i = 0; i < 10; i++) {
        int num = random.nextInt(10) + 1; // 1에서 10까지의 랜덤한 정수 생성
        int row, col;
        do {
            row = random.nextInt(4); // 0부터 3까지의 랜덤한 행 번호 생성
            col = random.nextInt(4); // 0부터 3까지의 랜덤한 열 번호 생성
        } while (array[row][col] != 0); // 이미 값이 있는 위치라면 다시 위치 선택
        array[row][col] = num;
    }
    
    // 배열 출력
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(array[i][j] + "\t");
        }
        System.out.println();
    }
}
}
