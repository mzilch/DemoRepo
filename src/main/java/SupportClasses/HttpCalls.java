package SupportClasses;

	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;	
	import org.openqa.selenium.WebElement;


	public class HttpCalls {
	    


    public String CheckIf_HREF_IsValid(String PageUrl, WebElement In_WebElly) {
                
        String urlHREF = "";
        String returnResult = "";
        HttpURLConnection huc = null;
        int respCode = 200;
               
   
        urlHREF = In_WebElly.getAttribute("href");
            
            //System.out.println(urlHREF);        

            try {
                huc = (HttpURLConnection)(new URL(urlHREF).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(urlHREF+" is a broken link");
                    returnResult = "Response Code: " + respCode + " - OK - is a INVALID link";
                }
                else{
                    System.out.println(urlHREF+" is a valid link");
                    returnResult = "Response Code: " + respCode + " - OK - is a VALID link";
                }
            
                    
            } catch (MalformedURLException e) {
                
                e.printStackTrace();
                return "Error MalformedURLException: " + e.getMessage();
            } catch (IOException e) {
                
                e.printStackTrace();
                return "Error IOException: " + e.getMessage();
            }
            
            return returnResult;
        }   
    }
		
	

	

