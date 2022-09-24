import java.util.*;
import java.util.stream.Collectors;

public class Osnovnoy {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        boolean flag = false;
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов тебе надо? ");
        while (!flag) {
            sort(sc,list,map);
            break;
        }
    }

    static void sort(Scanner sc, List<String> list, HashMap<Integer, List<String>> map){
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Введи " + (i + 1) + " слово: ");
            list.add(sc.next());
        }
        for (int i = 1; i < 1000; i++) {
            if (list.size() > 0) {
                int pp = i;
                map.put(i, list.stream().filter(t -> t.length() == pp).toList());
                list = list.stream().filter(t -> t.length() > pp).collect(Collectors.toList());
                if (map.get(i).size() == 1) {
                    map.remove(i);
                }
            } else {
                break;
            }
        }
        System.out.println(map);
    }
}