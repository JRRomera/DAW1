import unittest
from PuntoAcceso import PuntoAcceso, TipoWifi



class TestTestPuntoAcceso(unittest.TestCase):
    

    def test_init(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5])
        self.assertIsInstance(punto_acceso, PuntoAcceso)
        
        
    def test_ssid_getter(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5])
        self.assertEqual(punto_acceso.ssid, "wifi_romera")


    def test_contraseña_getter(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5,])
        self.assertEqual(punto_acceso.contraseña, "12345678")


    def test_tipoWifi_getter(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5,TipoWifi.WIFI_4])
        self.assertListEqual(punto_acceso.tiposWifi, [TipoWifi.WIFI_5, TipoWifi.WIFI_4])


    def test_ssid_setter(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5])
        punto_acceso.ssid = 'wifi_hernandez'
        self.assertEqual(punto_acceso.ssid, "wifi_hernandez")


    def test_contraseña_setter(self):
        punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5])
        punto_acceso.contraseña = '87654321'
        self.assertEqual(punto_acceso.contraseña, "87654321")


    # def test_contraseña_setter(self):
    #     punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5])
        

    # def test_tipoWifi_setter(self):
    #     punto_acceso = PuntoAcceso('wifi_romera','12345678',[TipoWifi.WIFI_5])
        









if __name__ == '__main__':
    unittest.main()