package bankapplication;

public class BankFactory {
	public String  getNewSavingAcc (int accNo , String accNm , float accBal , boolean isSalaried)
	{
		return  "new Saving Account Here";
	}
	
	public String  getNewCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		return "new Current Account here";
	}
}
