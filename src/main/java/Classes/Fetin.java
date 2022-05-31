package Classes;
import Exceções.Checked;
import Exceções.UnChecked;
import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Fetin {

    HashMap<String, Integer> fetinMap = new HashMap<String, Integer>();

    public void addProjetos(String nome, int nota)throws Checked{
        fetinMap.put(nome, nota);
        if(fetinMap.containsKey(nome)){
            throw new UnChecked("Nome de equipe FETIN ja cadastrado");
        }
        if(nota >= 60) {
            System.out.println("Trabalho FETIN Aprovado");

        }else{
            throw new Checked("Trabalho FETIN com nota infeirior a 60");
        }

    }

    public void mostraInfo(){
        fetinMap.forEach((nome, nota) -> {
            System.out.println("Nome: " + nome);
            System.out.println("Nota: " + nota);
            System.out.println("");
        });
    }

//        public void TestNota(float Nota) throws Checked {
//            fetinMap.forEach((nome, nota) -> {
//             try{   if(nota >= 60) {
//
//                 System.out.println("Projeto Aprovado");
//
//             }catch(Checked e){
//                 throw new Checked(e.get);;
//            }
//
//                System.out.println("");
//            });
//
//        }





}
