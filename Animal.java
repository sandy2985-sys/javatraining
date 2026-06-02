package day.pkg7;
interface Animal{
void sound();
}
class Dog implements Animal{
public void sound(){
System.out.println("Bark");
}
}
class Cat implements Animal {
public void sound(){
System.out.println("Meow");
}
}


public class Day7 {

    
    public static void main(String[] args) {
        
Dog d = new Dog();
d.sound();
Cat c = new Cat();
c.sound();

    }
        // TODO code application logic here
    }