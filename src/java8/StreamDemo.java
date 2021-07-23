package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Integer[] dd = { 1, 2, 3 };
        Stream<Integer> stream = Arrays.stream(dd);
        // map接收一个泛型接口，lambda表达式返回就是个接口类型
        stream.map(str -> Integer.toString(str)).forEach(str -> {
            System.out.println(str);// 1 ,2 ,3
            System.out.println(str.getClass());// class java.lang.String
        });

        List<Emp> list = Arrays.asList(new Emp("a"), new Emp("b"), new Emp("c"));
        // list元素类型是Emp类型
        list.stream().map(Emp::getName).forEach(System.out::println);

    }

    public static class Emp {
        private String name;

        public Emp() {
            super();
        }

        public Emp(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
