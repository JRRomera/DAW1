from Red import Red
from Capa1AccesoMedio import Capa1AccesoMedio, TipoTecnologia,TipoMedio



def main()-> None:

    capaAccesoMedio: Capa1AccesoMedio = Capa1AccesoMedio(TipoMedio.INALAMBRICO, TipoTecnologia.WIFI_5)
    red: Red = Red(capaAccesoMedio)












if __name__ == '__main__':
    main()