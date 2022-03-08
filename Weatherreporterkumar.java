package javapratice;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Weatherreporterkumar {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Kumar Weather Reporting Console App");
        System.out.println("------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the City you want: ");
        String city = scanner.nextLine();
        System.out.println("Getting Weather report for " + city);
        String keyAPI = "Code api";

        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=code");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader responses = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String data;
        StringBuffer content = new StringBuffer();
        while ((data = responses.readLine()) != null) {
            content.append(data);
        }
        System.out.println(content);



        //closing connection with api
        responses.close();
        connection.disconnect();
    }
}

