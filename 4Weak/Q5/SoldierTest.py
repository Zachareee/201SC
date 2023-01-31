from Commando import Commando
from Soldier import Soldier

c = Commando("Peter", 5000, 200)
s = Soldier("John", 3000)

print(c)
print(s)

print(f"Commando's base allowance : {c.getBaseAllowance()}")
print(f"Commando's gross allowance : {c.getGrossAllowance()}")
print(f"Soldier's base allowance : {s.getBaseAllowance()}")
print(f"Soldier's base allowance : {s.getGrossAllowance()}")
