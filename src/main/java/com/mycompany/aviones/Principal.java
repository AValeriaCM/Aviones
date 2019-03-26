/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aviones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SPC7Z
 */
public class Principal {
    
    private List<Silla> listaPreferencial = new ArrayList<>();
    private List<Silla> listaGeneral = new ArrayList<>();
    private List<Silla> listaMixto = new ArrayList<>();
    private Silla silla;
    private String id;
    private int identificacion;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private int numeroSilla;
    private String tipoSilla;
    Scanner teclado = new Scanner(System.in);

    public Principal() {
        
        menu();
        
    }

    public void menu(){
        int opc2;

        System.out.println("       INGRESE VUELO");
        System.out.println("1. AVION PREFERENCIAL");
        System.out.println("2. AVION GENERAL");
        System.out.println("3. AVION MIXTO");

        llenaDatos();
        Scanner teclado2 = new Scanner(System.in);
        opc2 = teclado2.nextInt();
        byte aux;
        switch(opc2){
            case 1:
                               
                imprimeSillaPrefer();
                vendeTiquete();
                System.out.println("-------------------------------------");
                imprimeSillaPrefer();
                System.out.println(" ---------------------- ");
                System.out.println("  ¿DESEA COMPRAR OTRA SILLA? ");
                System.out.println("1.  SI");
                System.out.println("2.  NO");
                aux = teclado.nextByte();
                switch(aux){
                    case 1:  
                        vendeTiquete();
                        System.out.println("--------------------------------");
                        imprimeSillaPrefer();
                        break;
                    case 2:
                        imprimeFactura();
                    break;
                }
                break;
            case 2:
                System.out.println("-------------------------------------");
                imprimeSillaGener();
                vendeTiquete();
                System.out.println("-----------------------------------");
                imprimeSillaGener();
                System.out.println(" ---------------------- ");
                System.out.println("  ¿DESEA COMPRAR OTRA SILLA? ");
                System.out.println("1.  SI");
                System.out.println("2.  NO");
                aux = teclado.nextByte();
                switch(aux){
                    case 1:  
                        vendeTiquete();
                        System.out.println("-------------------------------------");
                        imprimeSillaGener();
                        break;
                    case 2:
                        imprimeFactura();
                    break;
                }
                break;
            case 3:
                System.out.println("------------------------------------");
                imprimeSillaMix();
                vendeTiquete();
                System.out.println("----------------------------------");
                imprimeSillaMix();
                System.out.println(" ---------------------- ");
                System.out.println("  ¿DESEA COMPRAR OTRA SILLA? ");
                System.out.println("1.  SI");
                System.out.println("2.  NO");
                aux = teclado.nextByte();
                switch(aux){
                    case 1:  
                        vendeTiquete();
                        System.out.println("--------------------------");
                        imprimeSillaMix();
                        break;
                    case 2:
                        imprimeFactura();
                    break;
                }
                break;
        } 
         


    }
    
    private void llenaDatos(){
        
        listaPreferencial.add(silla = new Silla("preferencial", 1, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",2, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",3, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",4, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",5, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",6, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",7, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",8, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",9, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",10, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",11, 0, null));
        listaPreferencial.add(silla = new Silla("preferencial",12, 0, null));
        
        listaGeneral.add(new Silla("general",1, 0, null));
        listaGeneral.add(new Silla("general",2, 0, null));
        listaGeneral.add(new Silla("general",3, 0, null));
        listaGeneral.add(new Silla("general",4, 0, null));
        listaGeneral.add(new Silla("general",5, 0, null));
        listaGeneral.add(new Silla("general",6, 0, null));
        listaGeneral.add(new Silla("general",7, 0, null));
        listaGeneral.add(new Silla("general",8, 0, null));
        listaGeneral.add(new Silla("general",9, 0, null));
        listaGeneral.add(new Silla("general",10, 0, null));
        listaGeneral.add(new Silla("general",11, 0, null));
        listaGeneral.add(new Silla("general",12, 0, null));
        
        listaMixto.add(new Silla("general",1, 0, null));
        listaMixto.add(new Silla("general",2, 0, null));
        listaMixto.add(new Silla("general",3, 0, null));
        listaMixto.add(new Silla("general",4, 0, null));
        listaMixto.add(new Silla("general",5, 0, null));
        listaMixto.add(new Silla("preferencial",6, 0, null));
        listaMixto.add(new Silla("preferencial",7, 0, null));
        listaMixto.add(new Silla("preferencial",8, 0, null));
        listaMixto.add(new Silla("preferencial",9, 0, null));
        listaMixto.add(new Silla("preferencial",10, 0, null));
        listaMixto.add(new Silla("preferencial",11, 0, null));
        listaMixto.add(new Silla("preferencial",12, 0, null));
        
    }
    
