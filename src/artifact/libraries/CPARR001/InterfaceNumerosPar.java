package artifact.libraries.CPARR001;

import artifact.dtos.CPARC001.In.NumerosPar;
import artifact.dtos.CPARC001.Out.ListNumerosOut;

public interface InterfaceNumerosPar {

    ListNumerosOut listaNumeros(NumerosPar numerosPar);
}
