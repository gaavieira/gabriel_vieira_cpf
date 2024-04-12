package Main;

import entities.Cpf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> validos = new HashSet<>();

        List<String> invalidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("cpfs.txt"))){
            String linhacpf = br.readLine();
            Cpf cpf = new Cpf();
            while (linhacpf != null){
                cpf.validarCpf(linhacpf, validos, invalidos);
                linhacpf = br.readLine();
            }
            cpf.resultado(validos, invalidos);
        }
        catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
