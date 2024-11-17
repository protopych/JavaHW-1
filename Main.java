public class Main
{
    public static void main(String args[])
    {
        System.out.println("Создание Child():");
        Child emptyChild = new Child();
        System.out.println("\nСоздание Child(\"Ivan\"):");
        Child nameChild = new Child("Ivan");
    }
}
/*
Создание Child():
Parent:static 1
Parent:static 2
Child:static 1
Child:static 2
Parent:instance 1
Parent:instance 2
Parent:constructor
Child:instance 1
Child:instance 2
Child:constructor

Создание Child("Ivan"):
Parent:instance 1
Parent:instance 2
Parent:name-constructor
Child:instance 1
Child:instance 2
Child:name-constructor

Выводы:
    Cтатические инициализаторы вызывываются самыми первыми при загрузке класса только один раз;
    Нестатические инициализаторы вызываются перед конструктором класса, 
    если рассматриваемый класс унаследован от родителя, сначала происходит инициализация родительского класса ( super() ), после —
    инициализация дочернего.
*/