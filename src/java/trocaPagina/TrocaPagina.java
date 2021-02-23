
package trocaPagina;

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "trocaPagina")
@Dependent
public class TrocaPagina {

    public TrocaPagina() {
    }
    
    public String getTrocaPagina()
    {
        return "cadastroFuncionarios";
    }
    public String getTrocarPagina()
    {
        return "SobreNos";
    }
    public String getInicio()
    {
        return "index";
    }
    
    
}
