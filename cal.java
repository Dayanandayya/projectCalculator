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
class mainclass{
    public static void main(String args[]){
        cal a= new cal();
        int b;
        extendArthmetic c=new extendArthmetic();
        c.squre(20);
        c.cube(20);
       
        
        System.out.println("Add ="+a.add(20,10));
        System.out.println(" sub is="+a.sub(20,5));
        System.out.println("multi is  ="+a.prod(6,10));
        System.out.println("div is ="+a.div(20,10));
        

    }
}


