class Solution {
    public int romanToInt(String s) {
        int c = 0, arr[] = new int[s.length()], j = 0;
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
               default:
                    arr[i] = 1000;
                    break;
            }
        }
        
        for (j = 0; j < s.length() - 1; j++) {
            if (arr[j] < arr[j + 1]) c -= arr[j];
            else c += arr[j];
        }
        c += arr[j];
        return c;
    }
}
