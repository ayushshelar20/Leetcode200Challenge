class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        String ans = "";
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int c1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int c2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = c1 + c2 + carry;

            ans += (sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return new StringBuilder(ans).reverse().toString();
    }
}