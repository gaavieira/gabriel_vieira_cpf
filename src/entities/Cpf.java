package entities;

import java.util.List;
import java.util.Set;

public class Cpf {

    public void validarCpf (String cpf, Set<String> validos, List<String> invalidos){

        if (cpf.length() == 11){
            validos.add(cpf);
        }
        else {
            invalidos.add(cpf);
        }

    }
    public void resultado (Set<String> validos, List<String> invalidos){
        System.out.println("CPF's válidos:");
        for (String cpf: validos){
            System.out.println(cpf);
        }
        System.out.println("\nCPF's inválido: ");
        for (String cpf: invalidos){
            System.out.println(cpf);
        }
    }

}
