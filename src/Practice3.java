public class Practice3 {
    public static void main(String[] args) {
        String [] numbers = {
                "8-918-232-2323",
                "8-934-232-2323",
                "8-918-232-2323",
                "8-812-232-2323"
        };
        String value = "8-918";

        String singleNumber = "8-918-232-2323";
        System.out.println(singleNumber.contains(value));

        for (String number : numbers) {
            if (number.contains(value)) {
                System.out.println(number);
            }
        }

        String exactValue = "8-918-262-2323";
        boolean numberPresent = false;
        for (String number : numbers) {
            if (number.equals(exactValue)) {
                numberPresent = true;
                break;
            }
        }
        System.out.println("Number search result: " + numberPresent);
    }
}
