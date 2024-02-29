package task_day8;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class upperCase {

    public static void main(String[] args) {
        List<String> streamNames = Stream.of("aBc", "d", "eF")
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());

  
        streamNames.forEach(System.out::println);
    }
}
