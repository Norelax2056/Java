package EX_1;
import java.util.*;

/**
 * EX_1
 */
public class EX_1 {

    public static void main(String[] args) {
        Map<String, String> par = new LinkedHashMap<String,String>();
        par.put("name","Ivanov");
        par.put("country","Russia");
        par.put("city","Moscow");
        par.put("age",null);
        System.out.println(getQuery(par));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder select = new StringBuilder();
        for (Map.Entry<String,String> pr : params.entrySet())
        {
            if (pr.getValue() != null)
            {
                select.append(pr.getKey() +" = '" + pr.getValue()+"' and ");
            }
        }
        select.delete(select.toString().length()-5,select.toString().length());
        return select.toString();
    }
}