package Regex.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PosatalCode {
    Scanner scan = new Scanner(System.in);
    public void checkPostalCode(){
        System.out.println("Enter Postal Code:" );
        String Postalcode =scan.nextLine();
        Pattern pattern=Pattern.compile("^[a-zA-Z]{1}+[0-9]{6}$");
        Matcher matcher= pattern.matcher(Postalcode);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Postal code is Vailid");
        }else{
            System.out.println("Postal Code is Invailid. Enter Again");
            checkPostalCode();
        }

    }
}
