import java.io.File;

public class buscadorMain{
    public static void main(String[] args) {
        File directorioFile = new File("D:/Users/admin/Desktop/Trabajos/Videojuegos para móviles");
        System.out.println(buscar("planta.png", directorioFile));
    }

    private static File buscar(String archivoABuscar, File directorio) {
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            if (archivo.getName().equals(archivoABuscar)) {
                return archivo;
            }
            if (archivo.isDirectory()) {
                File resultadoRecursion = buscar(archivoABuscar, archivo);
                if (resultadoRecursion != null) {
                    return resultadoRecursion;
                }
            }
        }
        return null;
    }
}
