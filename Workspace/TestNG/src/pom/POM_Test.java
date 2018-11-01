package pom;

import org.testng.annotations.Test;

public class POM_Test extends TestBase{

	// Test Using Page Factory START **
	@Test()
	public void loginTest_UsingPageFactory(){
		initialization();
		POM_PAGEFACTORY_PAGE pf = new POM_PAGEFACTORY_PAGE();
		pf.login("naveenk","test@123");
	}
	// Test Using Page Factory END **
	
	// Test Using POM START **
	@Test()
	public void loginTest_UsingPOM(){
		initialization();
		POM_PAGE pp = new POM_PAGE();
		pp.login("naveenk","test@123");
	}
	// Test Using POM END **
}
