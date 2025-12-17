package array_problems;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Tico"}; //1-usul
      //  System.out.println(Arrays.toString(cars));
        cars[1] = "Mercedes Benz";
        int sum = 1;
        int[] numbers = new int[8];
        numbers[0] = 1;  // 2-usul
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;

//        for (int i = 0; i < numbers.length; i++) {
//           sum = i*i;
//           System.out.println(sum);
//        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("ID " + i + "   Model " + cars[i]);
        }
    //    System.out.println(numbers[0] + numbers[1] + numbers[2]);  //6
    //    System.out.println(Arrays.toString(cars));
    }
}