    private void imprimeSillaPrefer(){
        int cont=0;
                System.out.println("PREFERENCIAL/----------\\------------");
                System.out.println("-----------/------------\\----------");
                System.out.println("----------/--------------\\---------");
                System.out.println("---------/----------------\\--------");
                System.out.println("--------/------------------\\-------");
                System.out.println("-------/--------------------\\------");
        for(int i =0; i< listaPreferencial.size(); i++){
            cont++;
            System.out.print("\t"+ "("+ listaPreferencial.get(i).getEstado() + " -P)");
            if(cont == 3){
                System.out.println("\n");
                cont = 0;
            }
        }
                System.out.println("--------\\-------------------/------");
                System.out.println("---------\\-----------------/-------");
                System.out.println("----------\\---------------/--------");
                System.out.println("-----------\\-------------/---------");
                System.out.println("------------\\-----------/----------");
                System.out.println("-------------\\---------/-----------");
                System.out.println("\n");
                System.out.println("\n");
        
    }
    
    private void imprimeSillaGener(){
        System.out.println("GENERAL-----/----------\\------------");
        System.out.println("-----------/------------\\----------");
        System.out.println("----------/--------------\\---------");
        System.out.println("---------/----------------\\--------");
        System.out.println("--------/------------------\\-------");
        System.out.println("-------/--------------------\\------");
        int cont=0;
        for(int i =0; i< listaGeneral.size(); i++){
            cont++;
            System.out.print("\t"+ "("+ listaGeneral.get(i).getEstado() + " -G)");
            if(cont == 3){
                System.out.println("\n");
                cont = 0;
            }
        }
                System.out.println("--------\\-------------------/------");
                System.out.println("---------\\-----------------/-------");
                System.out.println("----------\\---------------/--------");
                System.out.println("-----------\\-------------/---------");
                System.out.println("------------\\-----------/----------");
                System.out.println("-------------\\---------/-----------");
                System.out.println("\n");
                System.out.println("\n");
    }
    
    private void imprimeSillaMix(){
        
        int cont=0;
        System.out.println("MIXTO-------/----------\\------------");
        System.out.println("-----------/------------\\----------");
        System.out.println("----------/--------------\\---------");
        System.out.println("---------/----------------\\--------");
        System.out.println("--------/------------------\\-------");
        System.out.println("-------/--------------------\\------");
        for(int i =0; i< listaMixto.size(); i++){
            cont++;
            if(listaMixto.get(i).getTipo().equalsIgnoreCase("preferencial")){
                System.out.print("\t"+ "("+ listaMixto.get(i).getEstado() + " -P)");
            } if(listaMixto.get(i).getTipo().equalsIgnoreCase("general")){
                System.out.print("\t"+  "("+listaMixto.get(i).getEstado() + " -G)");
            }
            if(cont == 3){
                System.out.println("\n");
                cont = 0;
            }
        }
                System.out.println("--------\\-------------------/------");
                System.out.println("---------\\-----------------/-------");
                System.out.println("----------\\---------------/--------");
                System.out.println("-----------\\-------------/---------");
                System.out.println("------------\\-----------/----------");
                System.out.println("-------------\\---------/-----------");
                System.out.println("\n");
                System.out.println("\n");
    }
    
