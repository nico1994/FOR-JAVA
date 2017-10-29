/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
public static void MostrarNumeroCreciente()
    {
        int contador;
        
        for (contador = 0; contador < 10; contador++) 
        {
            System.out.println("El número es " + contador);
        }
    }
    
    public static void MostrarNumeroDecreciente()
    {
        for (int contador = 100; contador > 0; contador--) {
            System.out.println("El número es " + contador);
        }
    }
    
    public static void MostrarNumeroPares()
    {
        int sumador=0;
        int numero=0;
        for (int contador = 0; contador < 100; contador++) {
            sumador= numero++;
            if (sumador%2==0) {
                System.out.println("Es número par " + sumador);
            }
        }
    }
    
    public static void MostrarNumerosDivisiblesPorSeis()
    {
        int sumador=0;
        int numero=0;
        for (int contador = 0; contador < 100; contador++) {
            sumador= numero++;
            if (sumador%6==0) {
                System.out.println("Es número par " + sumador);
            }
        } 
    }
    
    public static void MostrarTablaDeMultiplicar()
    {
        int numero=9;
        int resultado;
        
        for (int contador = 1; contador < 11; contador++) {
            resultado = numero*contador;
            //System.out.println("Resultado " + resultado);
            System.out.println(numero+" * " + contador + " = " + resultado);
        }
    }
    
    public static void MostrarTablasDeMultiplicar()
    {
        Scanner miSc = new Scanner(System.in);
        int numero;
        int resultado;
        
        System.out.println("Ingrese un número del 1 al 20 para multiplicar");
        numero = miSc.nextInt();
        
        while (numero<20) 
        {
            for (int contador = 1; contador < 11; contador++) 
            {
            resultado = numero*contador;
            //System.out.println("Resultado " + resultado);
            System.out.println(numero+" * " + contador + " = " + resultado);
            }
            break;
        }
       
    }
    
    public static void MostrarDivisiones()
    {
        Scanner miSc = new Scanner(System.in);
        float numero;
        float resultado;
        
        System.out.println("Ingrese un número del 1 al 20 para dividir");
        numero = miSc.nextFloat();
        
        while (numero<20) 
        {
            for (int contador = 1; contador < 11; contador++) 
            {
            resultado = numero/contador;
            //System.out.println("Resultado " + resultado);
            System.out.println(numero+" / " + contador + " = " + resultado);
            }
            break;
        }
       
    }
    
    public static void InformarSiEsNumeroPrimo()
    {
        
        int numero=7;
        int contador;
        boolean bandera=true;
        
        for (contador = 2; contador < numero; contador++) 
        {
            if (numero%contador==0)
            {
                bandera=false;
                break;
            }
        }
        if (bandera==false) 
        {
            System.out.println("No es primo");
        }
        else
        {
            System.out.println("Es primo");
        }
        
       /** if (contador==numero) 
        {
            System.out.println("Es primo");
        }
        else
        {
            System.out.println("No es primo");
        }
        */
        
    }
    
    public static void InformarNumerosPrimosDel1al100()
    {
        /**Desastre (no me salió)
        for (int numeroIngresado = 1; numeroIngresado < 100; numeroIngresado++) 
        {
            Integer contador=2;
            Integer contadorDivisores=0;
            
              if (numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                //contador++;
                
                if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            //numeroIngresado++;
        }
        /**
            if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            numeroIngresado++;
            
        }
        
        
        /**
        while(numeroIngresado<100)
        {
            
            Integer contador=2;
            Integer contadorDivisores=0;
            while (contador<numeroIngresado) 
            {            
                if (numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                contador++;
            }
            if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            numeroIngresado++;
        }
        /**
        int numero=2;
        int contador;
        boolean bandera=true;
        
        
        for (contador = 2; contador < numero; contador++) 
        {
            if (numero%contador==0)
            {
                
                bandera=false;
                break;
            }
        }
        if (bandera==false) 
        {
            System.out.println("No es primo");
        }
        else
        {
            System.out.println("Es primo");
        }
        numero++;
    */    
    }
    
    public static void CentroNumerico()
    {
        int numero=6;
        int sumaanteriores=0;
        int sumaposteriores=0;
        boolean EsCentroNumerico=false;
        for (int contador = 1; contador < numero; contador++) {
            sumaanteriores = sumaanteriores + contador;
        }
        //System.out.println(Sumaanteriores);
        for (int posterior = numero+1; ; posterior++) {
            sumaposteriores = sumaposteriores + posterior;
            if (sumaanteriores == sumaposteriores) 
            {
                EsCentroNumerico=true;
                break;
            }
            if (sumaposteriores>sumaanteriores) 
            {
                break;
            }
        }
        if (EsCentroNumerico) 
        {
            System.out.println("Es centro numérico " + numero);
        }
        else
        {
            System.out.println("No es centro numérico");
        }
    }
    
    public static void CentroNumericoDel1Al1000()
    {
        
        int numero;
        int sumaanteriores=0;
        int sumaposteriores=0;
        boolean EsCentroNumerico=false;
        
        for (numero = 1; numero < 1000; numero++) 
        {

            sumaanteriores=0;
            sumaposteriores=0;
            EsCentroNumerico=false;  
            
            for (int contador = 1; contador < numero; contador++) {
                sumaanteriores = sumaanteriores + contador;
            }
            //System.out.println(Sumaanteriores);
            for (int posterior = numero+1; ; posterior++) {
                sumaposteriores = sumaposteriores + posterior;
                if (sumaanteriores == sumaposteriores) 
                {
                    EsCentroNumerico=true;
                    break;
                }
                if (sumaposteriores>sumaanteriores) 
                {
                    break;
                }
            }
            if (EsCentroNumerico) 
            {
                System.out.println("Es centro numérico " + numero);
            }
            else
            {
               // System.out.println("No es centro numérico");
            }
            
        }
        
    }
    
    public static void FibonacciSucesion()
    {
        //no salió --> ver SerieFibonacci q salió perfecto
        int numero=1;
        int suma=1;
        int anterior=1;
        int Fibonacci=0;
        int auxanterior;
        
        for (int contador = 1; contador < 10; contador++) 
        {   
            auxanterior = Fibonacci;
            Fibonacci = suma + anterior;
            anterior=Fibonacci;
            
            System.out.println("Serie " + Fibonacci);
        }
    }
    
    public static void RetornarMayor()
    {
        int numUno=3;
        int numDos=6;
        int numTres=9;
        
       
            if (numUno>numDos && numUno>numTres) 
            {
                System.out.println("El número mayor es numUno " + numUno);
            }
            else
            {
                if (numUno<numDos && numUno>numTres) 
                {
                    System.out.println("El número mayor es numDos " + numDos);
                }
                 else
                {
                    System.out.println("El número mayores es numTres " + numTres);
                }
            }
           
        
        
        
    }
    
    public static void SerieFibonacci()
    {
        int fibonacci;
        int actual=1;
        int anterior=0;
        
        for (int contador = 0; contador < 30; contador++) 
        {
            
            fibonacci = anterior + actual;
            anterior = actual;
            actual = fibonacci;
            
            System.out.println("Es el: " + fibonacci);
            
            
        }
        
    }
    
    public static void UtnFra()
    {
        /**
         * 1) Recorrer los números del 1 al 100
         * 2) Mostrar en lugar del número la palabra "UTN" para todos los 
         * multiplos de 3 (tres).
         * 3) Mostrar en lugar del número la palabra "FRA" para todos los
         * multiplos de 5 (cinco).
         * 4) Mostrar la palabra "UTNFRA" para todos los multiplos de 3 (tres) y 
         * 5 (cinco) (ejemplo: 15).
         */
        //no funciona!!! Verlo de nuevo. 
        int numero;
        
        
        for (int contador = 1; contador < 100; contador++) 
        {
            if (contador%3==0 && contador%5==0) 
            {
                System.out.println("UTNFRA");
            }
            else
            {
                if (contador%3==0) 
                {
                    System.out.println("UTN");
                }
             
            }
            if (contador%5==0)
            {
                System.out.println("FRA");
            }
            else
            {
                System.out.println(contador);
            }
        }
        
    }
    
    /**
     * 153 = 1^3 + 5^3 + 3^3= 153
     */
    public static void NumeroArmstrong()
    {
        
        int numeroIngresado=153;
        
        int numero=numeroIngresado;
        
        if (numero<0)
        {
            numero = numero*-1;
        }
        int cantidadDeDigitos=0;
        while (numero>0) 
        {            
            numero = numero / 10;
            cantidadDeDigitos++;
        }
        System.out.println(cantidadDeDigitos);
        
        int digito;
        int suma=0;
        int auxNumero = numeroIngresado;
        while (auxNumero>0) 
        {            
          digito = auxNumero%10;
          suma = suma + (int) Math.pow(digito, cantidadDeDigitos);
          auxNumero = auxNumero/10;
          System.out.println(digito);  
        }
        System.out.println(suma);
        if (suma==numeroIngresado) {
            System.out.println("Es Armstrong");
        }
        else
        {
            System.out.println("No lo es...");
        }
    }
    
    public static void HacerPiramide()
    {
        int cantidadDeFilas=7;
        for (int contador = 1; contador < cantidadDeFilas; contador++) 
        {
            for (int contadorLugares = cantidadDeFilas-1; contadorLugares > contador; contadorLugares--) {
                System.out.print(" ");
            }
                for (int contadorDos = 1; contadorDos <= (2*contador-1); contadorDos++) 
                {
                    System.out.print("X");
                }
                System.out.println("");
        }
        
        
    }
    
    public static void EscalonesDeNumero()
    {
        int cantidadDeFilas=5;
        int valor=1;
        for (int contador = 1; contador < cantidadDeFilas; contador++) 
        {
            
                for (int contadorDos = 1; contadorDos <= (2*contador-1); contadorDos++) 
                {
                    System.out.print(valor);
                    valor++;
                }
                System.out.println("");
        }
    }
    
    public static void HacerEjercicio53()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numeroIngresado;
        int cantidadDeDigitos=0;
        
        System.out.println("Ingrese un número");
        numeroIngresado = miSc.nextInt();
        
        for (int numero = numeroIngresado; numero > 0; cantidadDeDigitos++) {
           numero = numero / 10; 
        }
       
        System.out.println("Cantidad de dígitos del número ingresado " + cantidadDeDigitos);
        
    }
    
     public static void HacerEjercicio54()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numeroIngresado;
        int cantidadDeDigitos=0;
        
        System.out.println("Ingrese un número");
        numeroIngresado = miSc.nextInt();
        
        for (int numero = numeroIngresado; numero > 0; cantidadDeDigitos++) {
            numero = numero / 10;
        }
         
        int digito;
        int suma=0;
        int auxNumero = numeroIngresado;
   
        
        while (auxNumero>0) 
        {            
          digito = auxNumero%10;
          suma = suma + (int) Math.pow(digito, cantidadDeDigitos);
          auxNumero = auxNumero/10;
          System.out.println(digito);  
        }
        
        
    }
    
    public static void MostrarPalindromo()
    {
        int numeroReverso;
        int numero=2367;
        String numeroEnLetras="";
        int numeroActual;
        // proceso...
        
    for (int contador=0; numero > 0; contador++) 
    {
        numeroActual=numero%10;
        contador = contador/10;
        numeroEnLetras=numeroActual+numeroEnLetras;
    }
        
    numeroReverso=Integer.parseInt(numeroEnLetras);
       
        /*numeroEnLetras=numeroActual+numeroEnLetras;
        numeroReverso=7632;*/
    
        
    if (numero==numeroReverso) 
    {
        System.out.println("Es palindromo");
    }
        else
        {
            System.out.println("No es palíndromo");
        }
        
    }
    
    public static void EjercicioSerieUTNFRA()
    {
        //bandera int bandera=0;
        for (int numero = 0; numero < 100; numero++) 
        {
            if (numero%3==0 && numero%5==0) {
                System.out.println("UTN-FRAN");
               //bandera bandera=1;
            }
            else
            {
                if (numero%3==0) 
                {
                    System.out.println("FRA");
                  //bandera  bandera=1;
                }
                if (numero%5==0) 
                {
                    System.out.println("UTN");
                  //bandera  bandera=1;
                }
                
            }
            //if (numero%5!=0 && numero%3!=0) 
            //{
              //  System.out.println(numero);
            //}
           //bandera if (bandera==0) {
           //bandera     System.out.println(numero);
            //bandera}
            //banderabandera=0;
        }
    }
    
    public static void HacerEjercicio59()
    {
        int numero=8;
        int resultado;
        
        for (int contador = 1; contador < 11; contador++) {
            resultado = numero*contador;
            System.out.println(numero+" * " + contador + " = " + resultado);
        }
    }
    
    public static void PatronDeLetras()
    {
        /*char letra;
        
        for (letra = 'A'; letra < 'z'; letra++) {
            System.out.println(letra);
            
        }
        System.out.println((char)65);
        */
        
        //Una manera de hacer el ejercicio de piramide de letras y poniendo
        //1 para A, 2 para E, 3 para I, 4 para O, 5 para U. (la de abajo es 
        //mejor porque no hace falta que conozcas el código ASCII)
        
        for (int contador = 65; contador < 91; contador++) 
        {
          
                    
            for (int i = 65; i <= contador; i++) {
             
                 switch(i){
                    case 65:
                    System.out.print(1);
                    break;    
                    
                    case 69:
                    System.out.print(2);
                    break;

                    case 73:
                    System.out.print(3);
                    break;

                    case 79:
                    System.out.print(4);
                    break;

                    case 85:
                    System.out.print(5);
                    break;
                    

                    default:
                         System.out.print((char)i); 
                }

/*
                    char letraCasteada=(char)i;
                    
                    switch(letraCasteada)
                    {
                       case 'A':
                       System.out.print(1);
                       break;
       
                       case 'E':
                       System.out.print(2);
                       break;
                       
                       case 'I':
                       System.out.print(3);
                       break;
                       
                       case 'O':
                       System.out.print(4);
                       break;
                       
                       case 'U':
                       System.out.print(5);
                       break;
                    
                       default:
                       System.out.print((char)i); 
                }*/
            }
            
            
            System.out.println();
            
            
        }
    }
    
    public static void ImprimirCodigosASCII()
    {
        for (int contador = 0; contador < 150; contador++) {
            System.out.println(contador + " = " + (char)contador);
        }
    }
        
    
    
}//finaliza el main