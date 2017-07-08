package generic;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Testing.MyJunitTesting;
@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
			MyJunitTesting.class})

public class FeaturesTestSuite {
	//the class remains empty;
	//used only as a holder for the above annotations

}
