public class Main{
    public static void main(String[] args) {
        // Dog sınıfından bir nesne oluşturuyoruz.
        Dog dog = new Dog();
        // Üst sınıftan miras alınan 'name' özelliğine erişebiliyoruz.
        dog.name = "mike ";
        System.out.println(dog.name);
        dog.eat();
        dog.Bark();
    }
}