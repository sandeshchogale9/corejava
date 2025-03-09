package incubation.oops;

final class ImmutableEmployee {
    private final String name;
    private final int id;

    ImmutableEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        ImmutableEmployee immutableEmployee = new ImmutableEmployee("abc",1);
        System.out.println(immutableEmployee.getId() +" "+immutableEmployee.getName());

        ImmutableEmployee immutableEmployee2 = new ImmutableEmployee("abcd",2);
        System.out.println(immutableEmployee2.getId() +" "+immutableEmployee2.getName());

    }
}

