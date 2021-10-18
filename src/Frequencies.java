 class Frequencies {
    static void frequencies(int a[],int n){
        int fre =1;
        int i=1;
        while(i<n){
            while(i<n && a[i]==a[i-1]){
                fre++;
                i++;
            }
            System.out.println(a[i-1] + " " + fre);
            i++;
            fre=1;
        }
        if(n==1 || a[n-1] != a[i-2]){
            System.out.println(a[i-1] + " " + i);
        }

    }
    public static void main(String args[]){
        int a[] = {10,10,10,30,30,50};
        int n =6;
        frequencies(a,n);
    }
}
