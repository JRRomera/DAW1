
from enum import Enum,auto


class TipoFiltrado(Enum):
    LISTA_BLANCA = auto()
    LISTA_NEGRA = auto()


class PuntoAcceso:
    
    def __init__(self, ssid: str, contraseña: str) -> None:
        self.__ssid = ssid
        self.__contraseña = contraseña
        self.__esta_contarfuegos_activado: bool = False
        self.__equipos_conectados: list[str] = []
        self.__tipo_filtrado: TipoFiltrado = TipoFiltrado.LISTA_BLANCA
        self.__equipos_filtrados: list[str] = []


    @property ##getter ssid
    def ssid(self) -> str:
        return self.__ssid


    @property ##getter contraseña
    def contraseña(self) -> str:
        return self.__contraseña
    

    @ssid.setter ##setter ssid
    def ssid(self, valor: str) -> None:
        self.__ssid = valor


    @contraseña.setter ##setter contraseña
    def contraseña(self, valor: str) -> None:
        self.__contraseña = valor


    @property ##getter equipos_conectados
    def equipos_conectados(self) -> list:
        return self.__equipos_conectados


    @property ##getter esta_cortafuegos_activado
    def esta_cortafuegos_activado(self) -> bool:
        return self.__esta_contarfuegos_activado


    @property ##getter tipo_filtrado
    def tipo_filtrado(self)-> TipoFiltrado:
        return self.__tipo_filtrado


    @tipo_filtrado.setter ##setter tipo_filtrado
    def tipo_filtrado(self, valor: TipoFiltrado) -> None:
        self.__tipo_filtrado = valor


    @property ##getter equipos_filtrados
    def equipos_filtrados(self)-> list:
        return self.__equipos_filtrados


    def añadirEquipo(self, direccion_equipo: str) -> None:
        self.__equipos_conectados.append(direccion_equipo)


    def activar_cortafuegos(self) -> None:
        self.__esta_contarfuegos_activado = True

    
    def desactivar_cortafuegos(self) -> None:
        self.__esta_contarfuegos_activado = False


    def agregar_equipo_filtrado(self, equipo: str) -> None:
        self.__equipos_filtrados.append(equipo)

    
    def desagregar_equipo_filtrado(self, equipo: str) -> None:
        self.__equipos_filtrados.remove(equipo)



class PuntoAccesoError(Exception):
    ...