    private void vendeTiquete(){
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        try{
            
            System.out.print("IDENTIFICACION : ");
                id = teclado.next();
                if(validaId(id)==2){
                    System.out.print("IDENTIFICACION : ");
                    id = teclado.next();
                    if(validaId(id)==2){
                        System.out.print("IDENTIFICACION : ");
                        id = teclado.next();
                    }
                }
           
                System.out.println("FECHA DE NACIMIENTO (dd/MM/yyyy) : ");
                fechaNac = teclado.next();
                if(validaFecha(fechaNac)==2){
                    System.out.println("FECHA DE NACIMIENTO (dd/MM/yyyy) : ");
                    fechaNac = teclado.next();
                     if(validaFecha(fechaNac)==2){
                        System.out.println("FECHA DE NACIMIENTO (dd/MM/yyyy) : ");
                        fechaNac = teclado.next();
                     }
                }
                date = format.parse(fechaNac);
                System.out.print("NOMBRE : ");
                nombre = teclado.next();
                System.out.print("APELLIDO : ");
                apellido = teclado.next();
                System.out.print("NUMERO DE SILLA : ");
                numeroSilla = teclado.nextInt();
                System.out.println("TIPO DE VUELO (G/P): ");
                tipoSilla = teclado.next();
                if(tipoSilla.equalsIgnoreCase("g")){
                    tipoSilla = "general";
                } else if(tipoSilla.equalsIgnoreCase("p")){
                    tipoSilla = "preferencial";
                } else{
                    System.out.println("DATO INCORRECTO");
                }
                identificacion = Integer.parseInt(id);
                Persona persona1 = new Persona(identificacion, nombre, apellido, date);

                silla = new Silla(tipoSilla,numeroSilla, 1, persona1);
                
                if(tipoSilla.equalsIgnoreCase("general")){

                    for (Silla silla1 : listaGeneral) {
                        if(silla1.getId() == silla.getId()){
                            silla1.setTipo(tipoSilla);
                            silla1.setId(numeroSilla);
                            silla1.setEstado(1);
                            silla1.setPersona(persona1);
                        }
                    }
                } else if(tipoSilla.equalsIgnoreCase("preferencial")){

                    for (Silla silla2 : listaPreferencial) {
                        if(silla2.getId() == silla.getId()){
                            silla2.setTipo(tipoSilla);
                            silla2.setId(numeroSilla);
                            silla2.setEstado(1);
                            silla2.setPersona(persona1);
                        }
                    }
                } else{

                    for (Silla silla3 : listaMixto) {
                        if(silla3.getId() == silla.getId()){
                            silla3.setTipo(tipoSilla);
                            silla3.setId(numeroSilla);
                            silla3.setEstado(1);
                            silla3.setPersona(persona1);
                        }
                    }
                }
                //}while(validaNombre(nombre)&&validaNombre(apellido)&&validaFecha(fechaNac)&&validaId(id));
        } catch (ParseException e){
            teclado.reset();
            System.out.println("VALORES INCORRECTOS");
            teclado.skip("\n");
            vendeTiquete();
        } catch (InputMismatchException ex){
            teclado.next();
            System.out.println("VALORES INCORRECTOS");
            teclado.skip("\n");
            vendeTiquete();
        }
    }
    
    private void imprimeFactura(){
        
        System.out.println("*********************************************");
        System.out.println("**  "+ "NOMBRE : " + nombre );
        System.out.println("**");
        System.out.println("**  "+ "APELLIDO : " + apellido );
        System.out.println("**");
        System.out.println("**  "+ "ID : " + identificacion );
        System.out.println("**");
        System.out.println("**  "+ "TIPO DE VUELO : " + silla.getTipo() );
        System.out.println("**");
        System.out.println("**  "+ "NUMERO DE SILLA : " + silla.getId() );
        System.out.println("**");
        System.out.println("********************************************");
        
    }
    
    private int validaNombre(String cadena){
        int aux=0;
        Pattern p = Pattern.compile("^[a-zA-Z\\s]");
        Matcher matcher = p.matcher(cadena);
        boolean cadenaValida = matcher.matches();
        if (cadenaValida) {
            System.out.println("--Ok");
            aux=1;
        }
        else {
            System.out.println("El dato NO es válido");
            aux=2;
        }
        return aux;
    }
    
    private int validaFecha(String fecha){
        int aux=0;
        Pattern p = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        Matcher matcher = p.matcher(fecha);
        
        boolean cadenaValida = matcher.matches();
        if (cadenaValida) {
            System.out.println("--Ok");
            aux=1;
        }
        else {
            System.out.println("La fecha NO es válida");
            aux=2;
        }
        return aux;
    }
    
    private int validaId(String id){
        int aux=0;
        Pattern p = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = p.matcher(id);
        boolean cadenaValida = matcher.matches();
        if (cadenaValida) {
            System.out.println("--Ok");
            aux=1;
        }
        else {
            System.out.println("Id NO es válido");
            aux=2;
        }
        return aux;
    }
}
