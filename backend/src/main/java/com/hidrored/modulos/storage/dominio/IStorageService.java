package com.hidrored.modulos.storage.dominio;
import org.springframework.web.multipart.MultipartFile;

public interface IStorageService {
    /**
     * Guarda un archivo en el sistema de almacenamiento.
     * @param file Archivo a guardar.
     * @return El nombre o ruta del archivo guardado.
     * @throws StorageException si ocurre un error en el proceso.
     */
    String guardar(MultipartFile file);

    /**
     * Elimina un archivo existente.
     * @param fileName Nombre del archivo a borrar.
     * @throws StorageException si el archivo no existe o no se puede borrar.
     */
    void eliminar(String fileName);
}