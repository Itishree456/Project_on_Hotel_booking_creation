package testClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import commonFunctions.API_Common_Functions;
import commonFunctions.Utility_Common_Function;
import io.restassured.path.json.JsonPath;
import requestRepository.Post_req_repository2;

public class Post_TC_4 {
	
	@Test
	public static void execute() throws IOException 
	{

		for (int i = 0; i < 5; i++) 
		{
			String baseURI = Post_req_repository2.Base_URI();
			String resource = Post_req_repository2.Post_Resource() ;
			String requestbody = Post_req_repository2.Post_TC4();
			int statusCode = API_Common_Functions.Response_statusCode(baseURI, requestbody, resource);
			System.out.println(statusCode);
			if(statusCode == 200) 
			{	
				String responseBody = API_Common_Functions.Response_body(baseURI, requestbody, resource);
				System.out.println(responseBody);
				Post_TC_4.validator(responseBody, statusCode);
				Utility_Common_Function.Evidence_File_Creator("Post_TC_4", Post_req_repository2.Post_Resource(), responseBody);
				break;
			} 
			else 
			{
				System.out.println("Correct StatusCode is not found. Hence retrying the API ");
			}

		}
	}

	public static void validator(String responseBody, int statusCode) throws IOException {

		// Step 4: Parse the response body
		
		JsonPath jsp = new JsonPath(responseBody);
		int res_bookingid = jsp.getInt("bookingid");
		Object res_firstname = jsp.getString("booking.firstname");
		Object res_lastname = jsp.getString("booking.lastname");
		Object res_totalprice = jsp.getString("booking.totalprice");
		Object res_depositpaid = jsp.getString("booking.depositpaid");
		Object res_checkin = jsp.getString("booking.bookingdates.checkin");
		Object res_checkout = jsp.getString("booking.bookingdates.checkout");
		Object res_additionalneeds = jsp.getString("booking.additionalneeds");
		
		// Step 5: Parse request body and it's parameters
		
		JsonPath jspreq = new JsonPath(Post_req_repository2.Post_TC4());
		String req_firstname = jspreq.getString("firstname");
		String req_lastname = jspreq.getString("lastname");
		String req_totalprice = jspreq.getString("totalprice");
		String req_depositpaid = jspreq.getString("depositpaid");
		String req_checkin = jspreq.getString("bookingdates.checkin");
		String req_checkout = jspreq.getString("bookingdates.checkout");
		String req_additionalneeds = jspreq.getString("additionalneeds");
		
		// Step 6: Validate the response body parameters
		AssertJUnit.assertEquals(statusCode, 200);
		AssertJUnit.assertEquals(res_firstname, req_firstname);
		AssertJUnit.assertEquals(res_lastname, req_lastname);
		AssertJUnit.assertEquals(res_totalprice, req_totalprice);
		AssertJUnit.assertEquals(res_depositpaid, req_depositpaid);
		AssertJUnit.assertEquals(res_checkin, req_checkin);
		AssertJUnit.assertEquals(res_checkout, req_checkout);
		AssertJUnit.assertEquals(res_additionalneeds, req_additionalneeds);
		
		// Validate "id" and "createdAt" using Assert
		Assert.assertNotNull(res_bookingid);
		
	}

}
