package pl.markopolo;

public class MoveZeros {
    public void moveZeros(int [] numbs) {
     int shift = 0;
     for (int i = 0; i < numbs.length; i++) {
         if (numbs[i] == 0) {
             shift++;
         }
         else if (shift > 0) {
             int j = numbs[i];
             numbs[i] = 0;
             numbs[i - shift] = j;

         }
     }
    }
}
