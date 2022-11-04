package Utils;

public class StringUtil {

    public static boolean isNotNullOrEmpty(String texto) {
        return texto != null && !texto.isEmpty();
    }
    public static String removeSinais(String texto) {
        return texto.replace(".", "").replace("-", "");
    }
}
