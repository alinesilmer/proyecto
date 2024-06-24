/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.*;
/**
 *
 * @author hecto
 */
class Participante extends Pasajero {
    
    private String marca;
    private String matricula;
    private int num_participante;
    
    private static Set<Integer> numParticipantesGenerados = new HashSet<>();
    
    
    public Participante(){
        super();
    }
    
    public Participante(String nombre, String apellido, int id, int dia, int mes, int anio, String marca, String matricula, int num_participante){
        super(nombre, apellido, id, dia, mes, anio);
        this.marca = marca;
        this.matricula = matricula;
        this.num_participante = num_participante;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
       return marca;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setNum_participante(int num_participante){
        
        numGenerator(num_participante);
        this.num_participante = num_participante;
    }
    
    public int getNum_participante(){
        return num_participante;
    }
    
    
    public void registrar_participante(Participante participante){
        Scanner scan = new Scanner(System.in);
        
        participante.setNombre(scan.nextLine());
        participante.setApellido(scan.nextLine());
        participante.setId(scan.nextInt());
       
    }
    public void guardar_Registro(Participante participante){
        List<Participante> lista = new LinkedList<>();
        lista.add(participante);
        
    }
    
    public int numGenerator(int num_participante1) {
       Random rand = new Random();
       int min = 1;
       int max = 100;
       int numero;


       do {
           numero = rand.nextInt(max - min + 1) + min;
       } while (!numParticipantesGenerados.add(numero));


       return numero;
   }
}


