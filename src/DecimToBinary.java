// Do zrobienia:
// - liczby ujemne
// - liczby zmiennoprzecinkowe

import java.util.Scanner;
import java.lang.Math;

// Program ma robić konwersję z liczb dziesiętnych na binarne - na piechotę, a nie wbudowaną funkcją
public class DecimToBinary {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę dziesiętną, która ma być zamieniona na binarną: ");

        // czytnik liczby, która ma być zamieniona na binarna
        Scanner sc_1 = new Scanner(System.in);
        final int x = sc_1.nextInt();
        int CalcContainer = x;

        // zmienna, która ma definiować długość arraya, który ma przechowywać resztę z dzielenia
        // int decimalNumContainer = x;
        int arrayBinaryLength = 0;
        int tempContainer = x;

        // pętla, która ma wyszukać długość arraya, który ma przechowywać resztę z dzielenia
        do{
            tempContainer = tempContainer / 2;
            arrayBinaryLength++;
        } while (tempContainer > 0);

        // pomocniczy licznik pętli
        int licznik = 0;

        // array ma przechowywać resztę z dzielenia; później zawartość arraya ma być wyświetlona jako reprezentacja binarna
        int[] TestArray = new int[arrayBinaryLength];

        // petla dzieląca przez 2 z resztą - ta pętla ma przekształcić liczbę dziesiętną na binarną metodą dzielenia przez 2 z resztą
        do{
            // System.out.println("Dzielona liczba w danej iteracji: " + x);
            int y;
            y = x % 2;
            x = x / 2;
            // przypisanie do danego miejsca w arrayu reszty z dzielenia, po każdej interacji funkcji
            TestArray[licznik] = y;
            // System.out.println("Reszta z dzielenia: " + y);
            licznik++;
            // System.out.println("Licznik petli: " + licznik + "\n");
        } while (x>0);

        // klasa przekształcająca na liczbę binarną - zawiera pętlę zwracającą wartość binarną

        class BinaryCalc{
            int tempContainer = x;

            public int toBinary(){
                // zmienna, która ma definiować długość arraya, który ma przechowywać resztę z dzielenia
                int arrayBinaryLength = 0;

                // pętla, która ma wyszukać długość arraya, który ma przechowywać resztę z dzielenia
                do{
                    tempContainer = tempContainer / 2;
                    arrayBinaryLength++;
                } while (tempContainer > 0);

                // pomocniczy licznik pętli
                int licznik = 0;

                // array ma przechowywać resztę z dzielenia; później zawartość arraya ma być wyświetlona jako reprezentacja binarna
                int[] TestArray = new int[arrayBinaryLength];

                // petla dzieląca przez 2 z resztą - ta pętla ma przekształcić liczbę dziesiętną na binarną metodą dzielenia przez 2 z resztą
                do{
                    // System.out.println("Dzielona liczba w danej iteracji: " + x);
                    int y;
                    y = tempContainer % 2;
                    tempContainer = tempContainer / 2;
                    // przypisanie do danego miejsca w arrayu reszty z dzielenia, po każdej interacji funkcji
                    TestArray[licznik] = y;
                    // System.out.println("Reszta z dzielenia: " + y);
                    licznik++;
                    // System.out.println("Licznik petli: " + licznik + "\n");
                } while (x>0);
            }
        }

        // opracuj metode wyświetlenia zawartości arraya - na razie nie działa; sugestia na szybko - zrobić sout z pętli for dla każdego elementu arraya
        // System.out.println(Arrays.toString(TestArray));

        // System.out.println("Liczba dziesiętna, przekształcana na binarną: " + "\n" + decimalNumContainer + "\n" );

        System.out.println("Wynik przekształcenia: ");

        // pętla, która przedstawia wynik
        for(int z = TestArray.length - 1; z >= 0; z--){
            System.out.print(TestArray[z]);
        }

    }
}