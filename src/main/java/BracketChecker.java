public class BracketChecker {

    public Boolean areBracecketCorrect() {

        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length()/2; i++) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        if (s.length() > 0) {
            return false;
        }
        return true;
    }

}
