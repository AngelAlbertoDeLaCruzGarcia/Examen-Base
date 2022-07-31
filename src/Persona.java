
public class Persona {
    String nombre = "", NSS = generaNSS();
    int edad = 0;
    char sexo = 'H';
    double peso = 0, altura = 0;

    public Persona() {}

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    protected boolean comprobarSexo(char sexo) {
        if(sexo == 'h' || sexo == 'H' || sexo == 'm' || sexo == 'M') {
            return true;
        }
        return false;
    }

    protected boolean esMayorDeEdad(){
        if(this.edad >= 18) {
            return true;
        }
        return false;
    }

    protected int calcularIMC() {
        double imc = peso / (altura * altura);
        if(sexo == 'h' || sexo == 'H') {
            if (imc < 20) {
                return -1;
            } else if (imc <= 25) {
                return 0;
            } else {
                return 1;
            }
        }else {
            if (imc < 19) {
                return -1;
            } else if (imc <= 24) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    private String generaNSS() {
        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result1 = "";
        int charactersLength = characters.length();
        for (int i = 0; i < 8; i++) {
            result1 += characters.charAt(
                    (int) Math.floor(Math.random() * charactersLength)
            );
        }
        return result1;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nss='" + NSS + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNSS() {
        return NSS;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
