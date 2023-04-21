package week_4.AdditionalComparatorExample; // Change the package name accordingly!

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Student s1 = new Student(20, 4.0);
        Student s2 = new Student(22, 2.0);
        Student s3 = new Student(21, 3.0);
        Pet p1 = new Pet(12, "Cat");
        Pet p2 = new Pet(7, "Dog");

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(p1);
        arr.add(p2);

        System.out.println("Unsorted: " + arr);

        // Sorted by age?
        Collections.sort(arr, new ageComparator());
        System.out.println("Sorted by age: " + arr);


        // Sorted by GPA
//        Collections.sort(arr, new gpaComparator());
//        System.out.println("Sorted by GPA: " + arr);

    }
}

class gpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() > s2.getGpa()) return 1;
        else if (s1.getGpa() < s2.getGpa()) return -1;
        return 0;
    }
}

class ageComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Age a1 = (Age) o1;
        Age a2 = (Age) o2;

        if (a1.getAge() > a2.getAge()) return 1;
        else if (a1.getAge() < a2.getAge()) return -1;
        return 0;
    }
}

interface Age{
    int getAge();
}

class Pet implements Age{
    private int age;
    private String species;

    public Pet(int age, String species) {
        this.age = age;
        this.species = species;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Pet age " + age + " species " + species;
    }
}

class Student implements Age{
    private int age;
    private double gpa;

    public Student(int age, double gpa) {
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student age " + age + " GPA " + gpa;

    }
}