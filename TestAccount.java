package generic;

import java.util.ArrayList;
import java.util.List;



public class TestAccount {
	public static void main(String a[])
	{

Account acc=new LoanAccount();
List<?> account=new ArrayList<LoanAccount>();

List<?extends Account> accounts;
List<LoanAccount> loanaccount=new ArrayList<LoanAccount>();
loanaccount.add(new LoanAccount());
account=loanaccount;
List<?super JoinLoanAccount> account1=new ArrayList<LoanAccount>();
account1.add(0, new JoinLoanAccount());
}
}
