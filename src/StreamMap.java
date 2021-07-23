import java.util.Arrays;

public class StreamMap {
    public static void main(String[] args) {
        String[] strs = { "aaa", "bbb", "ccc" };
        // 返回三个数组引用，因为split()方法分割字符后返回类型是数组类型的，结果就会返回一个数组类型的Stram
        Arrays.stream(strs).map(str -> str.split("")).forEach(System.out::println);
        // aaabbbccc,flatMap再创建一个新流把每个引用流式展开，就是相当于list.stream这样，新的流赋值回给旧的流，相当于合并成一个流
        Arrays.stream(strs).map(str -> str.split("")).flatMap(Arrays::stream).forEach(System.out::println);


    }
}
