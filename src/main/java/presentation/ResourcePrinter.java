package presentation;

import model.Model;

import java.util.List;

public class ResourcePrinter {
    public <T extends Model> void printResources(List<List<T>> allList) {
        int page= 1;
        int num=1;
        for (List<T> elementList : allList) {
            System.out.println("\nPAGE: "+page+"\n");

            for(T element : elementList){
                System.out.println(num+". "+element.displayName());
                num++;
            }
            page++;
            num=1;
        }
    }
    public String getResourceState(List<?> list) {
        return list.isEmpty()
                ? "EMPTY - To fetch resources upon requested"
                : "POPULATED - Currently in use";
    }


}
