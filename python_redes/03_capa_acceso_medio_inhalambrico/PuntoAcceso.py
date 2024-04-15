from Equipo import Equipo



class PuntoAccesoError(Exception):
    ...


class PuntoAcceso:
    



    def __init__(self, ssid: str, contraseña: str) -> None:
        self.ssid = ssid
        self.contraseña = contraseña
        self.equipos_conectados: list[str] = []

    def conectar(self, direccion_fisica: str, contraseña: str):
        if self.contraseña != contraseña:
            raise PuntoAccesoError ('La contraseña no es correcta. ')

        self.equipos_conectados.append(direccion_fisica)


