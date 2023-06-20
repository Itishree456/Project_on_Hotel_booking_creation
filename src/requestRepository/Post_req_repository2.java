package requestRepository;

import java.io.IOException;
import java.util.ArrayList;

import commonFunctions.Utility_Common_Function;

public class Post_req_repository2 {
	
	public static String Base_URI() {

		String BaseURI = "https://restful-booker.herokuapp.com";

		return BaseURI;

	}

	public static String Post_Resource() {

		String Resource = "booking";

		return Resource;

	}
	
	public static String Post_TC1() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_1");
		Object req_firstname = data.get(1);
		Object req_lastname = data.get(2);
		Object req_totalprice = data.get(3);
		Object req_depositpaid = data.get(4);
		Object req_checkin = data.get(5);
		Object req_checkout = data.get(6);
		Object req_additionalneeds = data.get(7);
		String RequestBody = "{\r\n"
				+ "    \"firstname\" : \""+req_firstname+"\",\r\n"
				+ "    \"lastname\" : \""+req_lastname+"\",\r\n"
				+ "    \"totalprice\" : \""+req_totalprice+"\",\r\n"
				+ "    \"depositpaid\" : \""+req_depositpaid+"\",\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \""+req_checkin+"\",\r\n"
				+ "        \"checkout\" : \""+req_checkout+"\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \""+req_additionalneeds+"\"\r\n"
				+ "}";
		
		return RequestBody;

	}

   
	public static String Post_TC2() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_2");
		Object req_firstname = data.get(1);
		Object req_lastname = data.get(2);
		Object req_totalprice = data.get(3);
		Object req_depositpaid = data.get(4);
		Object req_checkin = data.get(5);
		Object req_checkout = data.get(6);
		Object req_additionalneeds = data.get(7);
		String RequestBody = "{\r\n"
				+ "    \"firstname\" : \""+req_firstname+"\",\r\n"
				+ "    \"lastname\" : \""+req_lastname+"\",\r\n"
				+ "    \"totalprice\" : \""+req_totalprice+"\",\r\n"
				+ "    \"depositpaid\" : \""+req_depositpaid+"\",\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \""+req_checkin+"\",\r\n"
				+ "        \"checkout\" : \""+req_checkout+"\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \""+req_additionalneeds+"\"\r\n"
				+ "}";
		
		return RequestBody;


	}

	public static String Post_TC3() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_3");
		Object req_firstname = data.get(1);
		Object req_lastname = data.get(2);
		Object req_totalprice = data.get(3);
		Object req_depositpaid = data.get(4);
		Object req_checkin = data.get(5);
		Object req_checkout = data.get(6);
		Object req_additionalneeds = data.get(7);
		String RequestBody = "{\r\n"
				+ "    \"firstname\" : \""+req_firstname+"\",\r\n"
				+ "    \"lastname\" : \""+req_lastname+"\",\r\n"
				+ "    \"totalprice\" : \""+req_totalprice+"\",\r\n"
				+ "    \"depositpaid\" : \""+req_depositpaid+"\",\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \""+req_checkin+"\",\r\n"
				+ "        \"checkout\" : \""+req_checkout+"\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \""+req_additionalneeds+"\"\r\n"
				+ "}";
		
		return RequestBody;

	}
	
	public static String Post_TC4() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_4");
		Object req_firstname = data.get(1);
		Object req_lastname = data.get(2);
		Object req_totalprice = data.get(3);
		Object req_depositpaid = data.get(4);
		Object req_checkin = data.get(5);
		Object req_checkout = data.get(6);
		Object req_additionalneeds = data.get(7);
		String RequestBody = "{\r\n"
				+ "    \"firstname\" : \""+req_firstname+"\",\r\n"
				+ "    \"lastname\" : \""+req_lastname+"\",\r\n"
				+ "    \"totalprice\" : \""+req_totalprice+"\",\r\n"
				+ "    \"depositpaid\" : \""+req_depositpaid+"\",\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \""+req_checkin+"\",\r\n"
				+ "        \"checkout\" : \""+req_checkout+"\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \""+req_additionalneeds+"\"\r\n"
				+ "}";
		
		return RequestBody;

	}

	public static String Post_TC5() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_5");
		Object req_firstname = data.get(1);
		Object req_lastname = data.get(2);
		Object req_totalprice = data.get(3);
		Object req_depositpaid = data.get(4);
		Object req_checkin = data.get(5);
		Object req_checkout = data.get(6);
		Object req_additionalneeds = data.get(7);
		String RequestBody = "{\r\n"
				+ "    \"firstname\" : \""+req_firstname+"\",\r\n"
				+ "    \"lastname\" : \""+req_lastname+"\",\r\n"
				+ "    \"totalprice\" : \""+req_totalprice+"\",\r\n"
				+ "    \"depositpaid\" : \""+req_depositpaid+"\",\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \""+req_checkin+"\",\r\n"
				+ "        \"checkout\" : \""+req_checkout+"\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \""+req_additionalneeds+"\"\r\n"
				+ "}";
		
		return RequestBody;


	}

	public static String Post_TC6() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_6");
		Object req_firstname = data.get(1);
		Object req_lastname = data.get(2);
		Object req_totalprice = data.get(3);
		Object req_depositpaid = data.get(4);
		Object req_checkin = data.get(5);
		Object req_checkout = data.get(6);
		Object req_additionalneeds = data.get(7);
		String RequestBody = "{\r\n"
				+ "    \"firstname\" : \""+req_firstname+"\",\r\n"
				+ "    \"lastname\" : \""+req_lastname+"\",\r\n"
				+ "    \"totalprice\" : \""+req_totalprice+"\",\r\n"
				+ "    \"depositpaid\" : \""+req_depositpaid+"\",\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \""+req_checkin+"\",\r\n"
				+ "        \"checkout\" : \""+req_checkout+"\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \""+req_additionalneeds+"\"\r\n"
				+ "}";
		
		return RequestBody;


	}

}
