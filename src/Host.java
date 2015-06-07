import java.io.*;

public class Host {
	public static String executeCommand(String command) {
		System.out.println("executeCommand");

		String retval = null;
		try {
			System.out.println("AAA");
			
			String[] finalCommand;
			finalCommand = new String[3];
			// finalCommand[0] = "/bin/sh";
			// finalCommand[1] = "-c";
			// finalCommand[2] = command;
			
			finalCommand[0] = "java";
			finalCommand[1] = "-jar";
			finalCommand[2] = "\"C:/wamp/www/applet.jar\"";

			System.out.println("AAA");
			
			final Process pr = Runtime.getRuntime().exec(finalCommand);
			
			pr.waitFor();
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		 
			System.out.println("RETORNO");
			
		    String line = "";			
		    while ((line = reader.readLine())!= null) {
		    	System.out.println(line + "\n");
		    	retval += line + "\n";
		    }
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
		return retval;
	}
}