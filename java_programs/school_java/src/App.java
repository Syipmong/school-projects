
import java.util.Arrays;;
public class App {
    public static void main(String[] args) throws Exception {

        //Question1

        String[] arr = {"apple", "banana", "cherry", "durian", "grape"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 10) {
                count++;
            }
        }
        System.out.println(count);

        //Question2

        double[][] array2 = new double[2][3];
        array2[0][0] = 30; 
        array2[0][1] = 10;
        array2[0][2] = 4;
        array2[1][0] = 5;
        array2[1][1] = 3;
        array2[1][2] = 8;

        int sum = 0;
        int counts = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum += array2[i][j];
                counts++;
           }
        }
        int avg = sum / counts;
System.out.println("The average of the values in the array is " + avg);
        
//Question3

int[][] array3 = new int[][] {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

  

    for (int i = 0; i < array3.length; i++) {
            int[] row = array3[i];
            int largest = row[0];
            int smallest = row[0];
            for (int j = 1; j < row.length; j++) {
                if (row[j] > largest) {
                    largest = row[j];
                }
                if (row[j] < smallest) {
                    smallest = row[j];
                }
            }
            System.out.println("The largest value in row " + i + " is " + largest);
            System.out.println("The smallest value in row " + i + " is " + smallest);
        }


        //Question4

        int[] numbers = {1, 2, 3, 4, 5};
int sum2 = 0;
for (int i = 0; i < numbers.length; i++) {
  sum2 += numbers[i];
}
System.out.println("The sum of the numbers is " + sum2);


//Question5

int[] myNumbers = {2,1,5,4,3,2,7,8,9,0};
int totalEven = 0;
for (int i = 0; i < myNumbers.length; i++) {
    if (myNumbers[i] % 2 == 0) {
        totalEven++;
        
    }
}
System.out.println("The total even numbers in the array are: " + totalEven);

    }
    
}



