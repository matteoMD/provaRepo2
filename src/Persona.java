public class Persona {
    private String nome;
    private String cognome;
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    
    
    public String getNome(String nome){
         return this.nome;
    }       
    
    public String getCognome() {
        return cognome;
    }
    
    
}

