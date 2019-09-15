package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZip {
	private static final String INPUT_GZIP_FILE = "C:/Users/Will/Downloads/twitter_rv.tar.gz";
    private static final String OUTPUT_FILE = "C:/Users/Will/Downloads/twitter_data.txt";
 
    public static void main( String[] args )
    {
    	GZip gZip = new GZip();
    	gZip.gunzipIt();
    }

    /**
     * GunZip it
     */
    public void gunzipIt(){
 
     byte[] buffer = new byte[1024];
 
     try{
 
    	 GZIPInputStream gzis = 
    		new GZIPInputStream(new FileInputStream(INPUT_GZIP_FILE));
 
    	 FileOutputStream out = 
            new FileOutputStream(OUTPUT_FILE);
 
        int len;
        while ((len = gzis.read(buffer)) > 0) {
        	out.write(buffer, 0, len);
        }
 
        gzis.close();
    	out.close();
 
    	System.out.println("Done");
    	
    }catch(IOException ex){
       ex.printStackTrace();   
    }
   } 
}

