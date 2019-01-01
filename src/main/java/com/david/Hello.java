package com.david;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
        Person p = new Person("David",66.5f,1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        Character c2 = 'B';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;*/

        String name = "David";
    }
}
