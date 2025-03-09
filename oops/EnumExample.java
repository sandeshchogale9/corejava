package incubation.oops;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY;
}

enum Status {
    SUCCESS(200), ERROR(500);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today); // Output: MONDAY

        System.out.println(Status.SUCCESS.getCode()); // 200
    }
}

