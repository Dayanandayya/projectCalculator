class cal extends Math_oprs{
            
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
        float opr1=10;
        float opr2=20;
        cal a= new cal();
       
        
        System.out.println("Add ="+a.add(20,10));
        System.out.println(" sub is="+a.sub(20,5));
        System.out.println("multi is  ="+a.prod(6,10));
        System.out.println("div is ="+a.div(20,10));

        double squre =a.squre(opr1);
        System.out.println("Squre of Number  is :" +squre);
        
        double Min =a.Min(opr1,opr2);
        System.out.println("Minimum Number is :"+Min);
        double Max =a.Max(opr1,opr2);
        System.out.println("Maximum  Number is :"+Max);
        double power =a.power(opr1,opr2);
        System.out.println("Power of Number is :"+power);
        double Absolute =a.Absolute(opr1);
        System.out.println(" Absolute value is " +Absolute);
        double Round=a.Round(opr1);
        System.out.println("Round  to the nearest integer is:" +Round);
    
    }
}


