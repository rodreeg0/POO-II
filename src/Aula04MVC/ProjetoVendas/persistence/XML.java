/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ProjetoVendas.persistence;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import Aula04MVC.ProjetoVendas.Util.DataUtil;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.ItemVenda;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;
import java.io.FileNotFoundException;

/**
 *
 * @author rodriguh
 */
public class XML implements Persistencia {

    public void exportarVendedor(List<Vendedor> lista) {
        Element config = new Element("Vendedores");
        Element titulo = new Element("titulo");
        titulo.setText("Lista de vendedores");
        Element data = new Element("data");
        //  data.setText(DataUtil.DataHoraForStringPadraoH(new Date()));
        config.addContent(titulo);
        config.addContent(data);
        for (int i = 0; i < lista.size(); i++) {
            Element vendedor = new Element("vendedor");
            Element nome = new Element("nome");
            Element usuario = new Element("usuario");
            Element senha = new Element("senha");
            vendedor.setAttribute("id", String.valueOf(lista.get(i).getID()));
            nome.setText(lista.get(i).getNome());
            usuario.setText(lista.get(i).getUsuario());
            senha.setText(lista.get(i).getSenha());
            vendedor.addContent(nome);
            vendedor.addContent(usuario);
            vendedor.addContent(senha);
            config.addContent(vendedor);
        }
        Document documento = new Document(config);
        XMLOutputter xout = new XMLOutputter();
        try {
            BufferedWriter arquivo = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/vendedores.xml"), "UTF-8"));
            xout.output(documento, arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportarProduto(List<Produto> lista) {
        Element config = new Element("Produtos");
        Element titulo = new Element("titulo");
        titulo.setText("Lista de Produtos");
        Element data = new Element("data");
        //  data.setText(DataUtil.DataHoraForStringPadraoH(new Date()));
        config.addContent(titulo);
        config.addContent(data);
        for (int i = 0; i < lista.size(); i++) {
            Element produto = new Element("produto");
            Element descricao = new Element("descricao");
            Element estoque = new Element("estoque");
            Element valor = new Element("valor");
            produto.setAttribute("id", String.valueOf(lista.get(i).getId()));
            descricao.setText(lista.get(i).getDescricao());
            estoque.setText(String.valueOf(lista.get(i).getEstoque()));
            valor.setText(String.valueOf(lista.get(i).getValor()));
            produto.addContent(descricao);
            produto.addContent(estoque);
            produto.addContent(valor);
            config.addContent(produto);
        }
        Document documento = new Document(config);
        XMLOutputter xout = new XMLOutputter();
        try {
            BufferedWriter arquivo = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/produtos.xml"), "UTF-8"));
            xout.output(documento, arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportarVenda(List<Venda> lista) {

        Element config = new Element("Vendas");
        Element titulo = new Element("titulo");
        titulo.setText("Lista de Vendas");
        Element date = new Element("data");
        date.setText(DataUtil.DataHoraForStringPadraoH(new Date()));
        config.addContent(titulo);
        config.addContent(date);
        for (int i = 0; i < lista.size(); i++) {
            Element venda = new Element("venda");
            Element data = new Element("data");
            Element dataPagamento = new Element("dataPagamento");
            Element dataVencimento = new Element("dataVencimento");
            Element cliente = new Element("cliente");
            Element nome = new Element("nome");
            Element usuario = new Element("usuario");
            Element senha = new Element("senha");
            Element rg = new Element("rg");
            Element cpf = new Element("cpf");
            Element estado = new Element("estado");
            Element cidade = new Element("cidade");
            Element bairro = new Element("bairro");
            Element endereco = new Element("endereco");
            Element numero = new Element("numero");
            Element fone = new Element("fone");
            Element email = new Element("email");
            Element vendedor = new Element("vendedor");
            Element nomeV = new Element ("nome");
            Element usuarioV = new Element("usuario");
            Element senhaV = new Element("senha");
            vendedor.setAttribute("id", String.valueOf(lista.get(i).getVendedor().getID()));
            nomeV.setText(lista.get(i).getVendedor().getNome());
            usuarioV.setText(lista.get(i).getVendedor().getUsuario());
            senhaV.setText(lista.get(i).getVendedor().getSenha());
            vendedor.addContent(nomeV);
            vendedor.addContent(usuarioV);
            vendedor.addContent(senhaV);
            venda.setAttribute("id", String.valueOf(lista.get(i).getId_venda()));
            data.setText(DataUtil.DataHoraForStringPadraoH(lista.get(i).getData()));
            dataPagamento.setText(DataUtil.DataHoraForStringPadraoH(lista.get(i).getDataPagamento()));
            dataVencimento.setText(DataUtil.DataHoraForStringPadraoH(lista.get(i).getDataVencimento()));
            cliente.setAttribute("id", String.valueOf(lista.get(i).getCliente().getID()));
            nome.setText(lista.get(i).getCliente().getNome());
            usuario.setText(lista.get(i).getCliente().getUsuario());
            senha.setText(lista.get(i).getCliente().getSenha());
            rg.setText(lista.get(i).getCliente().getRg());
            cpf.setText(lista.get(i).getCliente().getCpf());
            estado.setText(lista.get(i).getCliente().getEstado());
            cidade.setText(lista.get(i).getCliente().getCidade());
            bairro.setText(lista.get(i).getCliente().getBairro());
            endereco.setText(lista.get(i).getCliente().getEndereco());
            numero.setText(String.valueOf(lista.get(i).getCliente().getNumero()));
            fone.setText(lista.get(i).getCliente().getFone());
            email.setText(lista.get(i).getCliente().getEmail());
            cliente.addContent(nome);
            cliente.addContent(usuario);
            cliente.addContent(senha);
            cliente.addContent(rg);
            cliente.addContent(cpf);
            cliente.addContent(estado);
            cliente.addContent(cidade);
            cliente.addContent(bairro);
            cliente.addContent(endereco);
            cliente.addContent(numero);
            cliente.addContent(fone);
            cliente.addContent(email);
            venda.addContent(data);
            venda.addContent(dataPagamento);
            venda.addContent(dataVencimento);
            venda.addContent(cliente);
            venda.addContent(vendedor);
            Element produtos = new Element("produtos");
            Element produto;
            for (ItemVenda v : lista.get(i).getProdutos()) {
                produto = new Element("item");
                produto.setAttribute("id", String.valueOf(v.getId()));
                Element descricao = new Element("descricao");
                Element estoque = new Element("estoque");
                Element valor = new Element("valor");
                Element quantidade = new Element("quantidade");
                descricao.setText(v.getDescricao());
                estoque.setText(String.valueOf(v.getEstoque()));
                valor.setText(String.valueOf(v.getValor()));
                quantidade.setText(String.valueOf(v.getQuantidade()));
                produto.addContent(descricao);
                produto.addContent(estoque);
                produto.addContent(valor);
                produto.addContent(quantidade);
                produtos.addContent(produto);
            }
            venda.addContent(produtos);
            config.addContent(venda);
        }
        Document documento = new Document(config);
        XMLOutputter xout = new XMLOutputter();
        try {
            BufferedWriter arquivo = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/vendas.xml"), "UTF-8"));
            xout.output(documento, arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportarCliente(List<Cliente> lista) {
        Element config = new Element("Clientes");
        Element titulo = new Element("titulo");
        titulo.setText("Lista de clientes");
        Element data = new Element("data");
        //  data.setText(DataUtil.DataHoraForStringPadraoH(new Date()));
        config.addContent(titulo);
        config.addContent(data);
        for (int i = 0; i < lista.size(); i++) {
            Element cliente = new Element("cliente");
            Element nome = new Element("nome");
            Element usuario = new Element("usuario");
            Element senha = new Element("senha");
            Element rg = new Element("rg");
            Element cpf = new Element("cpf");
            Element estado = new Element("estado");
            Element cidade = new Element("cidade");
            Element bairro = new Element("bairro");
            Element endereco = new Element("endereco");
            Element numero = new Element("numero");
            Element fone = new Element("fone");
            Element email = new Element("email");
            cliente.setAttribute("id", String.valueOf(lista.get(i).getID()));
            nome.setText(lista.get(i).getNome());
            usuario.setText(lista.get(i).getUsuario());
            senha.setText(lista.get(i).getSenha());
            rg.setText(lista.get(i).getRg());
            cpf.setText(lista.get(i).getCpf());
            estado.setText(lista.get(i).getEstado());
            cidade.setText(lista.get(i).getCidade());
            bairro.setText(lista.get(i).getBairro());
            endereco.setText(lista.get(i).getEndereco());
            numero.setText(String.valueOf(lista.get(i).getNumero()));
            fone.setText(lista.get(i).getFone());
            email.setText(lista.get(i).getEmail());
            cliente.addContent(nome);
            cliente.addContent(usuario);
            cliente.addContent(senha);
            cliente.addContent(rg);
            cliente.addContent(cpf);
            cliente.addContent(estado);
            cliente.addContent(cidade);
            cliente.addContent(bairro);
            cliente.addContent(endereco);
            cliente.addContent(numero);
            cliente.addContent(fone);
            cliente.addContent(email);
            config.addContent(cliente);
        }
        Document documento = new Document(config);
        XMLOutputter xout = new XMLOutputter();
        try {
            BufferedWriter arquivo = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/clientes.xml"), "UTF-8"));
            xout.output(documento, arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> importar(Cliente c) {
        List<Cliente> lista = new ArrayList<>();
        Cliente cliente;
        Document doc = null;
        SAXBuilder builder = new SAXBuilder();
        try {
            doc = builder.build("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/clientes.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element config = doc.getRootElement();
        List<?> ls = config.getChildren("cliente");

        for (Iterator<?> iter = ls.iterator(); iter.hasNext();) {
            Element element = (Element) iter.next();
            cliente = new Cliente();
            cliente.setID(Integer.parseInt(element.getAttributeValue("id")));
            cliente.setNome(element.getChildText("nome"));
            cliente.setUsuario(element.getChildText("usuario"));
            cliente.setSenha(element.getChildText("senha"));
            cliente.setBairro(element.getChildText("bairro"));
            cliente.setCidade(element.getChildText("cidade"));
            cliente.setCpf(element.getChildText("cpf"));
            cliente.setEmail(element.getChildText("email"));
            cliente.setEndereco(element.getChildText("endereco"));
            cliente.setNumero(Integer.parseInt(element.getChildText("numero")));
            cliente.setRg(element.getChildText("rg"));
            cliente.setFone(element.getChildText("fone"));
            cliente.setEstado(element.getChildText("estado"));
            lista.add(cliente);
        }
        return lista;
    }

    public List<Produto> importar(Produto c) {
        List<Produto> lista = new ArrayList<>();
        Produto produto;
        Document doc = null;
        SAXBuilder builder = new SAXBuilder();
        try {
            doc = builder.build("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/produtos.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element config = doc.getRootElement();
        List<?> ls = config.getChildren("produto");

        for (Iterator<?> iter = ls.iterator(); iter.hasNext();) {
            Element element = (Element) iter.next();
            produto = new Produto();
            produto.setId(Integer.parseInt(element.getAttributeValue("id")));
            produto.setDescricao(element.getChildText("descricao"));
            produto.setEstoque(Integer.parseInt(element.getChildText("estoque")));
            produto.setValor(Float.parseFloat(element.getChildText("valor")));
            lista.add(produto);
        }
        return lista;
    }

    public List<Vendedor> importar(Vendedor c) {
        List<Vendedor> lista = new ArrayList<>();
        Vendedor vendedor;
        Document doc = null;
        SAXBuilder builder = new SAXBuilder();
        try {
            doc = builder.build("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/vendedores.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element config = doc.getRootElement();
        List<?> ls = config.getChildren("vendedor");

        for (Iterator<?> iter = ls.iterator(); iter.hasNext();) {
            Element element = (Element) iter.next();
            vendedor = new Vendedor();
            vendedor.setID(Integer.parseInt(element.getAttributeValue("id")));
            vendedor.setNome(element.getChildText("nome"));
            vendedor.setSenha(element.getChildText("senha"));
            vendedor.setUsuario(element.getChildText("usuario"));
            lista.add(vendedor);
        }
        return lista;
    }

    public List<Venda> importar(Venda v) {
        List<Venda> listVenda = new ArrayList<>();
        List<ItemVenda> listItem = new ArrayList<>();
        ItemVenda item;
        Venda venda;
        Cliente c;
        Vendedor vendedor;
        Document doc = null;
        SAXBuilder builder = new SAXBuilder();
        try {
            doc = builder.build("C://Users//rodriguh//Documents//NetBeansProjects//ProjetoVendas//src//XMLFiles/vendas.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element config = doc.getRootElement();
        List<Element> ls = config.getChildren("venda");

        for (Iterator<Element> iter = ls.iterator(); iter.hasNext();) {
            Element element = iter.next();
            venda = new Venda();
            c = new Cliente();
            vendedor = new Vendedor();
            Element produto = element.getChild("produtos");
            List<Element> list = produto.getChildren("item");
            for (Element e : list) {
                item = new ItemVenda();
                item.setId(Integer.parseInt(e.getAttributeValue("id")));
                item.setDescricao(e.getChildText("descricao"));
                item.setEstoque(Integer.parseInt(e.getChildText("estoque")));
                item.setQuantidade(Integer.parseInt(e.getChildText("quantidade")));
                item.setValor(Float.parseFloat(e.getChildText("valor")));
                listItem.add(item);
            }
            vendedor.setID(Integer.parseInt(element.getChild("vendedor").getAttributeValue("id")));
            vendedor.setNome(element.getChild("vendedor").getChildText("nome"));
            vendedor.setSenha(element.getChild("vendedor").getChildText("senha"));
            vendedor.setUsuario(element.getChild("vendedor").getChildText("usuario"));
            c.setID(Integer.parseInt(element.getChild("cliente").getAttributeValue("id")));
            c.setNome(element.getChild("cliente").getChildText("nome"));
            c.setUsuario(element.getChild("cliente").getChildText("usuario"));
            c.setSenha(element.getChild("cliente").getChildText("senha"));
            c.setBairro(element.getChild("cliente").getChildText("bairro"));
            c.setCidade(element.getChild("cliente").getChildText("cidade"));
            c.setCpf(element.getChild("cliente").getChildText("cpf"));
            c.setEmail(element.getChild("cliente").getChildText("email"));
            c.setEndereco(element.getChild("cliente").getChildText("endereco"));
            c.setNumero(Integer.parseInt(element.getChild("cliente").getChildText("numero")));
            c.setRg(element.getChild("cliente").getChildText("rg"));
            c.setFone(element.getChild("cliente").getChildText("fone"));
            c.setEstado(element.getChild("cliente").getChildText("estado"));
            venda.setId_venda(Integer.parseInt(element.getAttributeValue("id")));
            venda.setVendedor(vendedor);
            venda.setCliente(c);
            venda.setProdutos(listItem);
            try {
                venda.setData(DataUtil.StringParaDataHora(element.getChildText("data")));
            } catch (ParseException ex) {
                Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                venda.setDataPagamento(DataUtil.StringParaDataHora(element.getChildText("dataPagamento")));
            } catch (ParseException ex) {
                Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                venda.setDataVencimento(DataUtil.StringParaDataHora(element.getChildText("dataVencimento")));
            } catch (ParseException ex) {
                Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
            }
            listVenda.add(venda);
        }
        return listVenda;
    }

    @Override
    public List importar(Object p) throws FileNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportar(List e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
