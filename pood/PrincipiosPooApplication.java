package pe.eduupwu.pood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.eduupwu.pood.cobjeto.Persona;

@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipiosPooApplication.class, args);
                Persona person=new Persona();
                person.setNombre("david");
                person.setEdad(36);
                person.edad=38;
                System.out.println("yo soy"+person.getNombre()
                +"y tengo"+person.getEdad()+"años");
                person.saludo();
	}
public class Vehicle {
protected String marca = "Ford"; //attribute
public void sonido() {//method
System.out.println("Tuut, tuut!");
} 
}

}
