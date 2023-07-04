package EX_3;

public class People {
    private String name;
    private int estimation;
    private String lesson;

    public People(String name, int estimation, String lesson){
        this.name = name;
        this.estimation = estimation;
        this.lesson = lesson;
    }
    public String getname() {
        return name;
    }
    public int getestimation() {
        return estimation;
    }
    public String getlesson() {
        return lesson;
    }

    @Override
    public String toString() {
        
        return "People{" +
                "Student " +name+ '\''+
                " received " +estimation+ 
                " by subject " +lesson+
                '}';
    }
}
