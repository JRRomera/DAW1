from enum import Enum, auto


class TipoWifi(Enum):
    WIFI_1 = auto()
    WIFI_2 = auto()
    WIFI_3 = auto()
    WIFI_4 = auto()
    WIFI_5 = auto()
    WIFI_6 = auto()


class PuntoAcceso:

    __encendido: bool = False

    def __init__(self, ssid: str, contraseña: str, tiposWifi: list[TipoWifi]) -> None:
        self.__ssid = ssid
        self.__contraseña = contraseña
        self.__tiposWifi = tiposWifi


    @property ##GETTER SSID
    def ssid(self) -> str:
        return self.__ssid
    

    @property ##GETTER contraseña
    def contraseña(self) -> str:
        return self.__contraseña
    

    @property ##GETTER tipoWifi
    def tiposWifi(self) -> list[TipoWifi]:
        return self.__tiposWifi
    

    @ssid.setter #SETTER SSID
    def ssid(self, valor: str) -> None:
        self.__ssid = valor


    @contraseña.setter #SETTER CONTRASEÑA
    def contraseña(self, valor: str) -> None:
        self.__contraseña = valor

    
