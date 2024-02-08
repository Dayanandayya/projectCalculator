class cal extends Arthmetic_oprs{
            
    public int add(int a,int b)
    {
        return a+b;
    }
    public  int sub(int a,int b)
    {
        return a-b;
    }
    public int prod(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }

    

    
}
class mainclass{
    public static void main(String args[]){
        float opr1 =5;
        float opr2 =6;
        cal a= new cal();
       
        
        System.out.println("Add ="+a.add(20,10));
        System.out.println(" sub is="+a.sub(20,5));
        System.out.println("multi is  ="+a.prod(6,10));
        System.out.println("div is ="+a.div(20,10));
        double squre =a.squre(opr1);
        System.out.println("Squre of Number  is :" +squre);
        
        double cube =a.cube(opr1);
        System.out.println("Cube Number is :"+cube);
        double module =a.module(opr1,opr2);
        System.out.println("module of  Number is :"+module);
        double power =a.power(opr1,opr2);
        System.out.println("Power of Number is :"+power);

    }
}


