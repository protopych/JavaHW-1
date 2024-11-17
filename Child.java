class Child extends Parent{
    
    static{
        System.out.println("Child:static 1");
    }

    {
        System.out.println("Child:instance 1");
    }

    static{
        System.out.println("Child:static 2");
    }

    Child()
    {
        super();
        System.out.println("Child:constructor");
    }

    Child(String Name)
    {
        super(Name);
        System.out.println("Child:name-constructor");
    }

    {
        System.out.println("Child:instance 2");
    }
}