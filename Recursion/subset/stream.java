package DSA.Recursion.subset;

public class stream {
    public static void main(String[] args) {
        // remove the all 'a' from the up and return p with bccd as a answer
        skip("","baccad");
        // doing same question where we pass only one argument
        System.out.println(skip("baccad"));
        // Q2.
        System.out.println(skipApple("bdapplefg"));
        //Q3.
        System.out.println(skipAppNotApple("bdappefg"));
    }
    static void skip(String p, String up){
        // p= processed ; up = unprocessed
        if (up.isEmpty()){
            System.out.println(p);
            return; // Stops the execution of the method here
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1)); //take p as it is and remove one char from start taking substring(1)
        } else {
            skip(p+ch,up.substring(1)); // take the char(which is not a) and remove one char from start taking substring(1)
        }
    }

    // doing same question where we pass only one argument
    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return skip(up.substring(1)); //take p as it is and remove one char from start taking substring(1)
        } else {
            return ch + skip(up.substring(1)); // take the char(which is not a) and remove one char from start taking substring(1)
        }
    }

    // Q2. skip a string
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5)); //in this case remove the first 5
        } else {
            return up.charAt(0) + skipApple(up.substring(1)); // take the char(which is not a) and remove one char from start taking substring(1)
        }
    }

    // skip app only if it is not apple and appp is present
    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3)); //in this case remove the first 3
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1)); // take the char(which is not a) and remove one char from start taking substring(1)
        }
    }
}
