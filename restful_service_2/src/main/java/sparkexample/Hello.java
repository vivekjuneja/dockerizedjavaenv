package sparkexample;

import static spark.Spark.get;
import static spark.SparkBase.setPort;

import com.mashape.unirest.http.Unirest;

public class Hello {
	
	static String responseFromServiceDependency = null;

    public static void main(String[] args) {
	setPort(4569);
	
	

        get("/", (req, res) -> {
        		
        		//Call the Service 1 
        	try {
        			System.out.println("Hello from Service 2");
        			
        			String url = "http://web:4567/";
        			System.out.println("Making calls to : "+url);
        			responseFromServiceDependency = Unirest.get(url).asString().getBody();
				System.out.println("Output = " + responseFromServiceDependency);
				  
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
            return ("Hello from ##### 2 ##### Service, Response from Service 1 is : " + responseFromServiceDependency);
        });
        

    }
}
