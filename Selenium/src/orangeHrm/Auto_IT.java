package orangeHrm;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class Auto_IT {

	public static void main(String[] args)throws Exception{
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, "C:\\Users\\qap\\Desktop\\calc.au3");
		AutoItX x = new AutoItX();
		Thread.sleep(2000);
		x.run("Notepad.exe");
		x.winWaitActive("Untitled - Notepad");
		if(x.winExists("Untitled - Notepad"))
		{
			System.out.println("Note pad displayed");
		}
		

	}

}
