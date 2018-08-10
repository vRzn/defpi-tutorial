from abc import abstractmethod

from defpi.ConnectionHandler import ConnectionHandler, InterfaceInfo


class InflexibleControllerEfi20ConnectionHandler(ConnectionHandler):
    """ InflexibleControllerEfi20ConnectionHandler
        Abstract base class for connection handlers
        Generated by Python code generator for dEF-Pi at Aug 10, 2018, 9:05:40 AM by ?

        NOTE: This file will be overwritten when the code generator is re-run; any user-made changes will be removed.

        Template by FAN, 2017 """

    interfaceInfo = InterfaceInfo(name="Inflexible Controller",
                                  version="efi 2.0",
                                  receivesHash="2d8647b697819ff9dd7dfc4f005d580df7accfa20dc01fc39f7d1e3bc901b346",
                                  sendsHash="31fffa222831723a1b2ceaec406ed47140029d3230971c953b8857946a8fa89a",
                                  serializer="xsd")

    @abstractmethod
    def handleInflexibleRegistrationMessage(self, message): raise NotImplementedError


    @abstractmethod
    def handleInflexibleCurtailmentOptionsMessage(self, message): raise NotImplementedError


    @abstractmethod
    def handleMeasurementMessage(self, message): raise NotImplementedError

