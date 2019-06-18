package projetocalculadora;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjetoCalculadora {
    String data = "";
    
    public void createjson(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
        data = sdf.format(date);
        List<String> lista = new ArrayList<>();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try {
            FileWriter writer = new FileWriter("C:/Users/rodri/Documents/NetBeansProjects/ProjetoCalculadora/src/projetocalculadora/json/"+data+".json");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void addToJSON(List<String> list){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try {
            FileWriter writer = new FileWriter("C:/Users/rodri/Documents/NetBeansProjects/ProjetoCalculadora/src/projetocalculadora/json/"+data+".json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public double operacao(String opera, double valor1, double valor2){
        double result = 0;
        switch (opera){
            case "/":
                result = divide(valor1, valor2);
                break;
            case "*":
                result = multiplica(valor1, valor2);
                break;
            case "+":
                result = soma(valor1, valor2);
                break;
            case "-":
                result = subtrai(valor1, valor2);
                break;
        }
        return result;
    }
    
    public double divide(double valor1, double valor2){
        if(valor2 != 0)
            return valor1 / valor2;
        else 
            return 0;
    }
    
    public double multiplica(double valor1, double valor2){
        return valor1 * valor2;
    }
    
    public double soma (double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public double subtrai(double valor1, double valor2){
        return valor1-valor2;
    }
    
}
