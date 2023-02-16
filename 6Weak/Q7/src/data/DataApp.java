package data;
import java.io.*;
import java.net.*;
import data.util.Output;
import com.google.gson.Gson;

public class DataApp {

    public static void RetrieveData(){
        try{
            URL url = new URL ("https://data.gov.sg/api/action/datastore_search?resource_id=b698c206-a63c-489f-8c50-b439c349c025&limit=3");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            
            try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }

                    Gson gson = new Gson();
                    Output output = gson.fromJson(response.toString(), Output.class);

                    System.out.println("Connecting to data.gov.sg...... ");
                    System.out.println("Retrieve Success Status : " + output.getSuccess());                    
            } 
        } catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        } catch (ProtocolException ex){
            System.out.println("Invalid Protocol");
        } catch (Exception e){
            System.out.println("Exception" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        RetrieveData();
    }
}
