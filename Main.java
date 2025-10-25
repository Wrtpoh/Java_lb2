import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("=== Задача 1 ===");
//        Name name = new Name();
//        name.inputFromKeyboard(sc);
//        name.show(); // • Клеопатра;	• Пушкин	Александр	Сергеевич; • Маяковский	Владимир
//// ---------------------------------------------------
//
//        System.out.println("\n=== Задача 2 ===");
//        Name[] names = new Name[3];
//        Person[] persons = new Person[3];
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("\nВведите данные для человека #" + (i + 1));
//
//            System.out.print("Фамилия (можно оставить пустым): ");
//            String lastName = sc.nextLine().trim();
//            if (lastName.isEmpty()) lastName = null;
//
//            String firstName;
//            while (true) {
//                System.out.print("Имя (обязательно): ");
//                firstName = sc.nextLine().trim();
//                if (!firstName.isEmpty()) break;
//                System.out.println("Имя не может быть пустым, попробуйте снова:");
//            }
//
//            System.out.print("Отчество (можно оставить пустым): ");
//            String middleName = sc.nextLine().trim();
//            if (middleName.isEmpty()) middleName = null;
//
//            int height;
//            while (true) {
//                System.out.print("Введите рост (целое положительное число): ");
//                try {
//                    height = Integer.parseInt(sc.nextLine().trim());
//                    if (height > 0) break;
//                    System.out.println("Рост должен быть положительным числом!");
//                } catch (NumberFormatException e) {
//                    System.out.println("Некорректный ввод. Попробуйте снова.");
//                }
//            }
//
//            names[i] = new Name(lastName, firstName, middleName);
//            persons[i] = new Person(names[i], height);
//        }
//
//        System.out.println("\nСписок созданных людей:");
//        for (Person p : persons) {
//            System.out.println(p);
//        } // • Человека	с	Именем	Клеопатра	и	ростом	152
//        // • Человека	с	Именем	Пушкин	Александр	Сергеевичи	ростом	167
//        // • Человека	с	Именем	Маяковский	Владимир	и	ростом	189
//// ---------------------------------------------------
//        System.out.println("\n=== Задача 3 ===");
//        Person[] people = new Person[3];
//
//        for (int i = 0; i < people.length; i++) {
//            System.out.println("\nВведите данные для человека #" + (i + 1));
//
//            Name n = new Name();
//            n.inputFromKeyboard(sc);
//
//            int height;
//            while (true) {
//                System.out.print("Рост (целое положительное число): ");
//                try {
//                    height = Integer.parseInt(sc.nextLine().trim());
//                    if (height > 0) break;
//                    System.out.println("Рост должен быть положительным числом!");
//                } catch (NumberFormatException e) {
//                    System.out.println("Ошибка: введите число.");
//                }
//            }
//
//            people[i] = new Person(n, height);
//        }
//
//        System.out.println("\n=== Установка родственных связей ===");
//        if (people.length >= 3) {
//            people[1].setFather(people[0]); // первый — отец второго
//            people[2].setFather(people[1]); // второй — отец третьего
//        }
//
//        System.out.println("\n=== Результаты ===");
//        for (Person p : people) {
//            System.out.println(p);
//        } // 1. Создать	людей:	Чудова	Ивана,	Чудова	Петра,	Бориса
//        // 2. Сделать	Ивана	отцом	Петра,	а	Петра	отцом	Бориса
// ---------------------------------------------------

        System.out.print("\n=== Задача 4 ===");
        System.out.print("Сколько городов вы хотите создать? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        List<City> cities = new ArrayList<>();

        // Ввод названий городов
        for (int i = 0; i < n; i++) {
            System.out.print("Введите название города #" + (i + 1) + ": ");
            String cityName = sc.nextLine().trim();
            cities.add(new City(cityName));
        }

        // Ввод дорог
        System.out.println("\nТеперь создадим пути между городами.");
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            System.out.print("Сколько дорог из города " + city.getName() + "? ");
            int m = Integer.parseInt(sc.nextLine().trim());

            for (int j = 0; j < m; j++) {
                System.out.print("Введите название города назначения: ");
                String destName = sc.nextLine().trim();
                City destCity = null;
                for (City c : cities) {
                    if (c.getName().equalsIgnoreCase(destName)) {
                        destCity = c;
                        break;
                    }
                }
                if (destCity == null) {
                    System.out.println("Город не найден, пропускаем путь.");
                    continue;
                }

                System.out.print("Введите стоимость пути: ");
                int cost = Integer.parseInt(sc.nextLine().trim());
                city.addPath(destCity, cost);
            }
        }

        System.out.println("\n=== Карта городов ===");
        for (City city : cities) {
            System.out.println(city);
        } // A -> B:5, F:1, D:6
        // B -> C:3
        // C -> B:3, D:4
        // D -> C:4, A:6, E:2
        // E -> 0
        // F -> E:2, B:1
