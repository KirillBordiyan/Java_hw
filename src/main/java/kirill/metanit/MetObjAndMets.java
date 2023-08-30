package kirill.metanit;

public class MetObjAndMets {
    public static void main(String[] args) {
        Person2 tom = new Person2("Tom");
        System.out.println(tom.toString()); //Person Tom @Override
        System.out.println(tom.hashCode()); // @Override

        System.out.println(tom.getClass()); // class kirill.metanit.Person2

        Person2 bob = new Person2("Bob");
        System.out.println(tom.equals(bob));
    }
}

class Person2 {
    private String name;
    Person2(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person " + name;
    }

    @Override
    public int hashCode(){
        return 10 * name.hashCode() + 110011;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person2)) return false;

        Person2 per = (Person2)obj;
        return this.name.equals(per.name); // == return bool
        //мы передаем сюда какой-то объект, неважно какого класса
        //потом проверяем, является ли он тем классом, который нужен, если нет false
        //в ином случае, мы создаем новый temp-объект per, который хранит в себе obj явно приведенный к классу Person2
        //и возвращаем результат, равно ли имя объекта (Person2) с именем того Object, приведенного к Person2
    }
}