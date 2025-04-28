package assig_3;

public class MyTestingClass {
    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        int hash = id * 33;
        hash = hash * 113;
        return hash;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyTestingClass{id=" + id + "}";
    }
}