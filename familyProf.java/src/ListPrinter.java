import java.util.ArrayList;
import java.util.List;

public class ListPrinter <E>{
  public static void main(String[] args) {
  List<String> dogType = new ArrayList<>();
  dogType.add("Chiwawa");
  dogType.add("Pomeranian");
  dogType.add("Bulldog");
  dogType.add("Akita");
  dogType.add("Poodle");
  
  ListPrinter<String> printer = new ListPrinter<>();
  printer.printAllElements(dogType);
  }

  public void printAllElements(List<E> list) {
    for (E element : list) {
        System.out.printf(
            "%d => %s %n"
            ,list.indexOf(element), element.toString()
        );
    }
  }

}