/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.view;

import java.util.Scanner;
import udem.edu.co.model.Ajo;
import udem.edu.co.model.Apio;
import udem.edu.co.model.Cebolla;
import udem.edu.co.model.Rabano;
import udem.edu.co.model.Zanahoria;

 /**
 *
 * @author jario
 * @since 03/03/2022
 * @version 1
 * Esta es la clase principal, donde se ejecuta el codigo
 */ 
public class Verdureria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Zanahoria zana = new Zanahoria();
        Cebolla cebo = new Cebolla();
        Ajo aj = new Ajo();
        Rabano raba = new Rabano();
        Apio ap = new Apio();
        float gravedad = (float) 9.8;

        Scanner scan = new Scanner(System.in);
        

        String opc = "";
        String opc1 = "";
//        while (!"s".equalsIgnoreCase(opc)) {
//            System.out.println("---------  FRUVER ------------");
//            System.out.println("[a] Registrar Raiz");
//            System.out.println("[b] Registrar Bulbo");
//            System.out.println("[c] Registrar Tallo");
//            System.out.println("[s] salir");
//
//            if (opc.equalsIgnoreCase("a")) {
//
//                while (!"s".equalsIgnoreCase(opc1)) {
                    System.out.println("---------  FRUVER ------------");
                    System.out.println("[a] Zanahoria");
                    System.out.println("[b] Rabano");
                    System.out.println("[s] salir");

//                    if (opc1.equalsIgnoreCase("a")) {
                        System.out.println("Ingrese la masa de la zanahoria: ");
                        float masa = scan.nextFloat();
                        System.out.println("Ingrese el precio de la zanahoria: ");
                        float precio = scan.nextFloat();
                        zana.setNombre("Zanahoria");
                        zana.setPeso(masa * gravedad);
                        zana.setPrecio(precio);
                    
                        System.out.println("Ingrese la masa del rabano: ");
                        float masa1 = scan.nextFloat();
                        System.out.println("Ingrese el precio del rabano: ");
                        float precio1 = scan.nextFloat();
                        raba.setNombre("Rabano");
                        raba.setPeso(masa1 * gravedad);
                        raba.setPrecio(precio1);
               
                    System.out.println("---------  FRUVER ------------");
                    System.out.println("[a] Ajo");
                    System.out.println("[b] Cebolla");
                    System.out.println("[s] salir");


                   
                        System.out.println("Ingrese la masa del ajo: ");
                        float masa2 = scan.nextFloat();
                        System.out.println("Ingrese el precio del ajo: ");
                        float precio2 = scan.nextFloat();
                        aj.setNombre("Ajo");
                        aj.setPeso(masa2 * gravedad);
                        aj.setPrecio(precio2);
                    
                   
                        System.out.println("Ingrese la masa de la cebolla: ");
                        float masa3 = scan.nextFloat();
                        System.out.println("Ingrese el precio de la cebolla: ");
                        float precio3 = scan.nextFloat();
                        cebo.setNombre("Cebolla");
                        cebo.setPeso(masa3 * gravedad);
                        cebo.setPrecio(precio3);
                
           
                    System.out.println("---------  Tallo ------------");
                    System.out.println("[a] Apio");
                    System.out.println("[b] Puerro");
                    System.out.println("[s] salir");

                   
                        System.out.println("Ingrese la masa del apio: ");
                        float masa4 = scan.nextFloat();
                        System.out.println("Ingrese el precio del apio: ");
                        float precio4 = scan.nextFloat();
                        ap.setNombre("Apio");
                        ap.setPeso(masa4 * gravedad);
                        ap.setPrecio(precio4);
                    

               
        
        System.out.println("<HTML>\n" +
"	<HEAD>\n" +
"		<TITLE>Verdureria: Fruver</TITLE>\n" +
"	</HEAD>\n" +
"	<BODY bgcolor=\"pink\">\n" +
"		<h1 class=\"centro\">FRUVER</h1>\n" +
"		<hr/>\n" +
"		<h3 class=\"centro\">Nombre de verdura</h3>\n" +
"		<p> "
                + zana.getNombre()+" </p>\n" +
"		<h3 class=\"centro\">Peso de verdura</h3>\n" +
"		<p>   "
                        + zana.getPeso()+" </p>\n" +
"		<h3 class=\"centro\">Precio verdura</h3>\n" +
"		<p>   "
                                + zana.getPrecio()+" </p>\n" +
"	</BODY>");
        
        System.out.println("<HTML>\n" +
"	<HEAD>\n" +
"		<TITLE>Verdureria: Fruver</TITLE>\n" +
"	</HEAD>\n" +
"	<BODY bgcolor=\"pink\">\n" +
"		<h1 class=\"centro\">FRUVER</h1>\n" +
"		<hr/>\n" +
"		<h3 class=\"centro\">Nombre de verdura</h3>\n" +
"		<p> "
                + cebo.getNombre()+" </p>\n" +
"		<h3 class=\"centro\">Peso de verdura</h3>\n" +
"		<p>   "
                        + cebo.getPeso()+" </p>\n" +
"		<h3 class=\"centro\">Precio verdura</h3>\n" +
"		<p>   "
                                + cebo.getPrecio()+" </p>\n" +
"	</BODY>");
    }

}
