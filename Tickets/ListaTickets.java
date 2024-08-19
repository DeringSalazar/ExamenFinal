/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.ArrayList;

public class ListaTickets {
    private ArrayList<Ticket> listaTickets;

    public ListaTickets() {
        this.listaTickets = new ArrayList<>();
    }
    
    public void agregarTicket(Ticket tickets){
        this.listaTickets.add(tickets);
    }
    
    public void eliminarPocision(int pos){
        this.listaTickets.remove(pos);
    }
    
    public void eliminarValor(int valor){
        this.listaTickets.remove(valor);
    }
    
    public Ticket buscarTicket(Ticket Tickets){
         for (int i = 0; i < listaTickets.size(); i++){
            if (this.listaTickets.get(i).getTipo()== null) {
                Tickets = listaTickets.get(i);
            }
         }
        return Tickets;  
    }
}
