package bankapplication;

public class MMSavingAcc extends SavingAcc{
private static final float MINBAL = 500;
	
	public MMSavingAcc (int accNo , String accNm, float accBal ,boolean isSalaried) 
	{
		//private String getisSalaried;
		super(accNo,accNm,accBal,isSalaried);
		//MMSavingAcc.MINBAL = MINBAL;
		
	}
	
	public float getaccBal() {
		return MINBAL;
	}
	public void withdraw(float amount) {
		if(amount<500) {
			System.out.println("you cant withdraw amount you dont have minimum balance");
		}else {
		System.out.println("withdraw amount :"+amount);
		}
	}
	public String toString() {
		return "Saving Account(Account Number :"+getaccNo()+" | Account Name : "+getaccNm()+" | Account Balance : "+getaccBal()+" | Minimum Balance is :"+getdMINBAL()+" | Is salary Account : "+getisSalaried()+")";
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMSavingAcc mms = new MMSavingAcc(111, "kalpesh", 45,true);
		MMSavingAcc mms1 = new MMSavingAcc(222, "Ritesh", 50,false);
		MMSavingAcc mms2 = new MMSavingAcc(333, "kiran", 60,true);
		mms.toString();
		System.out.println("welcome to saving account :)");
		mms.withdraw(1000);
		mms.withdraw(500);
		
		System.out.println(mms.toString());
		System.out.println(mms1.toString());
		System.out.println(mms2.toString());
		System.out.println("Thank You");
	}

}
