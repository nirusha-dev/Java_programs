class ShuffleArray {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,4,7};
        int n = 3;
        int[] b = new int[2*n];

        for(int i=0;i<n;i++) {
            b[2*i] = a[i];
            b[2*i+1] = a[i+n];
        }

        for(int i=0;i<b.length;i++) {
            System.out.print(b[i]+" ");
        }
    }
}
