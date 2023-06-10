/*
 * @authors Allan Amancio and Marcio Jose
 * 
 * Particante class
 */
package modelo;

import java.util.ArrayList;

public class Participante {
        private String nome;
        private ArrayList<Mensagem> recebidas = new ArrayList<>();

        public Participante(String nome){
            this.nome = nome;
        }
        
        // Gets and sets
        public String getNome(){ return this.nome; }
        public void setNome(String nome){
            this.nome = nome;
        }
        public ArrayList<Mensagem> getRecebidas(){ return recebidas; }
        
        @Override
        public String toString(){
            String texto = "Nome: " + nome + "\n"+ "Recebidas: ";
            for(Mensagem mensagem : recebidas){
                texto += mensagem.getTexto();
            }
            return texto;
        }

}
