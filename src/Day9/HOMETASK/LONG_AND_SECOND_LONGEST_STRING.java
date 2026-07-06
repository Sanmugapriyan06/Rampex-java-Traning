package Day9.HOMETASK;

public class LONG_AND_SECOND_LONGEST_STRING {
    public static void main(String[] args) {
        String[] arr = {"Java", "Programming", "Code", "Developer", "AI"};

        String longest = "";
        String secondLongest = "";

        for (String str : arr) {
            if (str.length() > longest.length()) {
                secondLongest = longest;
                longest = str;
            } else if (str.length() > secondLongest.length() &&
                    str.length() < longest.length()) {
                secondLongest = str;
            }
        }

        System.out.println("Longest String: " + longest);
        System.out.println("Second Longest String: " + secondLongest);
    }

}

