import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParteCinco {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Valor 1 da 1º Lista");
        list.add("Valor 2 da 1º Lista");
        list.add("Valor 3 da 1º Lista");
        list.add("Valor 1 da 1º Lista");
        /*
        for(String value:list){
            System.out.println(value);
        }
        */
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Valor 4 da 2º Lista");
        list2.add("Valor 2 da 2º Lista");
        list2.add("Valor 3 da 2º Lista");
        list2.add("Valor 1 da 2º Lista");
        /*
        for(String value:list2){
            System.out.println(value);
        }
        */
        List<String> resultList1 = Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
        for(int i=0;i<resultList1.size();i++)
        {
            System.out.print(resultList1.get(i)+" \n");
        }
    }
}