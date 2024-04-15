import unittest

from PuntoAcceso import PuntoAcceso, PuntoAccesoError


class TestPuntoAcceso(unittest.TestCase): 

    def test_init(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345')
        self.assertIsInstance(punto_acceso, PuntoAcceso)
        self.assertEqual(punto_acceso.ssid, 'wifi_romera')
        self.assertEqual(punto_acceso.contraseña, '12345')
        self.assertListEqual(punto_acceso.equipos_conectados, [])

    def test_conectar(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345')
        self.assertListEqual(punto_acceso.equipos_conectados, [])
        punto_acceso.conectar('AA:AA:AA:AA:AA:01','12345')
        self.assertListEqual(punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:01'])
        
        punto_acceso.conectar('AA:AA:AA:AA:AA:02','12345')
        self.assertListEqual(punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:01','AA:AA:AA:AA:AA:02'])

        with self.assertRaises(PuntoAccesoError): 
            punto_acceso.conectar('AA:AA:AA:AA:AA:02','12234')
        self.assertListEqual(punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:01','AA:AA:AA:AA:AA:02'])


if __name__ == '__main__':
    unittest.main()