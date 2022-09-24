import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Number2 {
    public static void main(String[] args) {
        List<Short> list = new ArrayList<>(List.of((short)4, (short)7, (short)9));
        Set<Integer> set = new HashSet<>(list.stream().filter(t -> t > 10).map(i -> i+15).collect(Collectors.toSet()));
        for (Integer s : set) {
            System.out.println(s);
        }
    }
}