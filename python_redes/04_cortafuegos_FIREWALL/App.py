from PuntoAcceso import PuntoAcceso,TipoFiltrado

punto_acceso = PuntoAcceso('wifi_romera','12345')

def main():
        opcion = 1
        while opcion != 10:
            imprimirMenu()
            opcion = input('Elige una opcion> ')
            print('')
            match(opcion):
                 case '1': cambiar_SSID(punto_acceso)
                 case '2': cambiar_contraseña(punto_acceso)
                 case '3': activar_firewall(punto_acceso)
                 case '4': desactivar_firewall(punto_acceso)
                 case '5': mostrar_usuarios_conectados(punto_acceso)
                 case '6': print('en construcción')
                 case '7': print('en construcción')
                 case '8': mostrar_datos(punto_acceso)
                 case '9': conectar_equipo(punto_acceso)
                 case '10': break
                    



def imprimirMenu():
    print('')
    print('Menú punto de acceso')
    print('--------------------')
    print('1- Cambiar SSDI ')
    print('2- Cambiar contraseña ')
    print('3- Activar firewall ')
    print('4- Desactivar firewall ')
    print('5- Usuarios conectados ')
    print('6- Lista blanca')
    print('7- Lista negra')
    print('8- Mostrar datos.')
    print('9- Conectar equipo')
    print('10- Salir')
    print('')
 

def cambiar_SSID(PuntoAcceso: PuntoAcceso):
     nuevo_ssid= input('Dime la nueva SSID: ') 
     PuntoAcceso.ssid = nuevo_ssid
     

def cambiar_contraseña(PuntoAcceso: PuntoAcceso):
     
    nueva_contraseña = input ('Dime la nueva contraseña: ')
    PuntoAcceso.contraseña = nueva_contraseña


def activar_firewall(PuntoAcceso: PuntoAcceso):
     PuntoAcceso.activar_cortafuegos
     print('Firewall activado')
     print(PuntoAcceso.esta_cortafuegos_activado)


def desactivar_firewall(PuntoAcceso: PuntoAcceso):
     PuntoAcceso.desactivar_cortafuegos
     print('Firewall desactivado')


def mostrar_usuarios_conectados(PuntoAcceso: PuntoAcceso):
     for equipo in PuntoAcceso.equipos_conectados:
          print('Los equipos conectados son:')
          print(equipo)
     

def mostrar_datos(PuntoAcceso: PuntoAcceso):
     print(f'SSID: {punto_acceso.ssid} ')
     print(f'Contraseña: {punto_acceso.contraseña} ')


def conectar_equipo(PuntoAcceso: PuntoAcceso):
     check = input('Dime la contraseña: ')
     if check == PuntoAcceso.contraseña:
          nombre_equipo = input('Dime la MAC del equipo: ')
          PuntoAcceso.añadirEquipo(nombre_equipo)
     else: 
          print('Contraseña incorrecta.')




if __name__ == '__main__':
    main()