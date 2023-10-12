public class ExtraPractice {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int theSum = arrSum(numbers);
        System.out.println("Sum is: " + theSum);
    }

    // another methods...
    // what are the inputs? parameter...
    // array of ints
    // what's the output? return type/data
    // int (sum)

    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

}
