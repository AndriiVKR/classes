package wagwalking;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.json.JsonOutput;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ApiTest {


    @Test
    public void testApi() throws IOException {

        try {

            URL url = new URL("http://api.zippopotam.us/us/98208");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/Json");
            if (connection.getResponseCode()!= 200) {
                throw new RuntimeException("ERROR response code: " + connection.getResponseCode());
            }
            System.out.println(connection.getResponseCode());

            Scanner scanner = new Scanner(url.openStream());
            String response = new String();
            while (scanner.hasNext()) {
                response = scanner.nextLine();
            }
            System.out.println(response);
            scanner.close();

            JSONObject obj = new JSONObject(response);

            String postCode = obj.get("post code").toString();
            System.out.println(postCode);
            Assert.assertEquals("98208", postCode);

            String country = obj.get("country").toString();
            System.out.println(country);
            Assert.assertEquals("United States", country);

            String countryAbr = obj.get("country abbreviation").toString();
            System.out.println(countryAbr);
            Assert.assertEquals("US", countryAbr);

            JSONArray array = obj.getJSONArray("places");

            String city = array.getJSONObject(0).getString("place name");
            System.out.println(city);
            Assert.assertEquals("Everett", city);

            String longitude = array.getJSONObject(0).getString("longitude");
            System.out.println(longitude);
            Assert.assertEquals("-122.1987", longitude);

            String state = array.getJSONObject(0).getString("state");
            System.out.println(state);
            Assert.assertEquals("Washington", state);

            String stateAbr = array.getJSONObject(0).getString("state abbreviation");
            System.out.println(stateAbr);
            Assert.assertEquals("WA", stateAbr);

            String latitude = array.getJSONObject(0).getString("latitude");
            System.out.println(latitude);
            Assert.assertEquals("47.8948", latitude);



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }








    }

}

// http://api.zippopotam.us/us/98208