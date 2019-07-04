
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonRead {

    public static void main(String[] args) throws Exception {


        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader("C:\\\\Users\\\\shank\\\\git\\\\CamelApplication\\\\input_box\\\\empty"));

            JSONObject jsonObject = (JSONObject)object;
            String name = (String) jsonObject.get("Name");

            System.out.println("Name: " + name);


        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

