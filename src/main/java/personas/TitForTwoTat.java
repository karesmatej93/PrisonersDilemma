package personas;

import java.util.LinkedList;

/**
 * Created by Matěj Kareš on 03.01.2018.
 */
public class TitForTwoTat extends Person {
    LinkedList<Boolean> history;

    public TitForTwoTat() {
        history = new LinkedList<Boolean>();

        //Default to "not yet betrayed"
        history.add(true);
        history.add(true);
    }

    public boolean decide() {
        boolean result = history.getFirst() || history.getLast();

        return result;
    }

    public void onPostTrial(Person opponent, boolean hisDecision, boolean myDecision) {
        addResultToHistory(hisDecision);
    }

    private void addResultToHistory(boolean result){
        history.add(result);
        history.removeFirst();
    }

}
