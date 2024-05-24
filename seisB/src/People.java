import java.util.Objects;

public class People {
    private String name = null;
    private Integer age = 0;
    private Integer dni;
    private Character genre = 'h';
    private Double weigth = 0.0;
    private Double heigth = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Character getGenre() {
        return genre;
    }

    public void setGenre(Character genre) {
        this.genre = genre;
    }

    public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public People() {};

    public People(String name, Integer age, Character genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public People(String name, Integer age, Integer dni, Character genre, Double weigth, Double heigth) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.genre = genre;
        this.weigth = weigth;
        this.heigth = heigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People people)) return false;
        return Objects.equals(getName(), people.getName()) && Objects.equals(getAge(), people.getAge()) && Objects.equals(getDni(), people.getDni()) && Objects.equals(getGenre(), people.getGenre()) && Objects.equals(getWeigth(), people.getWeigth()) && Objects.equals(getHeigth(), people.getHeigth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getDni(), getGenre(), getWeigth(), getHeigth());
    }
}

