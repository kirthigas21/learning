//package changerequest;
//
//
//
//import java.util.List;
//
//import org.testng.annotations.Test;
//
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//
//public class getincidents {
//
//	@Test
//	public void getallchangerequest()
//	{
//		RestAssured.baseURI = "https://dev63550.service-now.com/api/now/table/change_request";
//		RestAssured.authentication = RestAssured.basic("admin", "Akshaya@123");
//		Response response = RestAssured.get();
//		int statuscode = response.getStatusCode();
//		System.out.println(statuscode);
//		JsonPath responseJson = response.jsonPath();
//		List<String> allincno = responseJson.getList("result.number");
//		System.out.println(allincno.size());		
//		for (String eachincno : allincno )
//		{
//			System.out.println(eachincno);			
//		}
//		List<String> allsysid = responseJson.getList("result.sys_id");
//		System.out.println(allsysid.size());		
//		for (String sysid : allsysid )
//		{
//			System.out.println(sysid);			
//		}
//		
//	}
//
//}
