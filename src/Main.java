public class Main {
    public static void main(String[] args) {
        //  задача 1

        int[] weight_1 = new int[3];
        weight_1[0] = 33;
        weight_1[1] = 77;
        weight_1[2] = 99;

        double[] weight_2 = {1.57, 7.654, 9.986};

        char[] weight_3 = {37, 37, 34, 36, 36, 36};

        //    задача 2


        for (int i = 0; i < weight_1.length; i++) {

            System.out.print(weight_1[i] + ", ");
        }

        System.out.println(weight_1[weight_1.length - 1]);


        for (int i = 0; i < weight_2.length; i++) {
            System.out.print(weight_2[i] + ", ");
        }

        System.out.println(weight_2[weight_2.length - 1]);

        // задача 3


        int overBack = weight_3.length - 1;
        while (overBack > 0) {
            System.out.print(weight_3[overBack] + ", ");

            overBack--;
        }
        System.out.println(weight_3[weight_3.length - 1]);

        // задача 4


        for (int x = 0; weight_1.length > x; x++) {

            if (weight_1[x] % 2 != 0)

                weight_1[x]++;

            System.out.print(weight_1[x] + " ");
        }


    }
}



