package homework4;

import java.sql.SQLOutput;
import java.util.Random;

class Reader {
    public static void main(String[] args) {

       Book book = new Book("Сегун", "Nekrasov", 388, 88);
        Book book1 = new Book("Демиан", "OSTIN", 3, 3);
        Book book2 = new Book("Собачье сердце", 55);
        Book book3 = new Book("ВАСЯиМАША");

        Book[] randombook = {book, book1, book2, book3};  // поместил мои объекты в массив
        Book choiceBook = choiceBook(randombook);        //теперь  переменная choiceBook будет иметь значение из  randobook (return randobook;)
        readBook(choiceBook);                            // вызываю метод readBook с параметром choiceBook
        appraisalBook(choiceBook);                     // вызываю метод appraisalBook с параметром choiceBook


    }

    public static Book choiceBook(Book[] primy) {                // метод choiceBook, вызываемый с вх. парметром (массивом)
        int randomNumbook = (int) (Math.random() * 4);     //присваиваю переменной randomNumbook значения от [0-4]
        Book randobook = primy[randomNumbook];             // так выбирается случаный объект из массива
        return randobook;                                  // вернуть объект
    }


    public static void readBook(Book randomchik) {
        System.out.println(randomchik.toString());

    }

    public static void appraisalBook(Book book2) {

        int number1;                                   // создал вспомогательные переменные для каждой константы, чтобы посчитать оцкенку
        int number2;
        int number3;
        int number4;

        String book_name = book2.getNamebook();          // при помощи гетров получаю значенмя из класса Book для переменных, задаю значениям новые аперемееные.
        String autor_name = book2.getAutor();
        int number_book = book2.getNumber();
        int numberofpages = book2.getNumberofpages();


        if (book_name.isEmpty()) {                      // условия для каждой переменной, для строк использу метод isEmpty, для int "переменная == 0"
            number1 = (int) (Math.random() * 10);


        } else {
            number1 = book_name.length();


        }

        if (autor_name.isEmpty()) {
            number2 = (int) (Math.random() * 10);
        } else {
            number2 = autor_name.length();

        }


        if (number_book == 0) {

            number3 = (int) (Math.random() * 10);
        } else {
            number3 = number_book;

        }

        if (numberofpages == 0) {

            number4 = (int) (Math.random() * 10);
        } else {
            number4 = numberofpages;


        }
        int result= number1 + number2 - number3 + number4;                                      // считаю оценку

        System.out.println("Оценка:"+ result);                                               // Вывожу результат

    }
}



