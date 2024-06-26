import unittest

from Conmutador import Conmutador, ConmutadorError
from DireccionFisica import DireccionFisica
from PuertoRed import PuertoRed, Tecnologia

class TestConmutador(unittest.TestCase):
    

    def test_init(self):

        conmutador = Conmutador(10)
        self.assertIsInstance(conmutador, Conmutador)


    def test_getter_encendido(self):
        conmutador = Conmutador(10)
        self.assertFalse(conmutador.encendido)

    def test_encender(self):
        conmutador = Conmutador(10)
        self.assertFalse(conmutador.encendido)

        conmutador.encender()  
        self.assertTrue(conmutador.encendido)


    def test_apagar(self):
        conmutador = Conmutador(10)
        self.assertFalse(conmutador.encendido)

        conmutador.encender()
        conmutador.apagar()
        self.assertFalse(conmutador.encendido)

    def test_añadir_puerto(self):
        conmutador = Conmutador(4)
        
        direccion1 = DireccionFisica("AA:AA:AA:AA:AA:AA")
        puerto1 = PuertoRed(direccion1, Tecnologia.PAR_TRENZADO_1000)

        conmutador.añadir_puertos(puerto1)
        self.assertEqual(len(conmutador.puertos),1)
        self.assertListEqual(conmutador.puertos, [puerto1])

        conmutador.encender()
        direccion2 = DireccionFisica("AA:AA:AA:AA:AA:BB")
        puerto2 = PuertoRed(direccion2, Tecnologia.PAR_TRENZADO_1000)
        with self.assertRaises(ConmutadorError):
            conmutador.añadir_puertos(puerto2)

        conmutador.apagar()
        conmutador.añadir_puertos(puerto2)
        self.assertEqual(len(conmutador.puertos),2)
        self.assertListEqual(conmutador.puertos, [puerto1,puerto2])

        direccion3 = DireccionFisica("AA:AA:AA:AA:AA:CC")
        puerto3 = PuertoRed(direccion3, Tecnologia.PAR_TRENZADO_1000)
        conmutador.añadir_puertos(puerto3)
        self.assertEqual(len(conmutador.puertos),3)
        self.assertListEqual(conmutador.puertos, [puerto1,puerto2,puerto3])

        direccion4 = DireccionFisica("AA:AA:AA:AA:AA:DD")
        puerto4 = PuertoRed(direccion4, Tecnologia.PAR_TRENZADO_1000)
        conmutador.añadir_puertos(puerto4)
        self.assertEqual(len(conmutador.puertos),4)
        self.assertListEqual(conmutador.puertos, [puerto1,puerto2,puerto3,puerto4])

        direccion5 = DireccionFisica("AA:AA:AA:AA:AA:EE")
        puerto5 = PuertoRed(direccion5, Tecnologia.PAR_TRENZADO_1000)
        with self.assertRaises(ConmutadorError):
            conmutador.añadir_puertos(puerto5)





if __name__ == '__main__':
    unittest.main()