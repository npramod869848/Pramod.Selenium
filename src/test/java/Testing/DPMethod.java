package Testing;

import org.testng.annotations.DataProvider;

public class DPMethod {
	//parameter la data provider karnyasathi dp banvla
	//1.india qutub minar
	//2.Agra taj mahal
	//3.Hyderabad charminar
		
		@DataProvider(name="searchDataSet")//DP madhe attribute takle
		public Object[][]searchData()
		{
			Object[][] searchKeyword=new Object [3][2];
			searchKeyword[0][0]="India";
			searchKeyword[0][1]="Qutub Minar";
			
			searchKeyword[1][0]="Agra";
			searchKeyword[1][1]="Taj Mahal";
			
			searchKeyword[2][0]="Hyderabad";
			searchKeyword[2][1]="Char Minar";
			
			return searchKeyword;
			
			
		}
}
