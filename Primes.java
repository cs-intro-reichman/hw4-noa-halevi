public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        for(int i=2; i<n+1; i++){
            isPrime[i]=true;          
        }
        for(int p = 2; p<Math.sqrt(n); p++){
            if(isPrime[p]){
                for (int j = p * p; j <= n; j += p) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count=0;
        for(int i=2; i<n; i++){
            if(isPrime[i] == true){
                System.out.println(i);
                count++;
            } 
        }
        double percentage = (count*100)/n;
        System.out.println("There are " + 10 + " primes between 2 and " + n + " (" + (int) percentage + "% are primes)");
       
          } 
    }
