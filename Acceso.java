public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    public Acceso(String datosAcceso)
    {
        String[] elementosAcceso = datosAcceso.split(" ");
        
        this.ano = Integer.parseInt(elementosAcceso[0]);
        this.mes = Integer.parseInt(elementosAcceso[1]);
        this.dia = Integer.parseInt(elementosAcceso[2]);
        this.hora = Integer.parseInt(elementosAcceso[3]);
        this.minutos = Integer.parseInt(elementosAcceso[4]);
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
}