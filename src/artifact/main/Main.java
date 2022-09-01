package artifact.main;

import artifact.dtos.CPARC001.In.NumerosPar;
import artifact.dtos.CPARC001.Out.ListNumerosOut;
import artifact.libraries.CPARR001IMPL.CPARR001Impl;

public class Main {
    public static void main(String[] args) {
        CPARR001Impl cparr001 = new CPARR001Impl();
        ListNumerosOut listNumerosOut = cparr001.listaNumeros(ingresoDatos());
        System.out.println(listNumerosOut);
    }


    public static NumerosPar ingresoDatos(){
        NumerosPar numerosPar = new NumerosPar();
        numerosPar.setNumero(100);
        return numerosPar;
    }
}
