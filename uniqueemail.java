/*Unique Email Addresses */
import java.util.HashSet;
import java.util.Set;

public class uniqueemail {

    // Function to count unique email addresses
    public static int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replace(".", "");
            String normalizedEmail = local + "@" + domain;
            set.add(normalizedEmail);
        }

        return set.size();
    }

    public static void main(String[] args) {

        String[] emails = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };

        int result = numUniqueEmails(emails);

        System.out.println("Number of unique emails: " + result);
    }
}
