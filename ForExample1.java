public class ForExample1 {
  
  public static void main(String[] args){
    
//     // 1. 구구단의 2단을 출력
//     for (int i = 1; i<=9; i++){
//       System.out.println(" 2X "+i+" = "+(2*i));
//     }
//     // 2. 합계 구하기
//     // 1+2+3+4+5+6+7+8+9+10=56
//     int sum = 0;
//     for (int i=1; i<=10; i++){
//       sum+=i;
//     }
//     System.out.println("1부터 10까지의 합 : "+sum);
//   }
// }


  // //2. while문
  // int num = 1; //초기화
  // while(num <= 5){ //조건식
  //   System.out.println(num);
  //   num++; // 증감식
  // }

  // // 2. 카운트 다운
  //   int count = 5;

  //   while(count>0){
  //   System.out.println(count);
  //   count--;
  //   }
  //   System.out.println("발사!");


    // // 3. 무한 루프
    // int i = 0;
    // while(true){
    //   System.out.println("무한 반복!!!!! 위험함.");
    //   i++;
    // }

    // // 3. break, continue

    // // break
    // int sum = 0;
    // int num = 1;

    // while (true) {
    //   sum += num;
    //   if (sum>100){
    //     break;
    //   }
    //   num++;
    // }
    // System.out.println("마지막에 더한 수 : "+num);
    // System.out.println("최종 합계 : "+sum);

    // // continue
    // int number = 0;
    // while (number<10){
    //   number++;
    //   if (number % 2 != 0){ //홀수
    //     continue;
    //   }
    //   System.out.println(number);
    // }

    // // 4. 구구단 작성
    // for (int dan=2; dan<=9; dan++){ // 2단부터 9단까지 반복
    //   // 단수 표시
    //   System.out.println("\n"+dan+"단");

    //   //1부터 9까지 곱하기
    //   for (int i=1; i<=9; i++){
    //     System.out.println(dan+" x "+i+" = "+(dan*i));
    //   }
    // }


      // 문제 : 1부터 100까지 반복을 사용해서 합을 구하기
      // 1+2+3+4+5+...100 = 5050
      int sum = 0;
      for (int i = 1; i<=100; i++){
        sum+=i; //sum = sum+i
      }
      System.out.println("1부터 100까지의 합 : "+sum);
  }
}
