//https://www.hackerrank.com/challenges/java-static-initializer-block

static int B,H;
static boolean flag;
 static{
     Scanner scn=new Scanner(System.in);
     B=scn.nextInt();
     H=scn.nextInt();
     if(B<=0 || H<=0){
         flag=false;
         System.out.println("java.lang.Exception: Breadth and height must be positive");
     }
     else{
         flag=true;
     }
 }