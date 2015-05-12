package volume0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Digit_Number {

	public static void main(String[] args) throws IOException {
		  BufferedReader  in   = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter    out = new BufferedWriter(new OutputStreamWriter(System.out));
          
          char[] buf = new char[1024];
          String s[] = String.valueOf(buf, 0, in.read(buf)).split("\\n");
          
          
          for(String a : s){
        	  String b[] = a.split("\\s");
        	 int c =   Integer.parseInt(b[0]) + Integer.parseInt(b[1]);
        	  out.write(String.valueOf(c).length() + "\n");	  
        	  
          }
          in.close();
          out.close();
	}
}
