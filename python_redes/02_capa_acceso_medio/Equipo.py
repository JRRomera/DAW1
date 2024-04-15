from PuertoRed import PuertoRed,Tecnologia
from PuntoAcceso import PuntoAcceso, TipoWifi

class EquipoError(Exception):
    ...

class Equipo:

    def __init__(self, nombre: str, ) -> None:
        self.__nombre = nombre


    @property
    def nombre(self)-> str:
        return self.__nombre
    
    def añadir_puerto_red(self, puerto_red: PuertoRed) -> None:
        self.__puerto_red = puerto_red

    
    def conectar_a_wifi(self, ssid: str, contraseña: str):
        if self.__puerto_red is None:
            raise EquipoError ("El equipo no tiene tarjeta de red.")
        if self.__puerto_red.tecnologia != Tecnologia.WIFI_300 or Tecnologia.WIFI_600:
            raise EquipoError("El equipo no tiene una tarjeta de red WIFI.")
        
        #falta comprobar ssid y contraseña
        #nos conectamos