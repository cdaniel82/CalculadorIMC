package Libreria;

public class IMC implements IIMC {

    // atributos
    public float altura;
    public float peso;

    // constructor por defecto
    public IMC() {
        this.altura = 0;
        this.peso = 0;
    }

    public IMC(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    // propiedades
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // metodos
    
    @Override
    public float obtenerIMC(float altura, float peso) {
        float valorImc;
        valorImc = peso / (altura * altura);
        return (float) valorImc;
    }

    public String obtenerClasificacion() {
        String clasificacion = null;
        //clasificacion = "Prueba";
        if (obtenerIMC(altura, peso) < 16) {
            clasificacion = "Infrapeso: Delgadez Severa";
        } else {
            if (obtenerIMC(altura, peso) < 17) {
                clasificacion = "Infrapeso: Delgadez Moderada";
            } else {
                if (obtenerIMC(altura, peso) < 18.50) {
                    clasificacion = "Infrapeso: Deladez Aceptable";
                } else {
                    if (obtenerIMC(altura, peso) < 25) {
                        clasificacion = "Peso Normal";
                    } else {
                        if (obtenerIMC(altura, peso) < 30) {
                            clasificacion = "Sobrepeso";
                        } else {
                            if (obtenerIMC(altura, peso) < 35) {
                                clasificacion = "Obeso: Tipo I";
                            } else {
                                if (obtenerIMC(altura, peso) <= 40) {
                                    clasificacion = "Obeso: Tipo II";
                                } else {
                                    if (obtenerIMC(altura, peso) > 40) {
                                        clasificacion = "Obeso: Tipo III";
                                    } else {
                                        clasificacion = "Error al calcular";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return clasificacion;
    }

    public String obtenerDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Su estatura: ").append(getAltura()).append("\n");
        sb.append("Su peso: ").append(getPeso()).append("\n");
        return sb.toString();
    }
}
