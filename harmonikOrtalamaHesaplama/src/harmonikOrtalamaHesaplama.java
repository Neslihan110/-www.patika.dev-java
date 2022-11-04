public class harmonikOrtalamaHesaplama {

    public static void main(String[] args) {

      int [] array ={1,2,3,4,5};
      double total;
      float result =0;
      for (int j : array) {
          result += 1f / j;
      }
      total=array.length / result;

        System.out.println("harmonic Average = " + total);
    }
}
