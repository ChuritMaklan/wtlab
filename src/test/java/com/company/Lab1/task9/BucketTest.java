package test.java.com.company.Lab1.task9;
import main.java.com.company.Lab1.task9.Ball;
import main.java.com.company.Lab1.task9.Bucket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BucketTest {
    @Test
    void givenTwoBalls_whenCalculateBallsWeight_thanReturnWeight(){
        Ball firstBall = new Ball(10, true);
        Ball secondBall = new Ball( 15, false);
        Bucket bucket = new Bucket();
        bucket.addBall(firstBall);
        bucket.addBall(secondBall);

        int expected = firstBall.getWeight() + secondBall.getWeight();
        int actual = bucket.countWeight();

        assertEquals(expected, actual);
    }

    @Test
    void givenTwoBlueBalls_whenCalculateBlueBallsCount_thanReturnTwo(){
        Ball firstBlueBall = new Ball(10, true);
        Ball secondBlueBall = new Ball(15, false);
        Bucket bucket = new Bucket();
        bucket.addBall(firstBlueBall);
        bucket.addBall(secondBlueBall);
        int expected = 1;
        int actual = bucket.countBlueBalls();

        assertEquals(expected, actual);
    }

}
