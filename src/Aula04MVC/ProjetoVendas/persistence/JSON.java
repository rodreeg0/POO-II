package Aula04MVC.ProjetoVendas.persistence;

import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import Aula04MVC.ProjetoVendas.DTO.LOG;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JSON<e> implements Persistencia<e>{

//    public static List<Double> importJSON(JPanel panel) throws FileNotFoundException {
//        JFileChooser fc = new JFileChooser();
//        fc.setCurrentDirectory(new File("src/persistence"));
//        fc.setSelectedFile(new File("src/persistence/dados.json"));
//        int returnVal = fc.showOpenDialog(panel);
//        File file = null;
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            file = fc.getSelectedFile();
//        }
//        List<Double> lista = null;
//        if (file != null) {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            Type listType = new TypeToken<ArrayList<Double>>() {
//            }.getType();
//            lista = new Gson().fromJson(bufferedReader, listType);
//        }
//        return lista != null ? lista : new ArrayList<>();
//    }
//
    /* public List<Vendedor> importar(Vendedor p) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/JSONFiles/vendedores.json"));
        Type listType = new TypeToken<ArrayList<Vendedor>>() {
        }.getType();
        List<Vendedor> lista;
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }

    public List<Cliente> importar(Cliente p) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/JSONFiles/clientes.json"));
        Type listType = new TypeToken<ArrayList<Cliente>>() {
        }.getType();
        List<Cliente> lista;
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }

    public List<Venda> importar(Venda p) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/jsonFiles/vendas.json"));
        Type listType = new TypeToken<ArrayList<Venda>>() {
        }.getType();
        List<Venda> lista;
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }

    public List<Produto> importar(Produto p) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/JSONFiles/produtos.json"));
        Type listType = new TypeToken<ArrayList<Produto>>() {
        }.getType();
        List<Produto> lista;
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }

    public List<LOG> importar(LOG l) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/JSONFiles/LOG.json"));
        Type listType = new TypeToken<ArrayList<LOG>>() {
        }.getType();
        List<LOG> lista;
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }
    
    public void exportarLOG(List<LOG> lista) {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<LOG> list = new ArrayList<>();
        list.addAll(lista);
        try {
            writer = new FileWriter("src/JSONFiles/LOG.json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }
    
    public void exportarVendedor(List<Vendedor> lista) {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<Vendedor> list = new ArrayList<>();
        list.addAll(lista);
        try {
            writer = new FileWriter("src/JSONFiles/vendedores.json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }
    
    public void exportarProduto(List<Produto> lista) {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<Produto> list = new ArrayList<>();
        list.addAll(lista);
        try {
            writer = new FileWriter("src/JSONFiles/produtos.json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }
    
    public void exportarCliente(List<Cliente> lista) {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<Cliente> list = new ArrayList<>();
        list.addAll(lista);
        try {
            writer = new FileWriter("src/JSONFiles/clientes.json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }
    
    public void exportarVenda(List<Venda> lista) {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<Venda> list = new ArrayList<>();
        list.addAll(lista);
        try {
            writer = new FileWriter("src/JSONFiles/vendas.json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }*/
   
    public List<e> importar(String dir) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/JSONFiles/" + dir + ".json"));
        Type listType = new TypeToken<ArrayList<e>>() {
        }.getType();
        List<e> lista;
        
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }

    public void exportar(List<e> lista, String dir) throws FileNotFoundException {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<e> list = new ArrayList<>();
        list.addAll(importar(dir));
        list.addAll(lista);
        try {
            writer = new FileWriter("src/JSONFiles/"+dir+".json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile( new File("marcas.json")); // added this line
        fc.setCurrentDirectory(new File("src/JSONFiles"));
        int returnVal = fc.showSaveDialog(null);
        File file = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
    }


    @Override
    public void exportar(List<e> e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<e> importar(e p) throws FileNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
