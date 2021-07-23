package MapExeDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stream_Reduce {
    public static void main(String[] args) {
        // 按行读取配置文件:
        List<String> props = Arrays.asList("profile=native", "debug=true", "logging=warn", "interval=500");
        Map map = props.stream()
                // 把k=v转换为Map[k]=v:
                .map(kv -> {
                    // split()第二个参数指定返回最后数组的长度，这里指定为2，只存每次的k,v
                    String[] ss = kv.split("\\=", 2);
                    Map<String, String> m = new HashMap<>();
                    m.put(ss[0], ss[1]);
                    return m;
                })
                // 把所有Map聚合到一个Map.reduce()的第一个参数是初始值，是流的第一个元素，reduce操作流是从第二个元素开始的
                // 第一个参数是第一个元素，后面都是基于第一个开始追加操作,m,kv都是流里面的元素，m从第二个元素开始，在上次基础上叠加
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    // putALL把两个map合并，key相同的话后面的覆盖前面的
                    // 输出;本次操作
                    // {}-{profile=native}
                    //本次操作{profile=native}-{debug=true}
                    //本次操作{profile=native, debug=true}-{logging=warn}
                    //本次操作{logging=warn, profile=native, debug=true}-{interval=500}
                    System.out.println("本次操作"+m+"-"+kv);
                    m.putAll(kv);
                    return m;
                });
        // 打印结果:
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
