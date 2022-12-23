package securepass.model;

public class SenhasCadastradas {

    private int id;
    private String data, tipo, titulo;
    
    public void setSenhas(int id, String data, String tipo, String titulo){
        this.data = data;
        this.id = id;
        this.tipo = tipo;
        this.titulo = titulo;
    }
 
    public int getID(){
        
        return id;
    }
    
    public String getData(){
        
        return data;
    }
    
    public String getTipo(){
        
        return tipo;
    }
        
    public String getTitulo(){
        
        return titulo;
    }
}
