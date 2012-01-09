class JavaApp {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.setName("dogie");

        Animal myCat = new Cat();
        myCat.setName("catty");

        myDog.noise();
        myDog.eat();

        myCat.noise();
        myCat.eat();
    }
}

class Animal {

    protected String name;

    void noise() {
        System.out.println("animal make noise");
    }

    void eat() {
        System.out.println("animal is eating");
    }

    void setName(String na) {
        this.name = na;
    }
}

class Dog extends Animal {

    @Override
    void noise() {
        System.out.println(name + " dog make noise");
    }

    @Override
    void eat() {
        System.out.println(name + " dog is eating");
    }
}

class Cat extends Animal {

    @Override
    void noise() {
        System.out.println(name + " cat make noise");
    }

    @Override
    void eat() {
        System.out.println(name + " cat is eating");
    }
}