package com.kostegan.examples.internet.request;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args)throws Exception {
//        String page = Welcome.executeRequest("https://3ddd.ru/", "");
//        System.out.println(page);
        System.out.println(Connection.sendGet("https://news.google.com/news/?hl=ru&ei=fbliWe3bNcapsgHew5VA&ved=0EKkuCAkoBQ&ned=ru_ru"));
    }

    public static String executeRequest(String targetUrl, String urlParameters) {
        HttpURLConnection connection = null;
        try {
            //Create connection
            URL url = new URL(targetUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");
            connection.setUseCaches(false);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.close();

            //Get response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\n');
            }
            rd.close();
            return response.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            if (connection != null)
                connection.disconnect();
        }
    }
}

class Connection{
    private static final String USER_AGENT = "Mozilla/5.0";

    //HTTP get request
    public static String sendGet(String targetUrl) throws Exception {
        URL url = new URL(targetUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = connection.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = in.readLine()) != null) {
            sb.append(line);
            sb.append('\n');
        }
        in.close();
        return sb.toString();
    }
}
