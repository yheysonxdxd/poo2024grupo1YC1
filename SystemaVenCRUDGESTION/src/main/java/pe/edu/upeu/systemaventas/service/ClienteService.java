package pe.edu.upeu.systemaventas.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.systemaventas.modelo.Cliente;

@Service
public class ClienteService {

    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente categoria) {//crea
        return this.listaCli.add(categoria);
    }

    public List<Cliente> listarEntidad() {//reporta
        return listaCli;
    }

    public Cliente buscarCliente(String dnix) {
        return listaCli.stream()
                .filter(cliente -> cliente.getDni().equals(dnix))
                .findFirst()
                .orElse(null);
    }

    public Cliente updateEntidad(Cliente clientex) {//Actualiza
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDni().equals(clientex.getDni()))
                .findFirst()
                .ifPresent(cliente
                        -> cliente.setNombre(clientex.getNombre()));

        return buscarCliente(clientex.getDni());
    }

    public void deleteRegistEntdad(String dato) {//Borra
        this.listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDni().equals(dato))
                .findFirst().orElse(null));
    }
}
