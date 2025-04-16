public class Vargs{

    public static void sum(int...arr){
            int result =0;
            for(int a:arr){
                result +=result;
            }
            System.out.println("the value of the sum of numbers are: "+ result);
        }

        public static void characFun(String x,String...arr){
            String endvalue=x;
            for(String i:arr){
                endvalue +=i;
            }
            System.out.println("the appended string is :"+endvalue);
        }

    public static void main(String args[]){
        sum(1,2,3);
        characFun("char", "varchar","int","double","float");
        sum(1,2,3,4,5,6);
        characFun("Hello ! ", " This "," side "," RISHI "," RATHI ");
    }
}