import java.util.ArrayList;

public class NaturalNumber {
    public ArrayList<Integer> findNaturalDel(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                arrayList.add(i);
            }

        }
        return arrayList;

    }

    public ArrayList<Integer> findSimpleDel(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            if ((number % i == 0)& (factorial(i)-1)%i==0) // Wilson's theorem
            {
                arrayList.add(i);
            }

        }
        return arrayList;

    }

    public Integer factorial(Integer number) {
        Integer n = 1;
        for (int i = 1; i < number - 1; i++) {
            n *= i;
        }
        return n;
    }


    public void soutArraylist(ArrayList arrayList) {
        for (Object o : arrayList) {
            System.out.println(o);
            ;
        }
    }

    public ArrayList 




}
