public class format {
    public static void toPotholeCase(String input) {
        int num = input.length();
        StringBuffer output = new StringBuffer();
        String change = input.toLowerCase();
        for (int i = 0; i < num; i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                output.append("_");
                output.append(change.charAt(i));
            } else if ('0' <= input.charAt(i) && input.charAt(i) <= '9') {
                output.append("_");
                output.append(input.charAt(i));
            } else {
                output.append(input.charAt(i));
            }
        }

        System.out.println(output);
    }

    public static void toCamelCase(String input) {
        int num = input.length();
        StringBuffer output = new StringBuffer();
        String change = input.toUpperCase();
        for (int i = 0; i < num; i++) {
            if (input.charAt(i) == '_') {
                i++;
                output.append(change.charAt(i));
            } else {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
