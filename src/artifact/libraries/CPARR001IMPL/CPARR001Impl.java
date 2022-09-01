package artifact.libraries.CPARR001IMPL;

import artifact.dtos.CPARC001.In.NumerosPar;
import artifact.dtos.CPARC001.Out.ListNumerosOut;
import artifact.dtos.CPARC001.Out.NumerosParOut;
import artifact.libraries.CPARR001.InterfaceNumerosPar;

import java.util.ArrayList;
import java.util.List;

public class CPARR001Impl implements InterfaceNumerosPar {


    @Override
    public ListNumerosOut listaNumeros(NumerosPar numerosPar) {
        NumerosParOut numerosParOut = new NumerosParOut();

        numerosParOut.setNumeros(numerosPar.getNumero());

        ListNumerosOut listNumerosOut = new ListNumerosOut();
        listNumerosOut.setListNumerosParOut((operacion(numerosPar)));

        return listNumerosOut;
    }


    public static List<NumerosParOut> operacion(NumerosPar numerosPar){
        List<NumerosParOut> listPar = new ArrayList<>();

        for(int i=1;i<=numerosPar.getNumero();i++){
            if(i%2 == 0){
                NumerosParOut numerosParOut= new NumerosParOut();
                numerosParOut.setNumeros(i);

                listPar.add(numerosParOut);
            }
        }

        return listPar;
    }
}
