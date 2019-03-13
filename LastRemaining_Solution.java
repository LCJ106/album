package  com.company;
public  class Main{
    public void JoseHus(int m,int n){
        int a=0;
        for(int i=2;i<=m;i++){
            a=(a+n)%i;
        }
        System.out.println(a);
    }
    public  static  void main(String[] args){
        new Main().JoseHus(7,3);
    }
}
