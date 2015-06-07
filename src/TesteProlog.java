/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import jpl.Query;
/**
 *
 * @author Administrador
 */
public class TesteProlog{
    
    public TesteProlog() {
            System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
            System.setProperty("java.protocol.handler.pkgs", "");
    }
    
        public static void main( String argv[] )
        {
        	
//        	 LoggedPrintStream lpsOut = LoggedPrintStream.create(System.out);
//             LoggedPrintStream lpsErr = LoggedPrintStream.create(System.err);
//
//             // Set them to stdout / stderr
//             System.setOut(lpsOut);
//             System.setErr(lpsErr);


            //read a line from the console
            
            //create an print writer for writing to a file
            
//        String t0 = "chdir('src/cods_prolog/')";
//        Query q0 = new Query(t0);
        
            
//        t0 = "chdir('cods_prolog')";
//        q0 = new Query(t0);
//        
            
//        String t1 = "consult('src/cods_prolog/bloques2.pl')";
//        Query q1 = new Query(t1);
//        System.out.println( t1 + " " + (q1.hasSolution() ? "correcto" : "fallo") );
//        String t2 = "encima_de(a,b)";
//        Query q2 = new Query(t2);
//        System.out.println( t2 + " is " + (q2.hasSolution() ? "probado" : "no probado") );
//        String t4 = "mas_arriba_de(X,Y)";
//        Query q4 = new Query(t4);
//        System.out.println( "Solucion para t4 " + t4 );
//        while ( q4.hasMoreSolutions() ){
//        java.util.Hashtable s4= q4.nextSolution();
//        System.out.println( "X = " + s4.get("X") + ", Y = " + s4.get("Y"));
//        }
//        
//        String t5 = "teste(X)";
//        
//        Query q5 = new Query(t5);
//        System.out.println( "Solucion para t5 " + t5 );
//        
////        System.out.println(q5.hasSolution());
////        System.out.println(q5.oneSolution());
////        
//        
//        while ( q5.hasMoreSolutions() ){
//            java.util.Hashtable s5= q5.nextSolution();
//            //System.out.println(s5.toString());
//            System.out.println(s5.get("X"));
//        }
/*        
        Query q40 = new Query(new Compound("teste", new Term[] { new Variable("X")}));
        while ( q40.hasMoreSolutions() ){
            Hashtable<String, Term> solution = q40.nextSolution();
            System.out.println( "X = " + solution.get("X"));
        }
        */
        String t2 = "consult('C:/Users/Marcos/Documents/NetBeansProjects/AppJavaProlog/AppJavaProlog/src/cods_prolog/planejador.pl')";
        Query q2 = new Query(t2);
        System.out.println( t2 + " " + (q2.hasSolution() ? "correcto" : "fallo") );
//      
        
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(baos);
//        // IMPORTANT: Save the old System.out!
//        PrintStream old = System.out;
//        // Tell Java to use your special stream
//        System.setOut(ps);
//        

        String t3 = "consult('C:/Users/Marcos/Documents/NetBeansProjects/AppJavaProlog/AppJavaProlog/src/cods_prolog/trabalho2.pl')";
        Query q3 = new Query(t3);
        System.out.println( t3 + " " + (q3.hasSolution() ? "correcto" : "fallo") );

        
        
        
        String t4 = "teste14.";
        Query q4 = new Query(t4);
        
        /*String teste = q4.hasMoreSolutions();        
        
        while ( q4.hasMoreSolutions() ){
            Hashtable<String, Term> solution = q4.nextSolution();
            System.out.println("AQUIIIIIII");
            System.out.println(solution.toString());
        }        */
        //System.out.println( t4 + " " + (q4.hasSolution() ? "correcto" : "fallo") );
        //String teste = q4.hasSolution();
        //System.out.println(q4.hasSolution());
        //String teste = q4.query();
        
        //String teste = System.out.printl(q4.hasSolution());
        
        System.out.println("teste");
        System.out.println("teste");
        
        
        System.out.println(q4.hasSolution());
        //System.out.println(teste);
        
        
//           while ( q4.hasMoreSolutions() ){
//            Hashtable<String, Term> solution = q4.nextSolution();
//            System.out.println("ANTES");
//            System.out.println(solution.);
//        }
        
        
        
        System.out.println("00000000000000000000000000000000000");
        
        Query   q5 = new Query("teste14");
       // q5.open();
//        System.out.println( q5.debugString());
//        System.out.println( q5.goal());
//        System.out.println( q5.toString());
        System.out.println( q5.oneSolution());
        
        
        System.out.println("11111111111111111111111111");

//        Console console = System.console();
//        if (console != null) {
//        	System.out.println("222");
//          System.out.println(console.readLine());  
//        }
//        
        // Print some output: goes to your special stream
//        System.out.println("Foofoofoo!");
//        // Put things back
//        System.out.flush();
//        System.setOut(old);
//        // Show what happened
//        System.out.println("Here: " + baos.toString());
        
//        System.setOut(lpsOut.underlying);
//        System.setErr(lpsErr.underlying);
//        
//        System.out.println("----- Log for System.out: -----\n" + lpsOut.buf);
//        System.out.println("----- Log for System.err: -----\n" + lpsErr.buf);
        
        
        //Hashtable localHashtable = q5.getSubstWithNameVars();
//        /* 119 */     if (localHashtable != null) {
//        /* 120 */       q5.close();
//        /* 121 */       System.out.println(localHashtable.get("Term"));
//        /*     */     }
//        
//        while ( q5.hasMoreElements() ) {
//         java.util.Hashtable solution = (Hashtable) q5.nextElement();
//         System.out.println( "X = " + (Term) solution.get("X"));
//        }
     
        
        System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        
        Host host = new Host();
        String command = "java -jar \"C:/wamp/www/applet.jar\"";
        System.out.println(command);
        String retornoProlog = host.executeCommand(command);
        
        
        //output to the file a line
                
    }
        
    public void init() {
		System.out.println("Hello NFe!");
		System.out.println("v 1.8.20");
	}  
      
    public String teste() {
        return "teste";
    }
 }