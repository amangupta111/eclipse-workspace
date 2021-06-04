package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read 
{
	public void ReadDataofRange(int InitalRowNo, int FinalRowNo) throws IOException
	{
		
		File f=new File("../TxrRead/agile process1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		
		
		
		for(int i=1;i<=FinalRowNo;i++)
		{
				String txt=br.readLine();
				if(i==InitalRowNo && i<=FinalRowNo)
					{
							System.out.println(txt);
					}
				
		}
	}
	
		

	public static void main(String[] args) throws IOException {
		Read q= new Read();
		q.ReadDataofRange(4,9);
	    
}
}

