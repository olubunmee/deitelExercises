package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {

    @Test
    public void addTest(){
        Kata calculator = new Kata();
        int actual = calculator.add(4, 3);
        assertEquals(7, actual);
    }

    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int actual = calculator.subtract(7, 2);
        assertEquals(5, actual);
    }

    @Test
    public void absoluteSubtraction(){
        Kata calculator = new Kata();
        int actual = calculator.subtract(2, 7);
        assertEquals(5, actual);
    }

    @Test
    public void calculateAreaTest(){
        Kata circle = new Kata();
        double result = circle.findAreaWith(7);
        assertEquals(154.0, result);
    }
    @Test
    public void bitFlipper(){
        Kata flipper = new Kata();
        int result = flipper.flip(0);
        assertEquals(1, result);
        result = flipper.flip(1);
        assertEquals(0, result);
    }

    @Test
    public void palindrome(){
        Kata palindrome = new Kata();
        boolean result = palindrome.ispalindrome(12981);
        assertTrue(result);
    }

    @Test
    public void squareTest(){
        Kata kata = new Kata();
        int result = kata.square(5);
        assertEquals(25, result);
    }

    @Test
    public void copy(){
        Kata one = new Kata();
        int totalPrice = one.copy(550);
        assertEquals(550000, totalPrice);
    }

    @Test
    public void quotient(){
        Kata divide = new Kata();
        int result = divide.quotient(50,10);
        assertEquals(5, result);
    }

    @Test
    public void evenCounter(){
        int number = 2;
        while(number <= 100){
        System.out.print(number + " ");
        number = number + 2;}
    }
}
