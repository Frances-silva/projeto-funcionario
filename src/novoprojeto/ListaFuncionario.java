
package novoprojeto;

import java.util.ArrayList;
import java.util.List;


public final class ListaFuncionario {
    
    //atributo
    private static List<Vendedor> vendedores = new ArrayList() ;
    
    
    
    //metodo para adicionar vendedor
    public static void adicionarFuncionario(Vendedor vend)
    {
        vendedores.add(vend);
    }
    
    
    //atributo imprimir dados do vendedor
    public static String imprimirDadosVendedor()
    {
        StringBuilder dados = new StringBuilder();
        for(Vendedor v : vendedores)
        {
            dados.append(v.imprimirVendedor());
        }
        
        return dados.toString();
    }

    
    
    
    
    
    
    //metodos especiais
    public static List<Vendedor> getVendedores()
    {
        return vendedores;
    }
    
    
    
   
    
    
}
