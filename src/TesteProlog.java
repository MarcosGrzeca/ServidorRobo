/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.Applet;
import java.util.Hashtable;
import jpl.*;
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

        String t3 = "consult('C:/Users/Marcos/Documents/NetBeansProjects/AppJavaProlog/AppJavaProlog/src/cods_prolog/trabalho2.pl')";
        Query q3 = new Query(t3);
        System.out.println( t3 + " " + (q3.hasSolution() ? "correcto" : "fallo") );

        String t4 = "teste14";
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
        
        System.err.print(q4.hasSolution());
        //System.out.println(teste);
        
        
//           while ( q4.hasMoreSolutions() ){
//            Hashtable<String, Term> solution = q4.nextSolution();
//            System.out.println("ANTES");
//            System.out.println(solution.);
//        }
     
        
    }
        
    public void init() {
		System.out.println("Hello NFe!");
		System.out.println("v 1.8.20");
	}  
      
    public String teste() {
        return "teste";
    }
 }