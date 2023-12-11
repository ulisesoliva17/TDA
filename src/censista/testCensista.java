/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package censista;
import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class testCensista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantCensista;
        int unDniAVerificar;
        System.out.println("Ingrese la cantidad de censistas que desea cargar");
        cantCensista= sc.nextInt();
        Censista[] arreglo = new Censista[cantCensista];
        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
        System.out.println("Los cencistas con 70 porciento censado son:");
        mostrarArreglo(cencistaCon70Porciento(arreglo));
        System.out.println("Ingrese un dni para verificar si esta en el arreglo");
         unDniAVerificar= sc.nextInt();
         System.out.println("El dni esta en el arreglo? "+dniEnArreglo(arreglo,unDniAVerificar));
        
    }
    public static void cargarArreglo(Censista[] arreglo){
        Scanner sc = new Scanner(System.in);
         int i;
        int dni;
        int telefono;
        String provincia,ciudad;
        int area,cantCensada,totalViviendas;
        for(i=0; i<arreglo.length; i++){
            System.out.println("Ingrese su dni");
            dni = sc.nextInt();
            System.out.println("Ingrese su telefono");
            telefono = sc.nextInt();
            System.out.println("Ingrese su provincia");
            provincia = sc.next();
            System.out.println("Ingrese su ciudad");
            ciudad = sc.next();
            System.out.println("Ingrese el area");
            area= sc.nextInt();
            System.out.println("Ingrese la cantidad de casas censadas");
            cantCensada= sc.nextInt();
            System.out.println("Ingrese el total de viviendas");
            totalViviendas = sc.nextInt();
            arreglo[i] = new Censista(dni,telefono,provincia,ciudad,area,cantCensada,totalViviendas);
        }
    }
    public static void mostrarArreglo(Censista[] arreglo){
        for(int i=0; i< arreglo.length; i++){
            System.out.println(arreglo[i].toString());
        }
    }
    public static Censista[] cencistaCon70Porciento(Censista[] arreglo){
        int i,j=0;
        Censista[] nuevoArreglo = new Censista[arreglo.length];
        for(i=0; i< nuevoArreglo.length; i++){
            if(arreglo[i].getCantCensada()>((arreglo[i].getTotalViviendas()*70)/100)){
                nuevoArreglo[j]=arreglo[i];
                j++;
            }
        }
        return nuevoArreglo;
    }
    public static boolean dniEnArreglo(Censista[] arreglo,int unDni){
        boolean siEsta=false;
        int i=0;
        while(i<arreglo.length && siEsta==false){
            if(arreglo[i].getDni()==unDni){
                siEsta= true;
            }
            i++;
        } 
        return siEsta;
    }
}
