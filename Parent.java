abstract class Parent{
    private String Name;

    static{
        System.out.println("Parent:static 1");
    }

    {
        System.out.println("Parent:instance 1");
    }

    static{
        System.out.println("Parent:static 2");
    }

    Parent()
    {
        System.out.println("Parent:constructor");
    }

    {
        System.out.println("Parent:instance 2");
    }

    Parent(String Name)
    {
        System.out.println("Parent:name-constructor");
        this.Name = Name;
    }

}