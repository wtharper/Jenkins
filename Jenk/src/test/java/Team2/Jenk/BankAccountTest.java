package Team2.Jenk;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest 
{
	
	@Test
	public void testDebitWithSufficientFunds()
	{
		BankAccount account = new BankAccount(10);
		double amount = account.debit(5);
		Assert.assertEquals(5.0, amount, 0.0001);
	}
	
	@Test
	public void testDebitWithInsufficientFunds()
	{
		BankAccount account = new BankAccount(10);
		double amount = account.debit(11);
		Assert.assertEquals(10.0, amount, 0.0001);
	}
}
