package Ayudas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ayudas {
    public static Scanner sc = new Scanner(System.in);

    public static Double round(Double num, int dec){
        return Double.parseDouble(String.valueOf(new BigDecimal(num).setScale(dec, RoundingMode.HALF_EVEN)));
    }
}
