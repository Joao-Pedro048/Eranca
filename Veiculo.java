public class Veiculo {
     private String nome;
     private String modelo;
     private String cor;
     private int ano;
 
     public void setNome(String nome) {
         this.nome = nome;
     }
     public String getNome() {
         return this.nome;
     }
 
 
     public void setModelo(String modelo) {
         this.modelo = modelo;
     }
     public String getModelo() {
         return this.modelo;
     }
 
     
     public void setCor(String cor) {
         this.cor = cor;
     }
     public String getCor() {
         return this.cor;
     }
 
 
     public void setAno(int ano) {
         this.ano = ano;
     }
     public int getAno() {
         return this.ano;
     }
 
 
 
 
 
     public Veiculo(String nome, String modelo, String cor, int ano) {
         this.nome = nome;
         this.modelo = modelo;
         this.cor = cor;
         this.ano = ano;
     }
 
     public Veiculo() {
 
     }
 
 }
 