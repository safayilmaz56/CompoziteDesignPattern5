import java.util.ArrayList;
import java.util.List;

public class CompositeDealers implements IWorker{

    private List<IWorker> workerList;
    public CompositeDealers(){
        workerList = new ArrayList<>();
    }

    public void add(IWorker person){
        workerList.add(person);
    }

    public void remove(IWorker person){
        workerList.remove(person);
    }

    @Override
    public int getCost() {
        int result = 0;
        for (IWorker worker : workerList){
            result += worker.getCost();
        }
        return result;
    }
}
