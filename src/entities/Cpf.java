package entities;

import java.util.List;
import java.util.Set;

public class Cpf {

    public void validarCpf (String cpf, Set<String> validos, List<String> invalidos){
        String numeroCpf = limparCpf(cpf);
        boolean stringNumerica = contemNumeros(numeroCpf);
        if (!stringNumerica){
            invalidos.add(cpf);
        }else{
            if (numeroCpf.length() == 11){
                validos.add(cpf);
            }
            else {
                invalidos.add(cpf);
            }
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
    public static boolean contemNumeros (String numero) {
        boolean contemApenasNumeros = false;
        contemApenasNumeros = numero.matches("[0-9]+");
        return contemApenasNumeros;
    }
    public String limparCpf(String cpf){
        cpf = cpf.replaceAll("\\s","");
        cpf = cpf.replaceAll("\\.","");
        cpf = cpf.replaceAll("\\-","");
        return cpf;
    }
}