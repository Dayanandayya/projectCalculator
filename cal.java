class cal extends GeoArea{
            
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
        float operand_1=10;
        float operand_2=30;
        cal a= new cal();
       
        
        System.out.println("Add ="+a.add(20,10));
        System.out.println(" sub is="+a.sub(20,5));
        System.out.println("multi is  ="+a.prod(6,10));
        System.out.println("div is ="+a.div(20,10));
        
        double area_triangle =a.area_of_triangle(operand_1,operand_2);
        System.out.println("Area of Triangle is :" +area_triangle);
        
        double area_rectangle =a.area_of_rectangle(operand_1,operand_2);
        System.out.println("Area of Rectangle is :" +area_rectangle);
    }
}    


