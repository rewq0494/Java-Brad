package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad71抓網路圖片 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.iii.org.tw/assets/images/information-news/image005.jpg");
			HttpURLConnection conn = 
					(HttpURLConnection) url.openConnection();
			conn.connect();

			BufferedInputStream bin =
					new BufferedInputStream(conn.getInputStream());
			FileOutputStream fout = new FileOutputStream("dir2/iii.jpg");
			
			byte[]buf = new byte[4*1024];int len;
			while((len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			bin.close();

			System.out.println("OK");
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
			System.out.println("名字："+name+"地區 : "+city);
			
		}
	}

}
