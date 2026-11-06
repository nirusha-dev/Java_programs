class KidsCandies {
    public static void main(String[] args) {
        int[] a = {2,3,5,1,3};
        int extra = 3;
        int max = 0;

        for(int i=0;i<a.length;i++) {
            if(a[i]>max) {
                max = a[i];
            }
        }

        for(int i=0;i<a.length;i++) {
            System.out.print((a[i]+extra>=max)+" ");
        }
    }
}

