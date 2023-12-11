package censista;

public class Censista {
    //Atributos
    private int dni;
    private int telefono;
    private String provincia;
    private String ciudad;
    private int area;
    private int totalViviendas;
    private int cantCensada;
    
    //Metodo constructor
    public Censista (int unDni,int tel, String prov,String ciu,int unArea,int totalViv,int cantCen){
        dni = unDni;
        telefono = tel;
        provincia = prov;
        ciudad= ciu;
        area = unArea;
        totalViviendas= totalViv;
        cantCensada=cantCen;
    }
    public Censista(int unDni){
        dni = unDni;
        telefono = 0;
        provincia = "";
        ciudad= "";
        area = 0;
        totalViviendas= 0;
        cantCensada=0;
    }
    //Metodos observadores o getters
    public int getDni(){
        return dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getProvincia(){
        return provincia;
    }
    public String getCiudad(){
        return ciudad;
    }
    public int getArea(){
        return area;
    }
    public int getTotalViviendas(){
        return totalViviendas;
    }
    public int getCantCensada(){
        return cantCensada;
    }
    //Metodo observador toString para ver todo un censista con sus atributos
    public String toString(){
        return dni + "/" + telefono+ "/" + provincia+ "/" + ciudad+ "/" + area+ "/" + totalViviendas+ "/" + cantCensada;
    }
    //METODOS SETTEADORES
    public void setTelefono(int unTelefono){
        telefono = unTelefono;
    }
    public void setProvincia(String prov){
        provincia = prov;
    }
    public void setCiudad (String ciu){
        ciudad= ciu;
    }
    public void setArea(int unArea){
        area= unArea;
    }
    public void setTotalViviendas(int totalViv){
        totalViviendas= totalViv;
    }
    public void setCantCensada(int cantCen){
        cantCensada= cantCen;
    }
    public boolean equals (Censista otroCensista){
        return dni == otroCensista.getDni();
    }
    
    //Metodo propio
    public void censo (){
        cantCensada = cantCensada + totalViviendas;
    }
}
