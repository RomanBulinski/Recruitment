public class BracketChecker {

    public static Boolean areBracecketCorrect(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length()+1; i++) {
            if(s.contains("()")){
                s = s.replace("()", "");
            }
            if(s.contains("{}")){
                s = s.replace("{}", "");
            }
            if(s.contains("[]")){
                s = s.replace("[]", "");
            }
            System.out.println("resul : "+s);
        }

        if (s.length() > 0) {
            return false;
        }
        return true;
    }


}
