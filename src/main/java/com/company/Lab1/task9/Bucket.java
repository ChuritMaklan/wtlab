package main.java.com.company.Lab1.task9;

import java.util.ArrayList;

public class Bucket {
    private ArrayList<Ball> balls;
    public Bucket(){
        balls = new ArrayList<>();
    }
    public Bucket(ArrayList<Ball> balls){
        this.balls = balls;
    }
    public void addBall(Ball ball){
        if(ball != null) {
            balls.add(ball);
        }
    }
    public int countWeight(){
        int totalWeight = 0;
        for(Ball ball : balls){
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }
    public int countBlueBalls(){
        int amount = 0;
        for(Ball ball : balls){
            if(ball.isBlue()){
                amount++;
            }
        }
        return amount;
    }
}
