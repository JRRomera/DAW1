



class PuntoAcceso:
    
    def __init__(self, ssid: str, contraseña: str) -> None:
        self.__ssid = ssid
        self.__contraseña = contraseña


    @property ## getter ssid
    def ssid(self) -> str:
        return self.__ssid


    @property ##getter contraseña
    def contraseña(self) -> str:
        return self.__contraseña
    

    @ssid.setter ##setter ssid
    def ssid(self, valor: str)-> None:
        self.__ssid = valor


    @contraseña.setter #setter contraseña
    def contraseña(self, valor: str) -> None:
        self.__contraseña = valor





class PuntoAccesoError(Exception):
    ...