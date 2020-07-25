package com.data;

import com.utilities.Xls_Reader;

public class LoginDataRetirement {
	Xls_Reader x=new Xls_Reader("/Users/rakesh/eclipse-workspace/manulife/src/com/utilities/manulife.xlsx");
public String VE=x.getCellData("manulife", "validemail", 2);
public String VP=x.getCellData("manulife", "validpassword", 2);
public String IVE=x.getCellData("manulife", "invalidemail", 2);
public String IVP=x.getCellData("manulife", "invalidpassword", 2);
public String EandPerror=x.getCellData("manulife", "emailandpassworderror", 2);
public String Eerror=x.getCellData("manulife", "emaptyerror", 2);


}
