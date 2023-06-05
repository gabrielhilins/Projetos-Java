/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcaoeprocedimento;

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class Funcaoeprocedimento {

    public static void main(String[] args) {

        Scanner dado;
        dado = new Scanner(System.in);
        int opcao;
        double r, lcubo, v, altura, largura, comprimento;
        
        do {
            menu();
            System.out.println("Escolha uma opção");
            opcao = dado.nextInt();
            
            switch(opcao){
                case 1 -> {
                    System.out.println("Digite o lado do cubo");
                    lcubo = dado.nextDouble();
                    v = volumeCubo(lcubo);
                    System.out.println("o volume do cubo de lado" + lcubo + "é" + v);
                }
                
                case 2 -> {
                    System.out.println("Digite as dimensões do parelelepípedo (altura, largura e comprimento):");
                    System.out.println("Altura:");
                    altura = dado.nextDouble();
                    System.out.println("Largura:");
                    largura = dado.nextDouble();
                    System.out.println("Comprimento:");
                    comprimento = dado.nextDouble();
                    v = volumeParalelepipedo(altura, largura, comprimento);
                    System.out.println("o volume do paralelepípedo com dimensões" + altura + ", " + largura + ", " + ", " + comprimento);
                }
                
                case 0 -> System.out.println("Fim do programa");
                default -> System.out.println("Opção inválida");
            } 
            while(opcao!=0)
                
            
                
        public static double volumeCubo(double lcubo){
                 return (lcubo*lcubo*lcubo);
             }
             public static double volumeParalelepipedo(double altura, double largura, double comprimento){
              return (altura*largura*comprimento);   
    }
             public static void menu(){
                 System.out.println("1) Cácular o volume do Cubo");
                 System.out.println("2) Cácular o volume do Paralelepípedo");
                 System.out.println("0) Sair");
                 
             }
    
                    
                    
                
                    
                
                    
                
            
                
                
                
                  
                  
                  
                
            }
        

