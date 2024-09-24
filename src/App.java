import java.math.BigDecimal;
import java.math.BigInteger;

public class App {

    public static void main(String[] args) {

        BigInteger number1 = new BigInteger("36554651465432168765196874654168765132165765321654654654321324");
        BigInteger number2 = new BigInteger("654635419668765496876543541657654765416876476354168765465796546546876546576547654657657432135468798765465");
        BigInteger gcd = number1.gcd(number2);

        System.out.println("GCD of number1 and number2: " + gcd);
        BigDecimal decimal1 = new BigDecimal("1123412341.123412341433456234523645345256");
        BigDecimal decimal2 = new BigDecimal("987654321.987654321987654321987654321");


        BigDecimal square1 = decimal1.multiply(decimal1);
        BigDecimal square2 = decimal2.multiply(decimal2);
        System.out.println("Square of decimal1: " + square1);
        System.out.println("Square of decimal2: " + square2);

    }

}

