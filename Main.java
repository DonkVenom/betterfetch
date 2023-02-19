import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {




    public static void main(String[] args) {
        System.out.println("Current betterfetch location:" ); //TODO OC
        try {
            new CLI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }








}

