package edu.dmacc.codedsm.hw20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<String> zoo = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");
        List<Integer> nameLength = zoo.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(nameLength);


        List<String> zood = zoo.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
        System.out.println(zood);

        Integer sum = zoo.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
        System.out.println(sum);





    }
}
