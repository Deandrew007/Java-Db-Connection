package httprequest;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainStart {
    private static HttpURLConnection connection;

    public static void main(String[] args){
        //Method 1 : Java.net.HttpURLConnection
        BufferedReader reader;
        String line;
        StringBuffer responseContent =  new StringBuffer();



        try {
            URL url = new URL("https://api.edamam.com/api/nutrition-data?app_id=ecaaac31&app_key=2ac7954552432529c3c90cbf478e2826&ingr=1%20large%20apple");
            //URL url = new URL("http://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

            //Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            System.out.println(status);

            if (status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                while((line = reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();
            } else {

                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();
            }

            System.out.println(responseContent.toString());


            parse(responseContent.toString());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            connection.disconnect();
        }


   }


   public static String parse(String responseBody){
        Gson gson;
        ENERCKCAL__ calorie; //= new ENERCKCAL();
        PROCNTKCAL protein;// = new PROCNTKCAL();
        FATKCAL fat;// = new FATKCAL();
        CHOCDFKCAL carbs;// = new CHOCDFKCAL();
       gson = new Gson();
       Result result = gson.fromJson(responseBody,Result.class);
       TotalNutrientsKCal totalnutrients = result.getTotalNutrientsKCal();
       calorie = totalnutrients.getENERCKCAL();
       protein = totalnutrients.getPROCNTKCAL();
       fat = totalnutrients.getFATKCAL();
       carbs = totalnutrients.getCHOCDFKCAL();

       System.out.println("Ingredients: 1 large Apple \n" + "Total Calories: " + calorie.getQuantity() + "\nProtein: " + protein.getQuantity() + "\nFat: " + fat.getQuantity() + "\nCarbs: " + carbs.getQuantity() );

       return null;
   }


    /*
    public static String parse(String responseBody){
        JSONArray albums = new JSONArray(responseBody);
        for (int i = 0; i < albums.length(); i ++){
            JSONObject album = albums.getJSONObject(i);
            int id = album.getInt("id");
            int userId = album.getInt("userId");
            String title = album.getString("title");

            System.out.println(id + " " + title + " " + userId);

        }


        return null;
    }*/
}
