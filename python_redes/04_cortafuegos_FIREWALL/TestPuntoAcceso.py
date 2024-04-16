import unittest
from PuntoAcceso import PuntoAcceso, PuntoAccesoError,TipoFiltrado

class TestTestPuntoAcceso(unittest.TestCase):

    def setUp(self) -> None:
        self.punto_acceso = PuntoAcceso('wifi_romera', '12345')



    def test_init(self):
        # self.punto_acceso = PuntoAcceso('wifi_romera','12345')
        self.assertIsInstance(self.punto_acceso,PuntoAcceso)
        self.assertEqual(self.punto_acceso.ssid, 'wifi_romera') 
        self.assertEqual(self.punto_acceso.contraseña, '12345') 
        self.assertListEqual(self.punto_acceso.equipos_conectados, [])
        self.assertFalse(self.punto_acceso.esta_cortafuegos_activado)
        self.assertEqual(self.punto_acceso.tipo_filtrado, TipoFiltrado.LISTA_BLANCA)
        self.assertListEqual(self.punto_acceso.equipos_filtrados, [])


    def test_ssid_getter(self):
        # self.punto_acceso = PuntoAcceso('wifi_romera','12345678')
        self.assertEqual(self.punto_acceso.ssid, "wifi_romera")
    

    def test_contraseña_getter(self):
        # self.punto_acceso = PuntoAcceso('wifi_romera','12345678')
        self.assertEqual(self.punto_acceso.contraseña, "12345")


    def test_ssid_setter(self):
        # self.punto_acceso = PuntoAcceso('wifi_romera','12345678')
        self.punto_acceso.ssid = 'wifi_hernandez'
        self.assertEqual(self.punto_acceso.ssid, "wifi_hernandez")


    def test_contraseña_setter(self):
        # self.punto_acceso = PuntoAcceso('wifi_romera','12345678')
        self.punto_acceso.contraseña = '87654321'
        self.assertEqual(self.punto_acceso.contraseña, "87654321")


    def test_agregar_equipo_filtrado(self):
        self.assertListEqual(self.punto_acceso.equipos_filtrados,[])
        self.punto_acceso.agregar_equipo_filtrado('AA:AA:AA:AA:AA:AA:11')
        self.assertListEqual(self.punto_acceso.equipos_filtrados, ['AA:AA:AA:AA:AA:AA:11'])
        self.punto_acceso.agregar_equipo_filtrado('AA:AA:AA:AA:AA:AA:22')
        self.assertListEqual(self.punto_acceso.equipos_filtrados, ['AA:AA:AA:AA:AA:AA:11','AA:AA:AA:AA:AA:AA:22'])
        
    
    def test_desagredar_equipo_filtrado(self):
        self.assertListEqual(self.punto_acceso.equipos_filtrados,[])
        self.punto_acceso.agregar_equipo_filtrado('AA:AA:AA:AA:AA:AA:11')
        self.punto_acceso.desagregar_equipo_filtrado('AA:AA:AA:AA:AA:AA:11')
        self.assertListEqual(self.punto_acceso.equipos_filtrados, [])


    def test_esta_cortafuegos_activo(self):
        self.assertFalse(self.punto_acceso.esta_cortafuegos_activado)


    def test_activar_cortafuegos(self):
        self.punto_acceso.activar_cortafuegos()
        self.assertTrue(self.punto_acceso.esta_cortafuegos_activado)

    def test_desactivar_cortafuegos(self):
        self.punto_acceso.activar_cortafuegos()
        self.punto_acceso.desactivar_cortafuegos()
        self.assertFalse(self.punto_acceso.esta_cortafuegos_activado)


    def test_conectar_equipo(self):
        self.assertListEqual(self.punto_acceso.equipos_conectados, [])
        self.punto_acceso.conectar_equipo('AA:AA:AA:AA:AA:AA:11', "12345")
        self.assertListEqual(self.punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:AA:11'])
        self.punto_acceso.conectar_equipo('AA:AA:AA:AA:AA:AA:22', "12345")
        self.assertListEqual(self.punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:AA:11','AA:AA:AA:AA:AA:AA:22'])
        
        with self.assertRaises(PuntoAccesoError):
            self.punto_acceso.conectar_equipo('AA:AA:AA:AA:AA:AA:33', "6666")
        self.assertListEqual(self.punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:AA:11','AA:AA:AA:AA:AA:AA:22'])

        self.punto_acceso.activar_cortafuegos()
        self.punto_acceso.conectar_equipo('AA:AA:AA:AA:AA:AA:33', "12345")
        self.assertListEqual(self.punto_acceso.equipos_conectados, ['AA:AA:AA:AA:AA:AA:11','AA:AA:AA:AA:AA:AA:22'])



if __name__ == '__main__':
    unittest.main()