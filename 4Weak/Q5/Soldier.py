class Soldier:
    def __init__(self, name, baseAllowance):
        self.name = name
        self.baseAllowance = baseAllowance

    def __str__(self):
        return f"Soldier{{name='{self.name}', baseAllowance={self.baseAllowance}}}"

    def getName(self):
        return self.name

    def getBaseAllowance(self):
        return self.baseAllowance

    def getGrossAllowance(self):
        return self.baseAllowance
