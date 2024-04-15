import os

from OrdenadorPortatil import OrdenadorPortatil
from PuntoAcceso import PuntoAcceso, PuntoAccesoError
from Tableta import Tableta
from TelefonoInteligente import TelefonoInteligente

os.system('cls')


punto_acceso = PuntoAcceso("wifi_romera","12345")
portatil1 = OrdenadorPortatil("asus","AA:AA:AA:AA:AA:01")
portatil2 = OrdenadorPortatil("lenovo","AA:AA:AA:AA:AA:02")
movil1 = TelefonoInteligente("Xiaomi","AA:AA:AA:AA:AA:03")
tableta1 = Tableta("Samsung","AA:AA:AA:AA:AA:04")

print(portatil1)
print(portatil2)
print(movil1)
print(tableta1)


print(punto_acceso.equipos_conectados)

try:
    portatil2.conectar_a_wifi(punto_acceso,"12345")
except PuntoAccesoError as error:
    print(error)

print(punto_acceso.equipos_conectados)

try:
    portatil2.conectar_a_wifi(punto_acceso,"56543")
except PuntoAccesoError as error:
    print(error)

print(punto_acceso.equipos_conectados)




