package studio8;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps
{
	public static void main(String args[]) throws IOException {
		File file=new File("/Users/konturn/git/studio-8-kontur_s8/data/Data.csv");
		Scanner inputStream = new Scanner(file);
		String[][] parts = new String[3][];
		int count=0;
		int zeroC=0;
	    while(inputStream.hasNext()){
            //read single line, put in string
            String data = inputStream.next();
            parts[0]=data.split(",");
            if(inputStream.hasNext()) {
            	data = inputStream.next();
            	parts[1]=data.split(",");
            }
            else break;
//            if(inputStream.hasNext()) {
//            	data = inputStream.next();
//            	parts[2]=data.split(",");
//            }
//            else break;
//            
//            if(Double.parseDouble(parts[1][0])>Double.parseDouble(parts[2][0])&&Double.parseDouble(parts[1][0])>Double.parseDouble(parts[0][0])) {
//            	count++;
//            	   System.out.println(parts[0][0]);
//            	   System.out.println(parts[1][0]);
//            	   System.out.println(parts[2][0]);
//            	   System.out.println();
//            }
            if(Double.parseDouble(parts[0][0])>=0&&Double.parseDouble(parts[1][0])<=0||Double.parseDouble(parts[0][0])<=0&&Double.parseDouble(parts[1][0])>=0) {
            	zeroC++;
            }
         
        }
	    System.out.println(zeroC);
	}
}