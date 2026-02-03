package fploy;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        // KHỚP EXCEL: chỉ throw khi age < 0
        // => age = 0 sẽ KHÔNG bị throw (để TC_PERSON_04 FAIL đúng như báo cáo)
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
