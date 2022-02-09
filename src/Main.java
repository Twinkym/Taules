import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Film[] films = new Film[3];
        films[0] = createFilm();
        films[1] = createFilm();
        films[2] = createFilm();
        System.out.println(films);
        for(int i = 0; i <films.length; i++){
            System.out.println(films[i].getNameOfDirector());
            System.out.println(films[i].getTitle());
            System.out.println(films[i].getYear());
        }

        for (Film film: films) System.out.println(film);

    }

    private static Film createFilm() {
        String title = askTitle();
        String nameOfDirector = askNameOfDirector();
        Integer year = askYear();
        Film film = new Film(title, nameOfDirector, year);
        System.out.println("film created: " + film.getTitle() + film.getNameOfDirector() + film.getYear());
        return film;

    }

    private static Integer askYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Year: ");
        return sc.nextInt();
    }

    private static String askNameOfDirector() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Name of Director: ");
        return sc.nextLine();
    }

    private static String askTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Title: ");
        return sc.nextLine();
    }

}
