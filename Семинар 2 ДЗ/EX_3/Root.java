package EX_3;

import java.util.List;

public class Root {

    private String name;
    private List<People> people;
      
    public String getName() {
        return name;        
    }

    public List<People> getpeople() {
        return people;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setPeople(List<People> people){
        this.people =people;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name=" + name +'\''+
                ", people="+people+
                '}';
    }

}
