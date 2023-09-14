public class ArrayDemos {
    public static void main(String[] args) {
        /*
            Print out to the screen
            (OK to hardcode, but use loop if you can)
            Exercise 0: all letters
            Exercise 1: a b c
            Exercise 2: d e f
            Exercise 3: a d g
            Exercise 4: c f i
            Exercise 5: a e i
         */
        char[][] arr = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        char[] firstRow = arr[0]; // {a,b,c}
        System.out.println(arr[1][2]); // 2nd row, 3rd col, or 'f'

        //exercise 0
        System.out.println("Row 1 (index 0)");
        System.out.print(arr[0][0]);
        System.out.print(arr[0][1]);
        System.out.print(arr[0][2]);
        System.out.println("\nRow 2");
        System.out.print(arr[1][0]);
        System.out.print(arr[1][1]);
        System.out.print(arr[1][2]);
        System.out.println("\nRow 3");
        System.out.print(arr[2][0]);
        System.out.print(arr[2][1]);
        System.out.print(arr[2][2]);

        System.out.println("Crazy bad loop:");

        int row = 0, col = 0;
        for (int i = 0; i < arr.length*arr[0].length; i++) {
            // arr.length is the size of the first dimension
            // in this case 3... number of rows
            System.out.println(arr[row][col]);
            //row++;
            col++;
//            if (row==3) {
//                row = 0;
//            }
            if (col == 3) {
                col = 0;
                row++;
            }
        }

        System.out.println("MUCH BETTER WAY OF DISPLAYING STUFF!!!!!");
        for (int i = 0;i < arr.length; i++) {
            // this one repeats 3 times... size of first dimension
            System.out.println("I am in row: " + i);
            for (int j = 0; j< arr[i].length; j++) {
                // how many columns are there in that row?
                // repeat that many times
                System.out.println("column: " + j);
                System.out.println("The value here is: " + arr[i][j]);
            }
        }







    }

}

