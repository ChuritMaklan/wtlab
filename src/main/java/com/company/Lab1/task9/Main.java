package main.java.com.company.Lab1.task9;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.addBall(new Ball(5, true));
        bucket.addBall(new Ball(3, false));
        System.out.println(bucket.countBlueBalls());
        System.out.println(bucket.countWeight());
    }
}
