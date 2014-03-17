import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CompanyTest {
	
	public static void main(String[] args) {
		String[][] dataArr = {{"Year","Month","CompA", "CompB", "CompC"},{"2001", "January", "25", "50", "30"}, {"2001", "feburary", "20", "40", "60"}};
		Company comp = null;
		int count = 2;
		List<Company> compList = null;
		while(count < dataArr[0].length){
			compList = new ArrayList<Company>();
			for(int i=1; i < dataArr.length; i++){
					comp = new Company();
					comp.setCompanyName(dataArr[0][count]);
					comp.setMonth(dataArr[i][1]);
					comp.setYear(new Integer(dataArr[i][0]));
					comp.setSharePrice(new Double(dataArr[i][count]));
					compList.add(comp);
			}
			Collections.sort(compList);
			comp = compList.get(compList.size()-1);
			System.out.println("maximum price for share company name : " + comp.getCompanyName() + " is " +
			comp.getSharePrice() + " in the month of " + comp.getMonth() + " " + comp.getYear());
			count++;
		}
	}

}
