public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        System.out.println("Задача 1");
        // Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        // при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством месяцев,
        // которое необходимо для накопления данной суммы. Формат сообщения:
        // «Месяц …, сумма накоплений равна … рублей» .
        int accumulation = 2_459_000;
        int total = 0;
        int salary = 15_000;
        double percent = 1D / 100;
        int s = 0;
        while (total < accumulation) {
            total += salary;
            total = (int) (total * (1 + percent));
            s++;
            System.out.println("Месяц " + s + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("Задача 2");
        // Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующим:
        int numA = 0;
        while (numA < 10) {
            numA++;
            System.out.print(numA + " ");
        }
        System.out.println("\n");
        for (; numA >= 1; numA--) {
            System.out.print(numA + " ");
        }
        System.out.println("\n");

        System.out.println("Задача 3");
        // В стране Y население — 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате:
        // «Год …, численность населения составляет …».
        int countryY = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            countryY += countryY * birthRate / 1000 - countryY * mortalityRate / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }
        System.out.println();

        System.out.println("Задача 4");
        // Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        // Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
        // а всегда равен 7%.
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        percent = 7D / 100;
        total = salary;
        accumulation = 12_000_000;
        s = 0;
        while (total < accumulation) {
            total = (int) (total * (1 + percent));
            s++;
            System.out.println("Месяц " + s + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("Задача 5");
        // Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
        // а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        double moneyT = 15_000;
        double totalMT = 0;
        int a = 1;
        for (; totalMT < 12_000_000; a++) {
            totalMT = (totalMT + (totalMT * 0.07));
            totalMT = totalMT + moneyT;
            if (a % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.%n", a, totalMT);
            }
        }
        System.out.println();

        System.out.println("Задача 6");
        // Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать,
        // какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        //Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
        //Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
        double moneyTv = 15_000;
        double totalMTv = 0;
        int c = 0;
        while (c < 108) {
            c++;
            totalMTv = (totalMTv + (totalMTv * 0.07));
            totalMTv = totalMTv + moneyTv;
            if (c % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.%n", c, totalMTv);
            }
        }
        System.out.println();

        System.out.println("Задача 7");
        // В компании пятница — отчетный день.
        //Нужно написать программу, которая считает дни месяца по датам, определяет,
        // какой день — пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Создайте переменную типа int, которая хранит в себе число,
        // выпадающее на первую пятницу месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        // «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //В нашем месяце 31 день.
        // В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
        int friday = 5;
        int month = 31;
        int b = friday;
        while (b < month) {
            b++;
            if (b % 7 == 0) {
                System.out.println("Сегодня пятница, " + b + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();

        System.out.println("Задача 7 №2");
        int friday2 = 6;
        int day = 5;
        for (day = friday2; day <= 31; day +=7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача 8");
        // Нам нужно написать астрономическое приложение, которое считает,
        // когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        // а также следующий год ее появления (ближайшие 100 лет).
        //Для вычисления периода можно создать две дополнительные переменные,
        // которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        // в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоли должен получиться следующий результат:
        //1896
        //1975
        //2054
        int yearMax = 2054;
        int d = yearMax - 200;
        while (d < yearMax) {
            d++;
            if (d % 79 == 0)
                System.out.println(d);
        }

    }
}