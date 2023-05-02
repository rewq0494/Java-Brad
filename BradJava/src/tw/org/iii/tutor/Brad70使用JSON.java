package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad70使用JSON {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();

			System.out.println("OK");

			parseJSON(sb.toString());

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// parse JSON
	static void parseJSON(String json) {
		JSONArray root = new JSONArray(json);
		//System.out.println(root.length());//找出有幾筆元素資料
		for (int i=0; i<root.length();i++) {
			JSONObject row = root.getJSONObject(i);
			String name = row.getString("Name");
			String city = row.getString("City");
			String town = row.getString("Town");
			System.out.println("名字: "+name+" 地區: "+city+town);
			
		}
	}

}
