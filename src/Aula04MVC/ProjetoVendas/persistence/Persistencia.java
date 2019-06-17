/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ProjetoVendas.persistence;

import java.io.FileNotFoundException;
import java.util.List;
import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;

/**
 *
 * @author rodriguh
 */
public interface Persistencia<e> {

    public List<e> importar(e p)throws FileNotFoundException;
    public void exportar(List<e> e);
    
}
