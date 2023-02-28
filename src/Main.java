import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Integer[] array = {1,2,3,4,5};
//        Stream.of(array).forEach(c-> System.out.println(c));

//        List<Integer> list = new ArrayList<>();
//        list = List.of(1,2,3,4,5);
//        list.stream().forEach(System.out::println);

//        Integer[] massiv = {5,4,2,6,5,8,2,4,7};
//        Stream.of(massiv).forEach(s -> System.out.println(s*s)); // arbir massivdi oz ozuno koboitot(s*s)

//        List<String> strings = new ArrayList<>();
//        strings.add("Malika");
//        strings.add("Gulnur");
//        strings.add("Nurisa");
//        strings.stream().map(s -> s.equals("Malika") ? s.toUpperCase(): s).forEach(System.out::println);

//        Integer[] array = {10,100,200,300};
//        Stream.of(array).map(s -> s*0.1).forEach(System.out::println); // 10%tin chygaryp beret

        ArrayList<Student> students = new ArrayList<>();
        Random ran = new Random();
        students.add(new Student(1, "Jeenbekov", "Sooronbai", 1958, ran.nextInt(2,5)));
        students.add(new Student(2, "Japarov", "Sadyr", 1968, ran.nextInt(2,5)));
        students.add(new Student(3, "Atambaev", "Almaz", 1956, ran.nextInt(2,5)));
        students.add(new Student(4, "Akaev", "Askar", 1950, ran.nextInt(2,5)));
        long s = students.stream().filter(x -> x.getGrade()==2).count();
        System.out.println(s);
//        students.stream().map(m ->m.getLastName()).forEach(System.out::println);

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Tom");
//        arrayList.add("Jerry");
//        arrayList.stream().map(n -> n+n).forEach(System.out::println);

//        List<Integer> integers = new ArrayList<>();
//        Integer[] array = {78,98,62,45,2,3,4};
//        integers = Stream.of(array).map(s -> s%3==0? 0: s*10).collect(Collectors.toList());
//        integers.forEach(System.out::println);

    }
}