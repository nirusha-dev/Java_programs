class FindNumbers {
    public static void main(String[] args) {
        int[] a = {12,345,2,6,7896};
        int count = 0;

        for(int i=0;i<a.length;i++) {
            int n = a[i];
            int digits = 0;

            while(n>0) {
                digits++;
                n = n/10;
            }

            if(digits%2==0) {
                count++;
            }
        }

        System.out.println(count);
    }
}