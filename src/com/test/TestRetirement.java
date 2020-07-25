package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.data.LoginDataRetirement;
import com.pages.LoginRetirement;



public class TestRetirement {
	LoginDataRetirement d=new LoginDataRetirement();
	LoginRetirement m=new LoginRetirement();
  @Test
  public void Vemail() {
	  m.enteremail(d.VE);
	  m.enterpassword(d.IVP);
	  String Expectederror=m.wemailpassworderror();
	  String actualerror=d.EandPerror;
	  Assert.assertEquals(actualerror,Expectederror);
		}
  @Test
  public void Vpassword() {
	  m.enteremail(d.IVE);
	  m.enterpassword(d.VP);
	  String Expectederror=m.wemailpassworderror();
	  String actualerror=d.EandPerror;
	  Assert.assertEquals(actualerror,Expectederror);
		}
	@BeforeMethod
	public void beforemethod() throws IOException {
		m.openbrowser();
		m.manulifelogin();
		
		
	}
	@AfterMethod
	public void Aftermethod() {
		m.closebrowser();
	}
}
