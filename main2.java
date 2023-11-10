public class main2 {
    public static void main(String[] args) {
        // тут начинается полиморфизм

        // если я не хочу под кадый тип данных создавать свою функцию как в main1, то я
        // создаю универсальный тип данных Animal для каждого класса 
        // теперь cat является типом данных и Cat и Animal
        // а bear является типом данных и Bear и Animal
        Animal cat = new Cat();
        Animal bear = new Bear();

        // результат работы функции зависит от того, что я передам в параметр функции в 13 и 14 строках (cat или bear)
        function(cat);
        function(bear);
    }

    //с универсальным типом данных Animal не нужно под каждый тип данных писать свою функцию,
    // а можно написать одну единственную
    // создаю функцию для универсального типа данных
    public static void function(Animal animal){
        animal.eating();
    }
}
