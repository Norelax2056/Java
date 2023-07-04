package EX_3;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * JsonSipleParser
 */
public class JsonSipleParser {
    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_NAME = "name"; 
    private static final String TAG_ESTIMATION = "estimation";
    private static final String TAG_LESSON = "lesson";

    public Root parse() {
        
        Root root = new Root();
        JSONParser parser = new JSONParser();
        try(FileReader fr = new FileReader(("jsonformatter.json"))) {
            
           JSONObject rootJsonObject =(JSONObject) parser.parse(fr);
           String name = (String)rootJsonObject.get(TAG_NAME_MAIN);
           JSONArray peopleJsonArray =(JSONArray)rootJsonObject.get(TAG_PEOPLE);
           List<People> peopleList = new ArrayList<>();
           for(Object it: peopleJsonArray){
                JSONObject peopJsonObject = (JSONObject) it;
                String namePeople = (String)peopJsonObject.get(TAG_NAME);
                long estimation = (long)peopJsonObject.get(TAG_ESTIMATION);
                String lesson = (String)peopJsonObject.get(TAG_LESSON);
                People people = new People(namePeople, (int) estimation, lesson);
                peopleList.add(people);

           }
            root.setPeople(peopleList);
            root.setName(name);
            return root;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());;
        }
        
        return null;
    }

}