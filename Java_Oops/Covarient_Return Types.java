class Cov
{
    public static void main(String[] args) {
    
        a A = new A();
        System.out.println(a.get()); // returning the current instance  ;)
        
        b B = new B();
        System.out.println(B.get()); // method is overridden , it is returning the current object i.e B 

        new b().get().hello();   // new keyword instantiating a b class object, " new b()" ( just like normal calling definition) 
                                // then calling the get method , returning the current object ( with no reference variable assigned)
                                // then calling the method hello(), Using that. 

    }
}
class a
{
    a get()
    {
        return this;
    }
}
class b extends a 
{
    @Override // Annotations are used by Compiler or JVM to give additional information about classes or methods or interfaces
            // Helps to avoid any mistakes  
    b get()
    {
        return this; // this will return a b class object but Overriding the Parent objects method
    }
    void hello()
    {
        System.out.println("This method is called . but no reference object is there..!! fun ");
    }
}
