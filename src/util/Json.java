package util;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import entity.ErrorJson;
import entity.Login;
import entity.OkJson;
import entity.Record;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;

public class Json {
	public static String jsonString;

	public static ArrayList<Record> getAllRecords() throws IOException {
		ArrayList<Record> records = new ArrayList<Record>();
		String url = "http://gcsj.hxlxz.com/API.aspx?api=lookup"
				+"&starttime=2017-06-20+00%3A00%3A00&endtime=" + URLEncoder.encode(getStrTime(), "UTF-8");
		jsonString = getUrlContent(url);
		OkJson okJson = getOkJson();
		records.addAll(okJson.getData());
		/**url = "http://gcsj.hxlxz.com/API.aspx?api=lookup"
				+"&starttime=2017-06-20+00%3A00%3A00&endtime=" + URLEncoder.encode(getStrTime(), "UTF-8");
		jsonString = getUrlContent(url);
		okJson = getOkJson();
		records.addAll(okJson.getData());
		url = "http://gcsj.hxlxz.com/API.aspx?api=lookup"
				+"&starttime=2017-06-20+00%3A00%3A00&endtime=" + URLEncoder.encode(getStrTime(), "UTF-8");
		jsonString = getUrlContent(url);
		okJson = getOkJson();
		records.addAll(okJson.getData());
		**/
		return records;
	}
	
	public static void delete(String id) throws IOException {
		String url = "http://gcsj.hxlxz.com/API.aspx?API=delete&id=" + id;
		jsonString = getUrlContent(url);
		System.out.println(jsonString);
	}

	public static Boolean login(String username, String password) throws IOException {
		String url = "http://gcsj.hxlxz.com/API.aspx?API=login&username=" + URLEncoder.encode(username, "UTF-8")
				+ "&password=" + URLEncoder.encode(password, "UTF-8");
		String jsonString = getUrlContent(url);
		ObjectMapper objectMapper = new ObjectMapper();
		Login login = objectMapper.readValue(jsonString, Login.class);
		return login.getLogin().equals("true");
	}

	/**public static ArrayList<Record> getRecord(String name, String starttime, String endtime)
			throws IOException {
		String url;
		if (starttime.equals("") || endtime.equals("")) {
			url = "http://gcsj.hxlxz.com/API.aspx?api=lookup&name=" + name
					+ "&starttime=2017-06-20+00%3A00%3A00&endtime=" + URLEncoder.encode(getStrTime(), "UTF-8");
		} else {
			url = "http://gcsj.hxlxz.com/API.aspx?api=lookup&name=" + name
					+"&starttime=2017-06-20+00%3A00%3A00"+ URLEncoder.encode(starttime, "UTF-8") + "&endtime="+URLEncoder.encode(endtime, "UTF-8");
		}
		jsonString = getUrlContent(url);
		OkJson okJson = getOkJson();
		return okJson.getData();
	}**/

	public static ErrorJson getErrorJson() throws UnsupportedEncodingException {
		ErrorJson errorJson = new ErrorJson();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			errorJson = objectMapper.readValue(jsonString, ErrorJson.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return errorJson;
	}

	public static OkJson getOkJson() throws UnsupportedEncodingException {
		OkJson okJson = new OkJson();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			okJson = objectMapper.readValue(jsonString, OkJson.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return okJson;
	}

	public static String getStrTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	public static String getUrlContent(String url) throws IOException {
		String curLine = "";
		String content = "";
		URL server = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) server.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));

		while ((curLine = reader.readLine()) != null) {
			content = content + curLine + "\r\n";
		}

		is.close();
		return content;
	}
}
