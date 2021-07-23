package MapExeDemo.SomeFunction;

public class SplitDemo {
    public static void main(String[] args) {
        /**
         * 声明一个字符串str1
         */
        String str1 = "ui78,8huh,jf87,uie8,ujkdf90,hu67ghj,894ghk";
        /**
         * 声明字符串数组str2
         */
        String[] str2 = str1.split(",");
        /**
         * 遍历字符串数组
         */
        for(int i = 0;i<str2.length;i++)
        {
            System.out.println("第" + i + "个：" + str2[i]);
        }

        System.out.println("\n" + "---------------------------------" + "\n");

        /**
         * 声明字符串数组str3
         */
        String[] str3 = str1.split(",",1);
        /**
         * 遍历字符串数组str3
         */
        for(int i = 0;i<str3.length;i++)
        {
            System.out.println("str3第" + i + "个：" + str3[i]);
        }

        System.out.println("\n" + "---------------------------------" + "\n");

        /**
         * 声明字符串数组str4
         */
        String[] str4 = str1.split(",",2);
        /**
         * 遍历字符串数组str4
         */
        for(int i = 0;i<str4.length;i++)
        {
            System.out.println("str4第" + i + "个：" + str4[i]);
        }

        System.out.println("\n" + "---------------------------------" + "\n");

        /**
         * 声明字符串数组str5
         */
        String[] str5 = str1.split(",",3);
        /**
         * 遍历字符串数组str5
         */
        for(int i = 0;i<str5.length;i++)
        {
            System.out.println("str5第" + i + "个：" + str5[i]);
        }

        System.out.println("\n" + "---------------------------------" + "\n");

        /**
         * 声明字符串数组str6
         */
        String[] str6 = str1.split(",",4);
        /**
         * 遍历字符串数组str6
         */
        for(int i = 0;i<str6.length;i++)
        {
            System.out.println("str6第" + i + "个：" + str6[i]);
        }

        System.out.println("\n" + "---------------------------------" + "\n");

        /**
         * 声明字符串数组str7
         */
        String[] str7 = str1.split(",",5);
        /**
         * 遍历字符串数组str7
         */
        for(int i = 0;i<str7.length;i++)
        {
            System.out.println("str7第" + i + "个：" + str7[i]);
        }

        System.out.println("\n" + "---------------------------------" + "\n");

        /**
         * 声明字符串数组str8
         */
        String[] str8 = str1.split(",",6);
        /**
         * 遍历字符串数组str8
         */
        for(int i = 0;i<str8.length;i++)
        {
            System.out.println("str8第" + i + "个：" + str8[i]);
        }

    }
}
