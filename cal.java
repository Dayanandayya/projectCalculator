class cal{
            
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
class mainclass extends cal{
    public static void main(String args[]){
        cal a= new cal();
        areaof_triangle b= new areaof_triangle();
        areasquare c= new areasquare();
        b.area_triangle();
        c.area_squre();
        
        System.out.println("Add ="+a.add(20,10));
        System.out.println(" sub is="+a.sub(20,5));
        System.out.println("multi is  ="+a.prod(6,10));
        System.out.println("div is ="+a.div(20,10));
        

    }
}

class areaof_triangle extends cal{
    void area_triangle(){
        int a=5, b=10;
        System.out.println("Area of Rectangle is " +0.5*a*b);

    }

    
}
class areasquare extends cal{
    void area_squre(){
        int r=10;
        System.out.println("Area of Squre is " +r*r);

    }

}
