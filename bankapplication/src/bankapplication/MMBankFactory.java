package bankapplication;

public class MMBankFactory extends BankFactory{
private int getMinbal=300;
	
	public String  getNewSavingAcc (int accNo , String accNm , float accBal , boolean isSalaried)
	{
		return "Saving Account(Account Number :"+accNo+" | Account Name : "+accNm+" | Account Balance : "+accBal+" | Minimum Balance is :"+getMinbal+" | Is salary Account : "+isSalaried+")";

	}
	public String  getNewCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		return "Current Account(Account Number :"+accNm+" | Account Name : "+accNm+" | Account Balance : "+accBal+" | Credit Limit Balance is :"+creditLimit+")";

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory mmf= new MMBankFactory();
		System.out.println(mmf.getNewCurrentAcc(123, "kalpesh Jadhav", 100000, 20000));
		System.out.println(mmf.getNewSavingAcc(122, "Nitesh Kakagde", 3000, true));
		System.out.println(mmf.getNewCurrentAcc(121, "Vishal Tawar", 5000, 20000));
		System.out.println(mmf.getNewSavingAcc(120, "Gaurav Shinde", 80000, true));
	}

}
