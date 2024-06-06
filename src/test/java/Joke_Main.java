import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpURLConnection;
import java.net.URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Joke_Main {
    public static void main(String[] args) {
        // Define the URL to request
        String urlString = "https://official-joke-api.appspot.com/random_joke"; // Example API for random jokes

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (GET)
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { // 200 indicates success
                // Create a BufferedReader to read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Read the response line by line
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Close the BufferedReader
                in.close();

                // Print the response (for debugging purposes)
                //System.out.println("Response: " + response.toString());

                // Create ObjectMapper instance
                ObjectMapper objectMapper = new ObjectMapper();

                // Convert JSON response to Joke object
                Joke joke = objectMapper.readValue(response.toString(), Joke.class);

                // Print the Joke object
                System.out.println(joke.getPunchline());
                System.out.println(joke.getSetup());
                // type of Joke which used for
                // System.out.println(joke.getType());

                // ID Joke which used for
                // System.out.println(joke.getId());


            } else {
                System.out.println("GET request not worked");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("API request completed");
        }
    }
}
