package ar.com.xeven;

public class Cliente implements Comparable<Cliente>{
    //Cliente implementa una interface comparable con Cliente
    //atributos
    private String prioridad;
    private String nombre;

    //constructor
    public Cliente(String prioridad,String nombre){
        this.prioridad = prioridad;
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //implementa la interfaz comparable para que compare objetos clientes
    @Override
    public int compareTo(Cliente cliente2) {
        //prioridad -> particular u otras cosas
        String otraPrioridad = cliente2.getPrioridad();
        if (this.prioridad.equals("particular") &&
                otraPrioridad.equals("particular"))
            return  -1;
        else if (!this.prioridad.equals("particular") &&
        otraPrioridad.equals("particular"))
            return 1;
        return 1;
    }

    

}
