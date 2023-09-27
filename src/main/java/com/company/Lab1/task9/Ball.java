package main.java.com.company.Lab1.task9;

public class Ball {
     private int weight;
    private boolean isBlue;
    public Ball(int weight, boolean isBlue){
        this.weight = weight;
        this.isBlue = isBlue;
    }
    public boolean isBlue() {
        return isBlue;
    }
    public int getWeight() {
        return weight;
    }
    public void setBlue(boolean blue) {
        isBlue = blue;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}

