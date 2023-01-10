package Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //Multidimensional array Declaration ...
        int numbers[][] = new int[2][3];
        //Initialization
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        //OR Initialize this way---> int numbers[][] = {{1,2,3},{4,5,6}};
        //-----------------------------------------------_____---_____
        //                                                Rows    Rows
        for(int i=0;i<1;i++){
            for(int j=0;j<2;j++){
                System.out.println("Array numbers at " + i +" row " + j + " column: "+numbers[i][j]);
            }
        }
    }
}
