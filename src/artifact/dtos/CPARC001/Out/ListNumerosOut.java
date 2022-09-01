package artifact.dtos.CPARC001.Out;

import java.util.ArrayList;
import java.util.List;

public class ListNumerosOut {

    List<NumerosParOut> listNumerosParOut= new ArrayList<>();

    public List<NumerosParOut> getListNumerosParOut() {
        return listNumerosParOut;
    }

    public void setListNumerosParOut(List<NumerosParOut> listNumerosParOut) {
        this.listNumerosParOut = listNumerosParOut;
    }

    @Override
    public String toString() {
        return "ListNumerosOut{" +
                "listNumerosParOut=" + listNumerosParOut +
                '}';
    }
}
