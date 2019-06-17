package Aula04MVC.ProjetoVendas.Util;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;
import Aula04MVC.ProjetoVendas.persistence.InjecaoDependencia;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.persistence.JSON;
import Aula04MVC.ProjetoVendas.persistence.XML;
import Aula04MVC.ProjetoVendas.persistence.InjecaoDependencia;
import Aula04MVC.ProjetoVendas.persistence.Persistencia;

public class Sincronizacao {

    private boolean flag = false;
    private List<Produto> listaProdutoX = new ArrayList<>();
    private List<Produto> listaProdutoJ = new ArrayList<>();
    private List<Cliente> listaClienteX = new ArrayList<>();
    private List<Cliente> listaClienteJ = new ArrayList<>();
    private List<Venda> listaVendaX = new ArrayList<>();
    private List<Venda> listaVendaJ = new ArrayList<>();
    private List<Vendedor> listaVendedorX = new ArrayList<>();
    private List<Vendedor> listaVendedorJ = new ArrayList<>();
    private List<Produto> listaProdutoF = new ArrayList<>();
    private List<Cliente> listaClienteF = new ArrayList<>();
    private List<Venda> listaVendaF = new ArrayList<>();
    private List<Vendedor> listaVendedorF = new ArrayList<>();
    private Persistencia xml = new XML();
    private Persistencia json = new JSON();

    public void sincronizar() {

        InjecaoDependencia inj = new InjecaoDependencia(xml);
        try {
            listaClienteX = inj.importar(new Cliente());
            listaProdutoX = inj.importar(new Produto());
            listaVendaX = inj.importar(new Venda());
            listaVendedorX = inj.importar(new Vendedor());

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        inj = new InjecaoDependencia(json);
        try {
            listaClienteJ = inj.importar(new Cliente());
            listaProdutoJ = inj.importar(new Produto());
            listaVendaJ = inj.importar(new Venda());
            listaVendedorJ = inj.importar(new Vendedor());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        setListaClienteF(listaClienteX);
        setListaProdutoF(listaProdutoX);
        setListaVendedorF(listaVendedorX);
        setListaVendaF(listaVendaX);

        int t = listaClienteX.size() - 1;

        for (int y = 0; y < listaClienteJ.size(); y++) {
            for (int x = 0; x < t + 1; x++) {
                if (listaClienteX.get(x).getID() != listaClienteJ.get(y).getID()) {
                    flag = true;
                    break;
                }
            }
            if (listaClienteJ.size() > 0) {
                if (flag) {
                    listaClienteF.add(listaClienteJ.get(y));
                }
            }
            flag = false;
        }

        t = listaVendedorX.size() - 1;

        for (int y = 0; y < listaVendedorJ.size(); y++) {
            for (int x = 0; x < t + 1; x++) {
                if (listaVendedorX.get(x).getID() != listaVendedorJ.get(y).getID()) {
                    flag = true;
                    break;
                }
            }
            if (listaVendedorJ.size() > 0) {
                if (flag) {
                    listaVendedorF.add(listaVendedorJ.get(y));
                }
            }
            flag = false;
        }

        t = listaProdutoX.size() - 1;

        for (int y = 0; y < listaProdutoJ.size(); y++) {
            for (int x = 0; x < t + 1; x++) {
                if (listaProdutoX.get(x).getId() != listaProdutoJ.get(y).getId()) {
                    flag = true;
                    break;
                }
            }
            if (listaProdutoJ.size() > 0) {
                if (flag) {
                    listaProdutoF.add(listaProdutoJ.get(y));
                }
            }
            flag = false;
        }

        t = listaVendaX.size() - 1;

        for (int y = 0; y < listaVendaJ.size(); y++) {
            for (int x = 0; x < t + 1; x++) {
                if (listaVendaX.get(x).getId_venda() != listaVendaJ.get(y).getId_venda()) {
                    flag = true;
                    break;
                }
            }
            if (listaVendaJ.size() > 0) {
                if (flag) {
                    listaVendaF.add(listaVendaJ.get(y));
                }
            }
            flag = false;
        }
        inj.exportarProduto(listaProdutoF);
        inj.exportarVenda(listaVendaF);
        inj.exportarCliente(listaClienteF);
        inj.exportarVendedor(listaVendedorF);

        inj = new InjecaoDependencia(xml);
        inj.exportarProduto(listaProdutoF);
        inj.exportarVenda(listaVendaF);
        inj.exportarCliente(listaClienteF);
        inj.exportarVendedor(listaVendedorF);

    }

    public List<Produto> getListaProdutoF() {
        return listaProdutoF;
    }

    public void setListaProdutoF(List<Produto> listaProdutoF) {
        this.listaProdutoF = listaProdutoF;
    }

    public List<Cliente> getListaClienteF() {
        return listaClienteF;
    }

    public void setListaClienteF(List<Cliente> listaClienteF) {
        this.listaClienteF = listaClienteF;
    }

    public List<Venda> getListaVendaF() {
        return listaVendaF;
    }

    public void setListaVendaF(List<Venda> listaVendaF) {
        this.listaVendaF = listaVendaF;
    }

    public List<Vendedor> getListaVendedorF() {
        return listaVendedorF;
    }

    public void setListaVendedorF(List<Vendedor> listaVendedorF) {
        this.listaVendedorF = listaVendedorF;
    }

}
