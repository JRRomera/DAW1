from PuertoRed import PuertoRed


class Conmutador:

    __puertos: list[PuertoRed] = []
    __encendido: bool = False


    def __init__(self, cantidad_puertos: int) -> None:
        self.__cantidad_puertos = cantidad_puertos


    @property ##GETTER ENCENDIDO
    def encendido(self) -> bool:
        return self.__encendido
    

    @property ##GETTER PUERTOS
    def puertos(self)->list[PuertoRed]:
        return self.__puertos
    
    @property ##GETTER CANTIDAD PUERTOS
    def cantidad_puertos(self) -> int:
        return self.__cantidad_puertos

    # @encendido.setter
    # def encendido(self, valor: bool) -> None:
    #     self.__encendido = valor


    def encender(self):
        self.__encendido=True
    

    def apagar(self):
        self.__encendido=False


    def añadir_puertos(self,puerto: PuertoRed):
        if self.__encendido:
            raise ConmutadorError ('El conmmutador está encendido.')
        elif len(self.__puertos) == self.__cantidad_puertos:
            raise ConmutadorError ('El comnutador está completo.')
        
        self.__puertos.append(puerto)



class ConmutadorError(Exception):
    ...
