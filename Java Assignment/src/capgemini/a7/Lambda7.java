package capgemini.a7;

import java.util.ArrayList;

public class Lambda7 {
	public static void main(String[] args) {
        ArrayList<String> replace = new ArrayList<>();
        replace.add("Mumbai");
        replace.add("Delhi");
        replace.add("Odisha");
        replace.add("Hybd");
        replace.add("MP");

      replace.replaceAll((String) ->
             String.equals(replace) ? String:String.toUpperCase()); //replacing replace elements to uppercase//

        System.out.println(replace); //printing words after changing to upper case
    }
}
