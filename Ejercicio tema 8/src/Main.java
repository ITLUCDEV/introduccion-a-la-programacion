public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(19);
        persona.setNombre("Juan");
        persona.setTelefono(123456);
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años y su número es " + persona.getTelefono());
    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

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
}