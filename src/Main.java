public class Main {
    public static void main(String[] args) {
        System.out.println("Выполнениия Заданий!");

        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog +4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);

        System.out.println("задание 3");

        dog = dog -3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend *2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog= frog +4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxer1Weight =78.2;
        System.out.println("Вес первого бойца " + boxer1Weight +"кг!");
        var boxer2Weight =82.7;
        System.out.println("Вес второго бойца "+ boxer2Weight + "кг!");
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общиий вес двух бойцов " +totalWeight + "кг!");

        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница веса " + weightDifference + "кг!");

        System.out.println("Задание 7");
        var weightWithdrawal = boxer2Weight - boxer1Weight;
        System.out.println("Первый способ " + weightWithdrawal + "кг!");
        var weightWithdrawal2 = boxer2Weight % boxer1Weight;
        System.out.println("Второй способ " + weightWithdrawal2 + "кг!");

        System.out.println("Задание 8");
        var totalTime = 640;
        System.out.println("Общее время " + totalTime + " часов");
        var oneEmployee = 8;
        System.out.println("Каждый сотрудник посвящает работе " + oneEmployee + " часов");
        var numberEmployees = totalTime / oneEmployee;
        System.out.println("Всего работников в компании – " + numberEmployees + " человек");

        System.out.println("Подзадача");
        numberEmployees = numberEmployees + 94;
        System.out.println("Колличество работников " + numberEmployees);
        var numberHours = totalTime / numberEmployees;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + numberHours + " часа работы может быть поделено между сотрудниками" );


    }
}