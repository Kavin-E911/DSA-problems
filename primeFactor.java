import java.util.*;
class primeFactor{
    public static void main(String[] args) {
        int n=49;//735134400;
        List<Integer> ls=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                ls.add(i);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<ls.size();i++){
            int m=(int)Math.sqrt(ls.get(i));
            if(m*m==ls.get(i)){
                list.add(ls.get(i));
           
            }
        }
    
        int count=0;
        for(int i:ls){
            boolean boo=true;
            for(int j:list){
                if(i%j==0){
                    boo=false;
                    break;
                }
            }
            if(boo){
                count++;
            }
        }
        System.out.println(count);
    }
}