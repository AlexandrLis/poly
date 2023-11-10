public class main1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bear bear = new Bear();

        cat.eating();
        bear.eating();

        // то же самое, но через функцию
        func(cat);
        func(bear);
    }

    // в параметре функции нужно указывать тип данных принимаемого элемента ->
    // func(String str), func(int x), func(double number)
    // таким образом, под каждый тип данных(Cat и Bear) нужно писать свою функцию

    // эта функия принимает тип данных Cat
    public static void func(Cat cat){
        cat.eating();
    }
    // эта функия принимает тип данных Bear
    public static void func(Bear bear){
        bear.eating();
    }
}
