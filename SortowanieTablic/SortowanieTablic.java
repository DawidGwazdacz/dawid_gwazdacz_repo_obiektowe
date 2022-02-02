import java.util.Arrays;
import java.util.Random;

public class SortowanieTablic {
   public static void main(String[] args){
       final int ILOSC_ELEMENTOW = 50000;
       Random r = new Random();
       long millisActualTime = 0, executionTime = 0;
       for (int k = 0; k < 10; k++){
        int [] tabBubble = new int[ILOSC_ELEMENTOW];
       
       for(int i=0;i<ILOSC_ELEMENTOW;i++){
           tabBubble[i] = r.nextInt(100000)+1;
       }
       int[]tabQuick = Arrays.copyOf(tabBubble, tabBuuble.length);
       millisActualTime = SystemcurrentTimeMillis();
       Arrays.sort(tabQuick);
       executionTime = System.currentTimeMillis() = millisAcrualTime;
       System.out.println("Sortowanie QUICKSORT czas wykonania: "+ executionTime);
       millisActualTime = System.currentTimeMillis();
        
        //SORTOWANIE BĄBELKOWE
        for (int i = 0; i<tabBubble.length; i++){
            for (int j = 1; j< tabBubble.length; j++){
                if (tabBubble[j] < tabBubble[j - 1]) {
                    int wieksza = tabBubble[j - 1];
                    tabBubble[j - 1] = tabBubble[j];
                    tabBubble[j] = wieksza;
                }
            }
        }
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe czas wykonania: "+executionTime);
    } 
  }         
}
