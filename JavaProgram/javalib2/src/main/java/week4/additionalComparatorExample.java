package week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class additionalComparatorExample {
    public static void main(String[] args) {
        Student s1 = new Student(20, 4.0);
        Student s2 = new Student(22, 3.0);
        Student s3 = new Student(21, 5.0);
        Pet p1 = new Pet(4);
        Pet p2=new Pet(5);
        ArrayList<Object> arr = new ArrayList();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(p1);
        arr.add(p2);
        Collections.sort(arr,new ageComparator());
        System.out.println("sorted students by age"+arr);
    }
}
class ageComparator implements Comparator<Object>{
    @Override
    public int compare(Object s1,Object s2){
        if(((organism) s1).getAge()> ((organism) s2).getAge())
            return 1;
        else if(((organism) s1).getAge()< ((organism) s2).getAge())
            return -1;
        else
            return 0;
    }
}
interface organism{
    public int getAge();
}
class Pet implements organism{
    private int age;
    Pet(int age){
        this.age=age;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override

    public String toString(){
        return Integer.toString(age)+" "+"6.0";
    }
}
class Student implements organism{
    private int age;
    private double gpa;

    public Student(int age, double gpa){
        this.age=age;
        this.gpa=gpa;
    }
    public double getGpa() {
        return gpa;
    }
    @Override

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return Integer.toString(this.age)+" "+Double.toString(this.gpa);
    }
}
