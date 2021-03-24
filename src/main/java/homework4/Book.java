package homework4;
import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;

public class Book {          //Создал конструктор с параметрами namebook, autor, numberofpages (This ставится для того чтобы вх параметр присваивался полю классу)
    String namebook;        //Если не  хотим This, то имя вх параметра джолжно отличаться от поля класса.
    String autor = "";     // по дефолту задал пустоту , так как если книга будет с пустой этой перемееной, то метод isEmpty() не отработает с null, а с "" отработает.
    int number;            //  Вы можете столкнуться с таким вопросом, чем отличается значение типа String "" от null
    int numberofpages;                       // "" - это пустое значение. Пример: пришел курьер и дал вам пустую коробку.
                             //null - это пустота, ничего, небытье. Пример: пришел курьер, и ничего не дал.



    public Book(String namebook) {      //Создал перегруженный конструктор 1 с вх.параметрами namebook
        this.namebook = namebook;

    }

    public Book(String namebook, int number) {  //Создал перегруженный конструктор 2 с вх. параметрами namebook, number
        this.namebook = namebook;
        this.number = number;
    }

    public Book(String namebook, String autor, int number, int numberofpages) {     //Создал перегруженный конструктор 3 с вх.параметрами namebook, number, autor, numberofpages
        this.namebook = namebook;
        this.autor = autor;
        this.number = number;
        this.numberofpages = numberofpages;
    }

    @Override
    public String toString() {                                 //Создал метод toString и переопределил его, чтобы вывод результата был таким, каким нужно.
        return "Название книги:" + namebook + "; " + System.lineSeparator() + "Автор:" + autor + "; " + System.lineSeparator() + "Порядковый номер в серии:" + number + "; " + System.lineSeparator() + "Количество страниц:" + numberofpages + "; ";
    }

    public String getNamebook() {      // Гетер для получения namebook
        return namebook;
    }

    public String getAutor() {        // Гетер для получения  autor
        return autor;
    }

    public int getNumber() {          // Гетер для получения  number
        return number;
    }

    public int getNumberofpages() {    // Гетер для получения numberofpages
        return numberofpages;
    }
}

