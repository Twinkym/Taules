public class Film {

    private String nameOfDirector;
    private String title;
    private Integer year;

    public Film(String nameOfDirector, String title, Integer year) {
        this.title = title;
        this.nameOfDirector = nameOfDirector;
        this.year = year;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nameOfDirector='" + nameOfDirector + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}