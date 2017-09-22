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

    public void soutArraylist(ArrayList arrayList){
        for (Object o:arrayList) {
            System.out.println(o);;
        }
    }

}
