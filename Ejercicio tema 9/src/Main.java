public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
            persona.setEdad(18);
            persona.setNombre("Juan");
            persona.setTelefono(12345);

        Cliente cliente = new Cliente();
            cliente.setEdad(20);
            cliente.setNombre("Alberto");
            cliente.setTelefono(123);
            cliente.setCredito(200);

        Trabajador trabajador = new Trabajador();
            trabajador.setEdad(23);
            trabajador.setNombre("Marcos");
            trabajador.setTelefono(123456);
            trabajador.setSalario(2000);

        System.out.println("La persona " + persona.getNombre() + " tiene " + cliente.getEdad() + " años y su número es " + cliente.getTelefono());
        System.out.println("El cliente " + cliente.getNombre() + " tiene " + cliente.getEdad() + " años y su número es " + cliente.getTelefono() + " y tiene un crédito de " + cliente.getCredito());
        System.out.println("El trabajador " + trabajador.getNombre() + " tiene " + trabajador.getEdad() + " años y su número es " + trabajador.getTelefono() + " y cobra " + trabajador.getSalario() + "€");
    }

    static class Persona {
        int edad;
        String nombre;
        int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
    }

    static class Cliente extends Persona{
        int credito;

        public void setCredito(int credito){
            this.credito = credito;
        }

        public int getCredito(){
            return this.credito;
        }
    }

    static class Trabajador extends Persona{
        int salario;

        public void setSalario(int salario){
            this.salario = salario;
        }

        public int getSalario(){
            return this.salario;
        }
    }
}