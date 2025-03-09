package incubation.problemsolving;

public class PowerUsingRecursion {
    //O(log N) complexity
    private static int recPower(int num, int pow) {
        if (pow == 0)
            return 1;

        if (pow < 0)
            return 1 / recPower(num, -pow);

        int halfPower = recPower(num, pow / 2);
        return (pow % 2 == 0) ? halfPower * halfPower : num * halfPower * halfPower;
    }

    public static void main(String[] args) {
        System.out.println(recPower(2,3));
    }
}
