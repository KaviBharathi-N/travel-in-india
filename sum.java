import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        getPairsCount(a,k,n);
        }    public static void getPairsCount(int[] a,int k,int n){
        int count=0;
        for(int j=0;j<n;j++){
            for(int b=0;b<n;b++){
                if(a[j]+a[b]==k){
                    count++;
                }
            }
                    System.out.println(count);
                
            }
        }
    
    }