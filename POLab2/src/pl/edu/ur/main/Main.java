package pl.edu.ur.main;

/**
 *
 * @author marcin
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

        Scanner odczyt = new Scanner(System.in);

        // ZADANIE DOMOWE
        //Zadanie 3
//        double[] tab;
//        tab = new double[10];
//        int opcja;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
//            tab[i] = odczyt.nextDouble();
//        }
//        do {
//            System.out.println("Wybierz co program ma zrobić:\n"
//                    + "0 - Wyłącza program.\n"
//                    + "1 - Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n"
//                    + "2 - Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n"
//                    + "3 - Wyświetlanie elementów o nieparzystych indeksach.\n"
//                    + "4 - Wyświetlanie elementów o parzystych indeksach.");
//
//            opcja = odczyt.nextInt();
//
//            if (opcja == 1) {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("T[" + i + "] = " + tab[i]);
//
//                }
//            } else if (opcja == 2) {
//                for (int i = 9; i >= 0; i--) {
//                    System.out.println("T[" + i + "] = " + tab[i]);
//
//                }
//            }
//            else if(opcja==3){
//                for(int i=0; i<10; i++)
//                {
//                    if(i%2==1) System.out.println("T[" + i + "] = " + tab[i]);
//                }
//            }
//            else if(opcja==4){
//                 for(int i=0; i<10; i++)
//                {
//                    if(i%2==0) System.out.println("T[" + i + "] = " + tab[i]);
//                }
//                 
//                 
//            } 
//            else if(opcja==0) System.out.println("Program zakończy działanie.");
//            else System.out.println("Wybrałeś złą funkcję!");
//                
//
//        } while (opcja != 0);
        //Zadanie 4
//        int x;
//        double suma=0;
//        double iloczyn = 1;
//        double srednia;
//        double[] tab1;
//        tab1 = new double[10];      
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
//            tab1[i] = odczyt.nextDouble();
//        }
//        
//        double min=tab1[0];
//        double max=tab1[0];
//        
//            do{
//                System.out.println("Wybierz opcję programu: \n"
//                        + "1 - oblicz sumę elementów tablicy,\n" 
//                        + "2 - oblicz iloczyn elementów tablicy,\n"
//                        + "3 - wyznacz wartość średnią,\n"
//                        + "4 - wyznacz wartość minimalną,\n"
//                        + "5 - wyznacz wartość maksymalną\n"
//                        + "0 - Zakończ działanie programu.");
//                x = odczyt.nextInt();
//                
//                switch(x)
//                {
//                    case 0 : System.out.println("Program zakończy działane."); break;
//                    case 1 : 
//                        for(int i=0; i<10; i++)
//                        {
//                            suma+=tab1[i];
//                        }
//                        System.out.println("Suma wszystkich elementów tablicy wynosi: "+suma);
//                        break;
//                    case 2 : 
//                       for(int i=0; i<10; i++)
//                        {
//                            iloczyn*=tab1[i];
//                        }
//                        System.out.println("Iloczyn wszystkich elementów tablicy wynosi: "+iloczyn);
//                        break;
//                    case 3 :
//                        for(int i=0; i<10; i++)
//                        {
//                            suma+=tab1[i];
//                        }
//                        srednia = suma/10;
//                        System.out.println("Srednia wartość wszystkich elementów tablicy wynosi: "+srednia);
//                        break;
//                        
//                    case 4 : 
//                        for(int i=0; i<10; i++)
//                        {
//                            if(tab1[i]<min)
//                                min=tab1[i];
//                        }
//                        System.out.println("Najmniejszy element tablicy to: "+min);
//                        break;
//                    case 5 : 
//                        for(int i=0; i<10; i++)
//                        {
//                            if(tab1[i]>max)
//                                max=tab1[i];
//                        }
//                        System.out.println("Największy element tablicy to: "+max);
//                        break;
//                        
//                    default : System.out.println("Wybrałeś złą funkcję!"); break;                }
//                
//            }while(x!=0);
        //Zadanie 6
//                   int a;
//            while(true)	
//            { 
//                System.out.println("Wprowadź liczbę całkowitą: (Żeby zakończyć działanie wprowadź liczbę mniejszą od 0)");
//                a = odczyt.nextInt();
//                if(a<0) break; 
//            }

        // Zadanie 7
        int n;
        System.out.println("Ile liczb chcesz wprowadzić do tablicy?");
        n = odczyt.nextInt();
        int[] tab2;
        tab2 = new int[n];
        int p;
        boolean z = true;

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
            tab2[i] = odczyt.nextInt();
        }

        while (z) {
                z=false;
            for (int i = 1; i < n; i++) {

                if (tab2[i] < tab2[i - 1]) {
                    p = tab2[i - 1];
                    tab2[i - 1] = tab2[i];
                    tab2[i] = p;
                    z=true;

                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("T[" + i + "] = " + tab2[i]);
        }

// Część laboratoryjna

        /*
           int x;
        
          System.out.println("Podaj miesiąc: (Żeby przerwać wpisz 0)");
        x = odczyt.nextInt();
        
            switch (x) {
                case 1:
                    System.out.println("Styczeń");
                    break;

                case 2:
                    System.out.println("Luty");
                    break;

                case 3:
                    System.out.println("Marzec");
                    break;

                case 4:
                    System.out.println("Kwiecień");
                    break;

                case 5:
                    System.out.println("Maj");
                    break;

                case 6:
                    System.out.println("Czerwiec");
                    break;

                case 7:
                    System.out.println("Lipiec");
                    break;

                case 8:
                    System.out.println("Sierpień");
                    break;

                case 9:
                    System.out.println("Wrzesień");
                    break;

                case 10:
                    System.out.println("Październik");
                    break;

                case 11:
                    System.out.println("Listopad");
                    break;

                case 12:
                    System.out.println("Grudzień");
                    break;

                default:
                    System.out.println("Podałeś zły miesiąc.");
                    break;
            }
        }
         
        int i = 0;
        int a = 0;
        int skok = 100;
        System.out.println("DO WHILE");
        do {

            a += skok;

            i++;
            System.out.println("Iteracja:" + i);
            System.out.println("a=" + a);
        } while (a < 1000);
        
        
        a=0;
        i=0;
        System.out.println("WHILE");
        while(a<1000)
        {
            a += skok;

            i++;
            System.out.println("Iteracja:" + i);
            System.out.println("a=" + a);
        }
       

        
        for(int i=20; i>=0; i--)
        {
            if(i==2 || i==6 || i==9 || i==15 || i==19 ) continue;
            else
                System.out.println(i);
            
        }
        
        
        
        int a,b,c;
        double x1, x2, delta;
        
        a=1; b=3; c=1;
        
        delta=b*b-4*a*c;
        
        if(delta<0) System.out.println("Brak rozwiązań, delta ujemna");
        else
            if(delta==0)
            {
                x1= -b/2*a;
                System.out.println("Delta=0, x0= "+x1);
            }
        else
            {
                x1= (-b - Math.sqrt(delta))/2*a;
                x2= (-b + Math.sqrt(delta))/2*a;
                System.out.println("delta="+delta+" x1="+x1+" x2="+x2);
            }
         */
    }

}
