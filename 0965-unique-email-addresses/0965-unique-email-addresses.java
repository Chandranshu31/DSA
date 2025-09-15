class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String curr : emails) {
            StringBuilder sb = new StringBuilder();
            int i = 0;

            // process local name
            while (i < curr.length() && curr.charAt(i) != '@') {
                char c = curr.charAt(i);

                if (c == '+') {
                    // skip everything until '@'
                    while (i < curr.length() && curr.charAt(i) != '@') {
                        i++;
                    }
                    break;
                }

                if (c != '.') {
                    sb.append(c);
                }
                i++;
            }

            // append the domain (including '@')
            while (i < curr.length()) {
                sb.append(curr.charAt(i));
                i++;
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}

// we just need to normalise the local name accordingly and do the needful or count the unique number of emails in the set
