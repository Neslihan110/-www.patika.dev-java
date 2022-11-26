package threadRace;

import java.util.ArrayList;
import java.util.List;

        public class Main {

            public static void main(String[] args) {

                List<Integer> array = new ArrayList<>();

                for (int i = 1; i <= 100; i++) {
                    array.add(i);
                }

                List<Integer> subArray1 = array.subList(0, 25);
                List<Integer> subArray2 = array.subList(25, 50);
                List<Integer> subArray3 = array.subList(50, 75);
                List<Integer> subArray4 = array.subList(75, 100);

                HelperClass helper1 = new HelperClass(subArray1);
                helper1.start();

                HelperClass helper2 = new HelperClass(subArray2);
                helper2.start();

                HelperClass helper3 = new HelperClass(subArray3);
                helper3.start();

                HelperClass helper4 = new HelperClass(subArray4);
                helper4.start();
            }
        }
