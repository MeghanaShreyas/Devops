package programs;

class bank
{
	int getrateofinterest()
	{
		return 10;
	}
}

class SBI extends bank
{
	int getrateofinterest()
	{
		return 20;
	}
}

class ICICI extends bank
{
	int getrateofinterest()
	{
		return 30;
	}
}


public class Methodoverriding {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new bank();
		int res = b.getrateofinterest();
		System.out.println(res);
		bank ic = new ICICI();
		System.out.println(ic.getrateofinterest());
		SBI sbi = new SBI();
		System.out.println(sbi.getrateofinterest());
	}

}
