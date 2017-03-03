public class Acceso
{
    private String ip;
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String paginaWeb;
    private int codigoHTTP;
    
    public Acceso(String datosAcceso)
    {
        // Para eliminar los corchete innecesarios de la cadena.
        String eliminarCorchete1 = "";
        String eliminarCorchete2 = "";
        
        String[] elementosAcceso = datosAcceso.split(" ");
        
        this.ip = elementosAcceso[0];
        eliminarCorchete1 = elementosAcceso[1].substring(1,5);
        this.ano = Integer.parseInt(eliminarCorchete1);
        this.mes = Integer.parseInt(elementosAcceso[2]);
        this.dia = Integer.parseInt(elementosAcceso[3]);
        this.hora = Integer.parseInt(elementosAcceso[4]);
        eliminarCorchete2 = elementosAcceso[5].substring(0,2);
        this.minutos = Integer.parseInt(eliminarCorchete2);
        this.paginaWeb = elementosAcceso[6];
        this.codigoHTTP = Integer.parseInt(elementosAcceso[7]);
    }
    
    public int getAno() 
    {
        return ano;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
    
    public String getIp()
    {
        return ip;
    }
    
    public String getPaginaWeb()
    {
        return paginaWeb;
    }
    
    public int getCodigoHTTP()
    {
        return codigoHTTP;
    }
}