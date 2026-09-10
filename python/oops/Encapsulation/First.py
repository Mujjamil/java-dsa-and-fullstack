#Encapsulation means it bundles data and methods together and control how internal state is accessetor modified.
class BankAccount:
    def __init__(self,balance):
        self.balance = balance

    def deposite(self,amount):
        if amount > 0 :
            self.amount += amount

    def getBalance(self):
        return self.balance