
package lab4p1_hectorrivera;
import java.util.Scanner;

public class Lab4P1_HectorRivera {

    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        int desc=0;
        while(desc!=4){
            System.out.println("-----------Menu-----------");
            System.out.println("1.Inversión especial \n2.Balanza de cadenas \n3.Cifrado de mensajes \n4.Salir del codigo ");
            desc=sc1.nextInt();
            switch(desc){
                case 1:{
                    System.out.println("Ingrese una palabra: ");
                    String pal= sc2.nextLine();
                    String acum="";
                    String acum1="";
                    for (int i =0 ; i < pal.length(); i++) {
                        acum1= pal.charAt(i)+acum1;
                        if(pal.charAt(i)==' '){
                            acum= acum + acum1;
                            acum1="";
                        }
                    }
                    System.out.println(acum+" "+acum1);
                }break;//fin case 1

                case 2:{
                    int Val,cont1=0,cont2=0,cont3=0;
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Ingrese la cadena "+i+":");
                        String pal= sc2.nextLine();
                        for (int j = 0 ; j < pal.length(); j++) {
                            Val=(int)pal.charAt(j);
                            switch(i){
                                case 1: 
                                    cont1+=Val;  
                                    break;
                                case 2:
                                    cont2+=Val;
                                    break;
                                case 3:
                                    cont3+=Val;
                                    break;
                            }
                        }
                    }
                    System.out.println("Peso cadena 1: "+cont1);
                    System.out.println("Peso cadena 2: "+cont2);
                    System.out.println("Peso cadena 3: "+cont3);
                    if(cont1>cont2||cont1>cont3){
                        System.out.println("La cadena 1 es la mas pesada");
                    }else if(cont3>cont2||cont3>cont1){
                        System.out.println("La cadena 3 es la mas pesada");
                    }else if (cont2>cont3||cont2>cont1){
                        System.out.println("La cadena 2 es la mas pesada");
                    }else{
                        System.out.println("Las 3 son iguales");
                    }

                }break;//fin case 2

                case 3:{
                    System.out.println("Ingrese el mensaje a cifrar: ");
                    String pal= sc2.nextLine();
                    for(int i=0; i<pal.length() ; i++){  
                        int val = (int)pal.charAt(i);
                        val+=2;
                        char x = (char)val;
                        System.out.print(x);
                    }
                    System.out.println("");
                    
                }break;//fin case 3

                default:
                    System.out.println("");
                    break;

            }
        }
    }
    
}