// ---------------------------------------------------

        System.out.print("\n=== Задача 5 ===");
        System.out.print("Сколько имен вы хотите ввести? ");
        int k = Integer.parseInt(sc.nextLine().trim());

        Name1[] names1 = new Name1[k];

        for (int i = 0; i < k; i++) {
            System.out.println("\nВведите данные для имени #" + (i + 1));
            Name1 name1 = new Name1();
            name1.inputFromKeyboard(sc);
            names1[i] = name1;
        }

        System.out.println("\n=== Введённые имена ===");
        for (Name1 name1 : names1) {
            System.out.println(name1);
        } // 1. Клеопатра
        // 2. Александр	Сергеевич	Пушкин
        // 3. Владимир	Маяковский
        // 4. Христофор	Бонифатьевич	(здесь	Христофор	это	имя,	а	Бонифатьевич	-	фамилия)

// ---------------------------------------------------

        System.out.println("\n=== Задача 6 ===");
        System.out.print("Сколько людей вы хотите создать? ");
        int f = Integer.parseInt(sc.nextLine().trim());

        Person1[] people1 = new Person1[f];

        for (int i = 0; i < f; i++) {
            System.out.println("\n=== Ввод данных для человека #" + (i + 1) + " ===");

            // Ввод имени через Name1
            Name1 name2 = new Name1();
            name2.inputFromKeyboard(sc);

            // Ввод роста
            int height;
            while (true) {
                System.out.print("Введите рост (целое положительное число): ");
                try {
                    height = Integer.parseInt(sc.nextLine().trim());
                    if (height > 0) break;
                    System.out.println("Рост должен быть положительным!");
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод, попробуйте снова.");
                }
            }

            // Выбор отца (по индексу ранее созданных людей)
            Person1 father = null;
            if (i > 0) {
                System.out.print("У этого человека есть отец среди предыдущих? (введите номер от 1 до " + i + ", 0 - нет): ");
                int fatherIndex = Integer.parseInt(sc.nextLine().trim());
                if (fatherIndex > 0 && fatherIndex <= i) {
                    father = people1[fatherIndex - 1];
                }
            }

            // Создаем человека
            if (father != null) {
                people1[i] = new Person1(name2, height, father);
            } else {
                people1[i] = new Person1(name2, height);
            }
        }

        System.out.println("\n=== Список созданных людей ===");
        for (int i = 0; i < people1.length; i++) {
            System.out.println((i + 1) + ". " + people1[i]);
        } // 1. Человека	с	именем	Лев	(в	виде	строки)	и	ростом	170
        // 2. Человека	с	именем	Пушкин	Сергей	(как	Имя),	ростом	168
        // и	отцом	Львом	(предыдущий	Человек)
        // 3. Человека	с	именем	Александр	(в	виде	строки),
        // ростом	167	и	отцом	Сергеем	(предыдущийmЧеловек)


        // ---------------------------------------------------
        System.out.println("\n=== Задача 7 ===");

        System.out.print("Введите имя кота: ");
        String catName = sc.nextLine().trim();
        while (catName.isEmpty()) {
            System.out.print("Имя кота не может быть пустым. Введите имя снова: ");
            catName = sc.nextLine().trim();
        }

        Cat cat = new Cat(catName);

        System.out.println(cat);

        cat.meow();

        System.out.print("Сколько раз кот должен помяукать? ");
        int v;
        while (true) {
            try {
                v = Integer.parseInt(sc.nextLine().trim());
                if (v > 0) break;
                System.out.print("Введите положительное число: ");
            } catch (NumberFormatException e) {
                System.out.print("Некорректный ввод. Введите число: ");
            }
        } // “Барсик” 1,3
        cat.meow(v);

        sc.close();
    }
}
