import com.fasterxml.jackson.databind.ObjectMapper;

public class Joke_Main {
    public static void main(String[] args) {
        String jsonString = "{\"type\":\"general\",\"setup\":\"Did you hear about the guy whose whole left side was cut off?\",\"punchline\":\"He's all right now.\",\"id\":90}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Joke joke = objectMapper.readValue(jsonString, Joke.class);
            System.out.println(joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
