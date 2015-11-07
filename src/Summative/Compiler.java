package Summative;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Timer;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Compiler {

	public static void main (String[] args) {
		// Prepare source somehow.
		Codehandler c= new Codehandler();
		String source = ""
		
		+ "	public class MonteCarloSim { "
		+ "		static Timer timer = new Timer(); "
		+ "		static int seconds = 0; "
		+ "		public static void main(String [] args){ "
		+ "			Statistics stats= new Statistics(); "
		+ "			TrialRunner instance = new TrialRunner(10000000,2); "
		+ "			NVarFunction nVarF = new NVarFunction(); "
		+ "			final long startTime = System.currentTimeMillis(); "
		+ "			instance.runNVar(nVarF); "
		+ " 			final long endTime = System.currentTimeMillis(); "
		+ "		String s=\"Total execution time: \" + (endTime - startTime) + \" milliseconds\"; "
		+ "		Results r= new Results(); "
		+ "		r.Setresult(s); "
		+ "		} "
		+ "	} ";
	
	

		
		
	

		// Save source in .java file.
		File root = new File("java"); // On Windows running on C:\, this is C:\java.
		File sourceFile = new File(root, "test/MonteCarloSim.java");
		
		sourceFile.getParentFile().mkdirs();

		
		try(PrintWriter writer = new PrintWriter(new FileOutputStream(sourceFile))) 
		{
			writer.println(source);
		}
		catch(FileNotFoundException e) {
			
		}
		
		// Compile source file.
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null, sourceFile.getPath());
		

		// Load and instantiate compiled class.
		try{
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
		Class<?> cls = Class.forName("test.MonteCarloSim", true, classLoader); // Should print "hello". changes
		Object instance = cls.newInstance(); // Should print "world".
		System.out.println(instance); // Should print "test.Test@hashcode".
	
		
		
		

		}catch(MalformedURLException e){
			
		}catch(ClassNotFoundException e){
			
		}catch (InstantiationException e){
			
		}catch(IllegalAccessException e){
			
		}
		
	} 
		
	}