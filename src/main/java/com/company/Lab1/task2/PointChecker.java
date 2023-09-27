package main.java.com.company.Lab1.task2;

public class PointChecker {
    public boolean isPointInArea(int x, int y){
        final int positiveX = 4;
        final int positiveY = 5;
        final int negativeX = 6;
        final int negativeY = -3;
        return (Math.abs(x) <= positiveX && y <= positiveY && y >= 0) ||
                (Math.abs(x) <= negativeX && y >= negativeY && y <= 0);
    }
}
