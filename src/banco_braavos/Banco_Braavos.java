/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_braavos;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Banco_Braavos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, cedula;
        Cliente cliente1 = new Cliente("", "", "");
        Cuenta cuenta_cliente1 = new Cuenta(0, 0);
        Cuenta cuenta_cliente2 = new Cuenta(0, 0);
        Cuenta cuenta_cliente3 = new Cuenta(0, 0);
        Cuenta cuenta_cliente4 = new Cuenta(0, 0);
        Cuenta cuenta_cliente5 = new Cuenta(0, 0);
        int[] cuentas = new int[5];
        int opcion, submenu_crear_cuenta, saldo, submenu_ingresar_dinero;
        
        System.out.println("||**Bienvenido al banco de Baaviera**||");
        System.out.println("Digite su Nombre: ");
        nombre = entrada.next();
        cliente1.setNombre(nombre);
        System.out.println("Digite su Apellido: ");
        apellido = entrada.next();
        cliente1.setApellido(apellido);
        System.out.println("Digite su cedula: ");
        cedula = entrada.next();
        cliente1.setCedula(cedula);

        
        
        do{
            System.out.println(cliente1.getNombre()+ " Elija la acción que quieras realizar: ");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Salir");
            
            System.out.println(cliente1.getNombre()+" Digite una opción");
            opcion=entrada.nextInt();
            
            switch(opcion) {
              case 1:
                    do {
                        System.out.print("\n || 1. Crear cuenta nueva || ");
                        System.out.print("2. Crear una segunda cuenta");
                        System.out.print(" || 3. Crear una tercera cuenta || ");
                        System.out.print("4. Crear una cuarta cuenta");
                        System.out.print(" || 5. Crear una quinata cuenta || ");
                        System.out.print("6. Volver al menu anterior");
                        
                        
                        System.out.println("\n"+cliente1.getNombre()+" Digite una opción");
                        submenu_crear_cuenta=entrada.nextInt();
                        
                        switch(submenu_crear_cuenta) {
                            case 1:
                                
                                if(cuentas[0] == 0){
                                    cuenta_cliente1.setNumeroCuenta((int)Math.floor(Math.random()*1000+1));
                                cuenta_cliente1.setSaldo(saldo=0);
                                cuentas[0] = cuenta_cliente1.getNumeroCuenta();
                                System.out.println("***Su cuenta se ha creado con exito, su número es:*** "+ cuenta_cliente1.getNumeroCuenta()+ " Y su saldo es de: "+cuenta_cliente1.getSaldo());
                                
                                }else if(cuentas[0] != 0) {
                                    System.out.println("Lo sentimos ya tienes una cuenta creada");
                                }
                                
                                        
                                break;
                                
                             case 2:
                                
                                if(cuentas[1] == 0 & cuentas[0] != 0){
                                    cuenta_cliente2.setNumeroCuenta((int)Math.floor(Math.random()*1000+1));
                                cuenta_cliente2.setSaldo(saldo=0);
                                cuentas[1] = cuenta_cliente2.getNumeroCuenta();
                                System.out.println("***Su cuenta se ha creado con exito, su número es:*** "+ cuenta_cliente2.getNumeroCuenta()+ " Y su saldo es de: "+cuenta_cliente2.getSaldo());
                                
                                }else if(cuentas[1] != 0){
                                    System.out.println("Lo sentimos ya tienes una segunda cuenta creada");
                                    
                                }else if(cuentas[0] == 0){
                                    System.out.println("Debes tener una cuenta nueva para poder crear una segunda cuenta");
                                }
                                
                                        
                                break;
                                 
                             case 3:
                                 
                                if(cuentas[2] == 0 & cuentas[0] != 0 & cuentas[1] != 0){
                                cuenta_cliente3.setNumeroCuenta((int)Math.floor(Math.random()*1000+1));
                                cuenta_cliente3.setSaldo(saldo=0);
                                cuentas[2] = cuenta_cliente3.getNumeroCuenta();
                                System.out.println("***Su cuenta se ha creado con exito, su número es:*** "+ cuenta_cliente3.getNumeroCuenta()+ " Y su saldo es de: "+cuenta_cliente3.getSaldo());
                                
                                }else if(cuentas[2] != 0){
                                    System.out.println("Lo sentimos ya tienes una tercera cuenta creada");
                                    
                                }else if(cuentas[1] == 0){
                                    System.out.println("Debes tener una segunda cuenta para poder crear una tercera cuenta");
                                }    
                                break;
                                 
                             case 4:
                                
                                if(cuentas[3] == 0 & cuentas[0] != 0 & cuentas[1] != 0 & cuentas[2] != 0){
                                cuenta_cliente4.setNumeroCuenta((int)Math.floor(Math.random()*1000+1));
                                cuenta_cliente4.setSaldo(saldo=0);
                                cuentas[3] = cuenta_cliente4.getNumeroCuenta();
                                System.out.println("***Su cuenta se ha creado con exito, su número es:*** "+ cuenta_cliente4.getNumeroCuenta()+ " Y su saldo es de: "+cuenta_cliente4.getSaldo());
                                        
                                }else if(cuentas[3] != 0){
                                    System.out.println("Lo sentimos ya tienes una cuarta cuenta creada");
                                    
                                }else if(cuentas[2] == 0){
                                    System.out.println("Debes tener una tercera cuenta para poder crear una cuarta cuenta");
                                }    
                                
                                break;
                                 
                             case 5:
                                
                                if(cuentas[4] == 0 & cuentas[0] != 0 & cuentas[1] != 0 & cuentas[2] != 0 & cuentas[3] != 0){
                                cuenta_cliente5.setNumeroCuenta((int)Math.floor(Math.random()*1000+1));
                                cuenta_cliente5.setSaldo(saldo=0);
                                cuentas[4] = cuenta_cliente5.getNumeroCuenta();
                                System.out.println("***Su cuenta se ha creado con exito, su número es:*** "+ cuenta_cliente5.getNumeroCuenta()+ " Y su saldo es de: "+cuenta_cliente5.getSaldo());
                                      
                                }else if(cuentas[4] != 0){
                                    System.out.println("Lo sentimos ya tienes una quinta cuenta creada");
                                    
                                }else if(cuentas[3] == 0){
                                    System.out.println("Debes tener una cuarta cuenta para poder crear una quinta cuenta");
                                }    
                                
                                break;           
                                          
                        }
                                
                        }while(submenu_crear_cuenta !=6);
                        
                       
                    
                    break;
                    
                case 2:
                     System.out.println("**||Sus cuentas son las siguientes||**");
                     
                        
                        if(cuentas[0] != 0 || cuentas[1] != 0 || cuentas[2] != 0 || cuentas[3] != 0 || cuentas[4] != 0 || cuentas[0] == 0 || cuentas[1] == 0 || cuentas[2] == 0 || cuentas[3] == 0 || cuentas[4] == 0){
                            if(cuentas[0] != 0){
                                System.out.print("\n||  El número de su cuenta #1"+" es: "+cuentas[0]+ "  || "+" con un saldo de: "+ cuenta_cliente1.getSaldo());
                                
                            }else if(cuentas[0] == 0){
                                System.out.println("\nEsta cuenta no esta disponible por que no ha sido creada, antes de consultarla debes crearla correctamente");
                            }
                            
                            if(cuentas[1] != 0){                          
                                System.out.print("\n||  El número de su cuenta #2"+" es: "+cuentas[1]+ "  || "+" con un saldo de: "+ cuenta_cliente2.getSaldo());
                                
                            }else if(cuentas[1] == 0){
                                System.out.println("\nEsta cuenta no esta disponible por que no ha sido creada, antes de consultarla debes crearla correctamente");
                            }
                            
                            if(cuentas[2] != 0){
                                System.out.print("\n||  El número de su cuenta #3"+" es: "+cuentas[2]+ "  || "+" con un saldo de: "+ cuenta_cliente3.getSaldo());
                                
                            }else if(cuentas[2] == 0){
                                System.out.println("\nEsta cuenta no esta disponible por que no ha sido creada, antes de consultarla debes crearla correctamente");
                            }
                         
                            if(cuentas[3] != 0){
                                System.out.print("\n||  El número de su cuenta #4"+" es: "+cuentas[3]+ "  || "+" con un saldo de: "+ cuenta_cliente4.getSaldo());
                                
                            }else if(cuentas[3] == 0){
                               System.out.println("\nEsta cuenta no esta disponible por que no ha sido creada, antes de consultarla debes crearla correctamente"); 
                            }
                         
                            if(cuentas[4] != 0){
                                System.out.print("\n||  El número de su cuenta #5"+" es: "+cuentas[4]+ "  || "+" con un saldo de: "+ cuenta_cliente5.getSaldo());
                                
                            }else if(cuentas[4] == 0){
                                System.out.println("\nEsta cuenta no esta disponible por que no ha sido creada, antes de consultarla debes crearla correctamente"); 
                            }
                        }

                     System.out.println("\n*****************************************");
                     System.out.println("\n**||Tienes un total en todas las cuentas de: "+(cuenta_cliente1.getSaldo()+cuenta_cliente2.getSaldo()+cuenta_cliente3.getSaldo()+cuenta_cliente4.getSaldo()+cuenta_cliente5.getSaldo())+"$ pesos Colombianos||**");

                    break;
                   
                case 3:
                    System.out.println("\nIngresa el número de la cuenta a la cual quieres ingresarle el dinero");
                    
                    
                    
                    do {
                        System.out.print("\n || 1. Depositar en su cuenta #1 || ");
                        System.out.print("\n || 2. Depositar en su cuenta #2 || ");
                        System.out.print("\n || 3. Depositar en su cuenta #3 || ");
                        System.out.print("\n || 4. Depositar en su cuenta #4 || ");
                        System.out.print("\n || 5. Depositar en su cuenta #5 || ");
                        System.out.print("\n|| 6. Volver al menú anterior ||");
                        submenu_ingresar_dinero = entrada.nextInt();
                        
                    switch(submenu_ingresar_dinero){
                        
                        case 1:
                            if(cuentas[0] != 0){
                                System.out.println("Digite la cantidad que desea depositar");
                                saldo = entrada.nextInt();
                                cuenta_cliente1.ingresar_saldo(saldo);
                                
                                System.out.println("Ahora su saldo es de "+ cuenta_cliente1.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                
                            } else if(cuentas[0] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de depositar cualquier cantidad");
                            }
                            
                            break;
                         
                        case 2:
                            
                            if(cuentas[1] != 0){
                                System.out.println("Digite la cantidad que desea depositar");
                                saldo = entrada.nextInt();
                                cuenta_cliente2.ingresar_saldo(saldo);
                                
                                System.out.println("Ahora su saldo es de "+ cuenta_cliente2.getSaldo() +"$ pesos Colombianos en su cuenta #2");
                                
                            } else if(cuentas[1] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de depositar cualquier cantidad");
                            }
                            
                            break;
                            
                        case 3:
                            
                            if(cuentas[2] != 0){
                                System.out.println("Digite la cantidad que desea depositar");
                                saldo = entrada.nextInt();
                                cuenta_cliente3.ingresar_saldo(saldo);
                                
                                System.out.println("Ahora su saldo es de "+ cuenta_cliente3.getSaldo() +"$ pesos Colombianos en su cuenta #3");
                                
                            } else if(cuentas[2] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de depositar cualquier cantidad");
                            }
                            
                            break;
                            
                        case 4:
                            if(cuentas[3] != 0){
                                System.out.println("Digite la cantidad que desea depositar");
                                saldo = entrada.nextInt();
                                cuenta_cliente4.ingresar_saldo(saldo);
                                
                                System.out.println("Ahora su saldo es de "+ cuenta_cliente4.getSaldo() +"$ pesos Colombianos en su cuenta #4");
                                
                            } else if(cuentas[3] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de depositar cualquier cantidad");
                            }
                            break;
                            
                         case 5:
                            if(cuentas[4] != 0){
                                System.out.println("Digite la cantidad que desea depositar");
                                saldo = entrada.nextInt();
                                cuenta_cliente5.ingresar_saldo(saldo);
                                
                                System.out.println("Ahora su saldo es de "+ cuenta_cliente5.getSaldo() +"$ pesos Colombianos en su cuenta #5");
                                
                            } else if(cuentas[4] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de depositar cualquier cantidad");
                            }
                            break;
                        
                        
                        
                    }
                    
                    }while(submenu_ingresar_dinero !=6);
                    
                    break;
                    
                case 4:
                    
                    System.out.println("\nIngresa el número de la cuenta de la cual quieres retirar el dinero");
                    
                    
                    
                    do {
                        System.out.print("\n || 1. Retirar de su cuenta #1 || ");
                        System.out.print("\n || 2. Retirar de su cuenta #2 || ");
                        System.out.print("\n || 3. Retirar de su cuenta #3 || ");
                        System.out.print("\n || 4. Retirar de su cuenta #4 || ");
                        System.out.print("\n || 5. Retirar de su cuenta #5 || ");
                        System.out.print("\n|| 6. Volver al menú anterior ||");
                        submenu_ingresar_dinero = entrada.nextInt();
                        
                    switch(submenu_ingresar_dinero){
                        
                        case 1:
                            if(cuentas[0] != 0 & cuenta_cliente1.getSaldo()>0){
                                
                                
                                System.out.println("Digite la cantidad de dinero que desea retirar");
                                saldo = entrada.nextInt();
                                
                                if( saldo > cuenta_cliente1.getSaldo()){
                                    System.out.println("!Descarado¡, no hay fondos");
                                    System.out.println("Recuerde que su saldo es de "+ cuenta_cliente1.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                    
                                }else if(saldo <=  cuenta_cliente1.getSaldo()){                  
                                    cuenta_cliente1.retirar_saldo(saldo);
                                    System.out.println("Dinero retirado con exito");
                                    System.out.println("Ahora su saldo es de "+ cuenta_cliente1.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                }
                                
  
                            } else if(cuentas[0] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de retirar cualquier cantidad");
                                
                            } else if(cuenta_cliente1.getSaldo() <=0){
                                System.out.println("Saldo insuficiente, no sea conchudo");
                                
                            }
                            
                            break;
                         
                        case 2:
                            
                            if(cuentas[1] != 0 & cuenta_cliente2.getSaldo()>0){
                                
                                
                                System.out.println("Digite la cantidad de dinero que desea retirar");
                                saldo = entrada.nextInt();
                                
                                if( saldo > cuenta_cliente2.getSaldo()){
                                    System.out.println("!Descarado¡, no hay fondos");
                                    System.out.println("Recuerde que su saldo es de "+ cuenta_cliente2.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                    
                                }else if(saldo <=  cuenta_cliente2.getSaldo()){                  
                                    cuenta_cliente2.retirar_saldo(saldo);
                                    System.out.println("Dinero retirado con exito");
                                    System.out.println("Ahora su saldo es de "+ cuenta_cliente2.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                }
                                
  
                            } else if(cuentas[1] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de retirar cualquier cantidad");
                                
                            } else if(cuenta_cliente2.getSaldo() <=0){
                                System.out.println("Saldo insuficiente, no sea conchudo");
                                
                            }
                            
                            break;
                            
                        case 3:
                            
                            if(cuentas[2] != 0 & cuenta_cliente3.getSaldo()>0){
                                
                                
                                System.out.println("Digite la cantidad de dinero que desea retirar");
                                saldo = entrada.nextInt();
                                
                                if( saldo > cuenta_cliente3.getSaldo()){
                                    System.out.println("!Descarado¡, no hay fondos");
                                    System.out.println("Recuerde que su saldo es de "+ cuenta_cliente3.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                    
                                }else if(saldo <=  cuenta_cliente3.getSaldo()){                  
                                    cuenta_cliente3.retirar_saldo(saldo);
                                    System.out.println("Dinero retirado con exito");
                                    System.out.println("Ahora su saldo es de "+ cuenta_cliente3.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                }
                                
  
                            } else if(cuentas[2] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de retirar cualquier cantidad");
                                
                            } else if(cuenta_cliente3.getSaldo() <=0){
                                System.out.println("Saldo insuficiente, no sea conchudo");
                                
                            }
                            
                            break;
                            
                        case 4:
                            if(cuentas[3] != 0 & cuenta_cliente4.getSaldo()>0){
                                
                                
                                System.out.println("Digite la cantidad de dinero que desea retirar");
                                saldo = entrada.nextInt();
                                
                                if( saldo > cuenta_cliente4.getSaldo()){
                                    System.out.println("!Descarado¡, no hay fondos");
                                    System.out.println("Recuerde que su saldo es de "+ cuenta_cliente4.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                    
                                }else if(saldo <=  cuenta_cliente4.getSaldo()){                  
                                    cuenta_cliente4.retirar_saldo(saldo);
                                    System.out.println("Dinero retirado con exito");
                                    System.out.println("Ahora su saldo es de "+ cuenta_cliente4.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                }
                                
  
                            } else if(cuentas[3] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de retirar cualquier cantidad");
                                
                            } else if(cuenta_cliente4.getSaldo() <=0){
                                System.out.println("Saldo insuficiente, no sea conchudo");
                                
                            }
                            
                            break;
                            
                         case 5:
                            if(cuentas[4] != 0 & cuenta_cliente5.getSaldo()>0){
                                
                                
                                System.out.println("Digite la cantidad de dinero que desea retirar");
                                saldo = entrada.nextInt();
                                
                                if( saldo > cuenta_cliente5.getSaldo()){
                                    System.out.println("!Descarado¡, no hay fondos");
                                    System.out.println("Recuerde que su saldo es de "+ cuenta_cliente5.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                    
                                }else if(saldo <=  cuenta_cliente5.getSaldo()){                  
                                    cuenta_cliente5.retirar_saldo(saldo);
                                    System.out.println("Dinero retirado con exito");
                                    System.out.println("Ahora su saldo es de "+ cuenta_cliente5.getSaldo() +"$ pesos Colombianos en su cuenta #1");
                                }
                                
  
                            } else if(cuentas[4] == 0) {
                                System.out.println("Esta cuenta no ha sido creada, por favor crearla antes de retirar cualquier cantidad");
                                
                            } else if(cuenta_cliente5.getSaldo() <=0){
                                System.out.println("Saldo insuficiente, no sea conchudo");
                                
                            }
                            
                            break;
   
                    }
                    
                    }while(submenu_ingresar_dinero !=6);
                    
                    break;               
                    
            }
 
        }while(opcion !=5);
    }   
}
