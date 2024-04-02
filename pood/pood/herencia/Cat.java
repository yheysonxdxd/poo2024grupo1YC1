/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.eduupwu.pood.herencia;

/**
 *
 * @author Datos
 */
public class Cat extends Vehicle {
    private String modelo = "Mustang";
   private void aplicarHerencia() {
       System.err.println("la marca es;"+marca);
        System.out.println("este carro es de la MARCA;"+ marca+"y el modelo es"+modelo) ;
        sonido();
    }
    public static void main(String[] args) {
        new Cat().aplicarHerencia();
    }
}
