// import java.io.IOException;
// import java.io.Reader;
// import java.text.ParseException;
// import java.io.FileReader;

// import org.json.simple.JSONArray;
// import org.json.simple.JSONObject;
// import org.json.simple.parser.JSONParser;

// public class JSONExample {
//     public static void main(String[] args) throws org.json.simple.parser.ParseException {
//     JSONParser parser = new JSONParser();
//     try {
//     Reader reader = new FileReader("beispiel.json");
//     JSONObject root = (JSONObject) parser.parse(reader);
//     JSONObject inhaber = (JSONObject) root.get("Inhaber");
//     JSONArray hobbys = (JSONArray) inhaber.get("Hobbys");
//     for (Object h : hobbys) {
//     System.out.println(h);
//     }
//     } catch (IOException ex) {
//     ex.printStackTrace();
//     } catch (NullPointerException e){
//         e.printStackTrace();
//     }
//     }
//     }


