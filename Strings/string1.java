package DSA.Strings;

public class string1 {
    public static void main(String[] args) {
//        String a = "Aayush";
//        String b = "Aayush";
//        System.out.println(a==b); //-- > true

//        String a = new String("Aayush");
//        String b = new String("Aayush");
//        System.out.println(a==b); //--> false
//        System.out.println(a.equals(b)); //-->true

//        System.out.println(56);
//        System.out.println("kunal");
//        System.out.println(new int[]{2, 3, 4});
//
//        String name = null; 
//        System.out.println(name);

//        System.out.println((char)('a'+3));

        System.out.println('a'+'b');

//        Preety printing
//        System.out.println(Math.PI);
//        System.out.printf("The value of pie is %.3f \n",Math.PI); // takes only 3 decimals

        // perfomance
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a'+i);
//            System.out.println(ch);
//        }
//        or
//        down ex is better if you want to check string builder
//        String series = " ";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a'+i);
//            series+=ch;
//        }
//        System.out.println(series);

        //Stringbuilder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.delete(3,5);
        System.out.println(builder);
        System.out.println("  kunal   ".strip());
        System.out.println("  kunal   ");

        


    }
}
