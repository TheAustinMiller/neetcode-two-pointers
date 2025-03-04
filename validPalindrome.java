public boolean isPalindrome(String s) {
        char[] letters = s.toCharArray();
        ArrayList<Character> f = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetterOrDigit(letters[i])) {
                letters[i] = Character.toLowerCase(letters[i]);
                f.add(letters[i]);
            }
        }
        int first = 0;
        int last = f.size() - 1;
        while (first < last) {
            if (f.get(first) != f.get(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
