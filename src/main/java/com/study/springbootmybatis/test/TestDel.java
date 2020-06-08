package com.study.springbootmybatis.test;

//sadjnaisnbdiusanm
/**
 * TestDel
 * <p>
 * <p><a href="TestDel.java.html"><i>View Source</i></a></p>
 *
 * @author <a href="mailto:afteryuan@gmail.com">Spires</a>
 * @version 1.0
 */
public class TestDel {
    public static void main(String[] args) {
        //        Set strings = new TreeSet<>();
        //        strings.add("a");
        //        strings.add("b");
        //        strings.add("s");
        //        strings.add("a");
        //        strings.add("d");
        //        strings.add("s");
        //        strings.add("t");
        //        Iterator iterator = strings.iterator();
        //        while (iterator.hasNext()){
        //            System.out.println(iterator.next());
        //        }
        //        Set<String> set = new HashSet<>();
        //        set.add("20180101");
        //        set.add("20180102");
        //        set.add("20180103");
        //        set.add("20180104");
        //        set.add("20180105");
        //
        //        Set<String> sortSet = new TreeSet<String>((o1, o2) -> o2.compareTo(o1));
        //        sortSet.addAll(set);
        //        System.out.println(set.toString());
//        Set<CustomString> customStrings = new TreeSet<CustomString>();
//        CustomString aaa = new CustomString("aaa");
//        CustomString ccc = new CustomString("ccc");
//        CustomString bbb = new CustomString("bbb");
//        CustomString ddd = new CustomString("ddd");
//        CustomString bbb1 = new CustomString("bbb");
//        customStrings.add(aaa);
//        customStrings.add(ccc);
//        customStrings.add(bbb);
//        customStrings.add(ddd);
//        customStrings.add(bbb1);
//        Iterator<CustomString> iterator = customStrings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        test1();
    }

    public static void test1() {
        CustomString abc = new CustomString("abc", 1);
        CustomString abc2 = new CustomString("abc", 1);
        System.out.println(abc == abc2);
        System.out.println(abc.equals(abc2));
        System.out.println(abc.equals(abc2));
        System.out.println(abc.equals(abc2));
        System.out.println(abc.equals(abc2));
        System.out.println(abc.equals(abc2));
    }

    private static class CustomString implements Comparable<CustomString> {
        private String str;
        private Integer num;

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }


        public CustomString(String str, Integer num) {
            this.str = str;
            this.num = num;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof CustomString)) return false;
//
//            CustomString that = (CustomString) o;
//
//            if (str != null ? !str.equals(that.str) : that.str != null) return false;
//            return num != null ? num.equals(that.num) : that.num == null;
//        }

        @Override
        public int hashCode() {
            int result = str != null ? str.hashCode() : 0;
            result = 31 * result + (num != null ? num.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(CustomString o) {
//            return -1; //-1表示放在红黑树的左边,即逆序输出
//            return 1;  //1表示放在红黑树的右边，即顺序输出
            //return o;  //表示元素相同，仅存放第一个元素
            int i = this.str.compareTo(o.str);
            return i;
        }
    }
}
