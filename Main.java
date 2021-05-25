


public class Main {

    public static void main(String[] args) {

        //region Task1
        int first[][] = {
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}};

        int second[][] = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
                {11, 12, 13, 14, 15}};


        Triangle triangle = new Triangle();
        System.out.println("\nFirst Triangle:");
        System.out.println("Minimum: " + triangle.minSumPath(first));
        System.out.println("Max: " + triangle.maxPathSum(first, 4, 1));


        System.out.println("\nSecond Triangle:");
        System.out.println("Minimum: " + triangle.minSumPath(first));
        System.out.println("Max: " + triangle.maxPathSum(first, 4, 1));
        //endregion


        //region Task2

        Robots robots = new Robots();
        robots.Do();

        //endregion

    }


}
