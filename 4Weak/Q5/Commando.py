from Soldier import Soldier
class Commando(Soldier):
    def __init__(self, name, baseAllowance, vocationAllowance):
        Soldier.__init__(self, name, baseAllowance)
        self.vocationAllowance = vocationAllowance

    def getGrossAllowance(self):
        return self.baseAllowance + self.vocationAllowance

    def __str__(self):
        return f"Commando{{{Soldier.__str__(self)}, vocationAllowance={self.vocationAllowance}}}"
