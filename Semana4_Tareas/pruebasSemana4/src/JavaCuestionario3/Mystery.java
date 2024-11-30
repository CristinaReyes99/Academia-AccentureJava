package JavaCuestionario3;

public class Mystery {
    // Instancia única de la clase
    private static Mystery instance = null;

    // Constructor protegido para evitar instancias directas
    protected Mystery() {
    }

    // Método estático para obtener la instancia única
    public static Mystery getInstance() {
        if (instance == null) {
            instance = new Mystery(); // Crear una nueva instancia si no existe
        }
        return instance; // Retornar la instancia existente
    }
}
