package Classes;

import Exceções.Checked;
import Exceções.UnChecked;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Programa iniciado");

        Fetin fetin = new Fetin();

        try{
            fetin.addProjetos("Trabalho1",50);
            fetin.addProjetos("Trabalho1",70);

        } catch (Checked e){
            System.out.println(e.getMessage());
        } catch (UnChecked e){
            System.out.println(e.getMessage());
        }

        System.out.println("Programa encerrado");

    }

}
